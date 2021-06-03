package ru.job4j.collection;

import org.junit.Test;
import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest extends TestCase {

    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    public void testGet() {
    }
}




