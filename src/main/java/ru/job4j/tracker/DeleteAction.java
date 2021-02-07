package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        boolean rsl = tracker.delete(id);
        if(rsl){
            System.out.println("Удален элемент ");
        }
        else {
            System.out.println("Удаления не произошло");
        }
        return true;
    }
}
