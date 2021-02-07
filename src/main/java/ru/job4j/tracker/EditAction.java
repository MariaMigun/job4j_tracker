package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter id: ");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        tracker.findById(id);
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        boolean rsl = tracker.replace(id,item);
        if (rsl){
            System.out.println("Замена прошла успешно");
        }
        else {
            System.out.println("Замена не удалась");
        }
        return true;
    }
}
