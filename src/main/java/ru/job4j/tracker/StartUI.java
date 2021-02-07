package ru.job4j.tracker;



public class StartUI {
    /*public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        Item it = tracker.add(item);
        System.out.println("Добавили элемент " + name + "Массив : " + it.toString());
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        System.out.print("Enter id: ");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        boolean rsl = tracker.delete(id);
        if(rsl){
            System.out.println("Удален элемент ");
        }
        else {
            System.out.println("Удаления не произошло");
        }
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] item = tracker.findAll();
        for(int i = 0; i < item.length; i++) {
            System.out.println(item[i].toString());
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        System.out.print("Enter id: ");
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item == null){
            System.out.println("Заявка по ID не найдена");
        }
        else {
            System.out.println(item.toString());
        }
    }*/

   /* public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
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
    }*/


    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
        /* добавить остальные пункты меню. */
        /*System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.print("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");*/
    }

    public void init(Input input, Tracker tracker,UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
            /*System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            }
            if (select == 2) {
                StartUI.replaceItem(input, tracker);
            }
            if (select == 3) {
                StartUI.deleteItem(input, tracker);
            }
            if (select == 4) {
                StartUI.findItemById(input, tracker);
            }
            if (select == 5) {
                StartUI.findItemByName(input, tracker);
            }
            else if (select == 6) {
                run = false;
            }*/
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new EditAction(),
                new DeleteAction(),
                new ShowAllAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new Exit()
        };
        new StartUI().init(input, tracker, actions);
    }

   /* public static void main(String[] args) {
        Item item = new Item ();
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println("Текущие дата и время после форматирования: " + item.getCreated().format(formatter));*/
        /*Tracker track = new Tracker();
        track.add(item);
        System.out.println("ID элемента: " + track.findById(item.getId()));
        System.out.println(item);
    }*/
}
