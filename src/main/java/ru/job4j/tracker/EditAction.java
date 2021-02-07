package ru.job4j.tracker;

public class EditAction implements UserAction{
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ====");
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
