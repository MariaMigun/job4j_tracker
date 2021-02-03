package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    private void showMenu() {
        System.out.println("Menu.");
        /* добавить остальные пункты меню. */
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.print("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                Item it = tracker.add(item);
                System.out.println("Добавили элемент " + name + "Массив : " + it.toString());

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] item = tracker.findAll();
                System.out.println(item.toString());
            }
            if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());

                tracker.findById(id);
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
            if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                boolean rsl = tracker.delete(id);
                if(rsl){
                    System.out.println("Удален элемент ");
                }
                else {
                    System.out.println("Удаления не произошло");
                }
            }
            if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item == null){
                    System.out.println("Заявка по ID не найдена");
                }
                else {
                    System.out.println(item.toString());
                }
            }
            if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                if (item.length > 0){
                    for (int i = 0; i < item.length; i++){
                        System.out.println(item[i].toString());
                    }
                }
                else {
                    System.out.println("Заявки по имени не найдены");
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
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
