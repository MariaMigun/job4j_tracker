package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0){
            for (int i = 0; i < item.length; i++){
                System.out.println(item[i].toString());
            }
        }
        else {
            System.out.println("Заявки по имени не найдены");
        }
        return true;
    }
}
