package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.junit.Test;
import java.util.Arrays;
import java.util.Objects;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void findAllAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        String is = System.lineSeparator();
        Item item1 = new Item();
        item1.setName("Item name1");
        Item item2 = new Item();
        item2.setName("Item name2");
        tracker.add(item1);
        tracker.add(item2);
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, Arrays.asList(actions));
        assertThat(output.toString(),
                is("Menu." + is + "0. === Show all items ===" + is + "1. Exit" + is + item1 + is + item2 + is + "Menu." + is + "0. === Show all items ===" + is + "1. Exit" + is));
    }


    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, Arrays.asList(actions));
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "New item name", "1"}
        );
        UserAction[] actions = {
                new EditAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, Arrays.asList(actions));

        assertThat(Objects.requireNonNull(tracker.findById(item.getId())).getName(),
                is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        UserAction[] actions = {
                new DeleteAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, Arrays.asList(actions));
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }


    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}