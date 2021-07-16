package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
      /*  out.println("=== Show all items ====");*/
        List<Item> item = tracker.findAll();
        for (Item elem : item) {
        /*for(int i = 0; i < item.size(); i++) {*/
           /* System.out.println(elem);*/
            out.println(elem);
        }
        return true;
    }
}
