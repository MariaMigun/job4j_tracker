package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for(int i = 0; i < item.length; i++) {
            System.out.println(item[i].toString());
        }
        return true;
    }
}
