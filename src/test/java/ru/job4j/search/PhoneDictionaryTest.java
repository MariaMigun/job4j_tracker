package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maria", "Migunova", "112233", "Ufa")
        );
        ArrayList<Person> persons = phones.find("Ma");
        assertThat(persons.get(0).getName(), is("Maria"));
    }

    @Test
    public void whenFindBySurame() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maria", "Migunova", "112233", "Ufa")
        );
        ArrayList<Person> persons = phones.find("ova");
        assertThat(persons.get(0).getSurname(), is("Migunova"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maria", "Migunova", "112233", "Ufa")
        );
        ArrayList<Person> persons = phones.find("23");
        assertThat(persons.get(0).getPhone(), is("112233"));
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maria", "Migunova", "112233", "Ufa")
        );
        ArrayList<Person> persons = phones.find("f");
        assertThat(persons.get(0).getAddress(), is("Ufa"));
    }

    @Test
    public void whenNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maria", "Migunova", "112233", "Ufa")
        );
        ArrayList<Person> persons = phones.find("zer");
        assertThat(persons.size(), is(0));
    }
}