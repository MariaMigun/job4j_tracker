package ru.job4j.search;
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for(Person value : persons){
            if ((value.getName().contains(key) || value.getSurname().contains(key)
                    || value.getPhone().contains(key)
                    || value.getAddress().contains(key))){
                result.add(value);
                System.out.println(value);
            } else {
                System.out.println("not found");
            }
        }
        return result;
    }

    /*public static void main(String[] args) {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Maria", "Migunova", "112233", "Ufa"));
        phone.find("212");
        System.out.println();
        phone.find("ova");
    }*/
}
