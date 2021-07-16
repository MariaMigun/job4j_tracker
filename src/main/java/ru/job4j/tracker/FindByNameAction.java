package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        List<Item> item = tracker.findByName(name);
        if (item.size() > 0) {
            for (int i = 0; i < item.size(); i++) {
                System.out.println(item.get(i));
            }
        } else {
            System.out.println("Заявки по имени не найдены");
        }
        return true;
    }
}
