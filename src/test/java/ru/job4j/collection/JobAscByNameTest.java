package ru.job4j.collection;


import junit.framework.TestCase;
import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class JobAscByNameTest  {

    @Test
    public void whenCompAscByName(){
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, is(3));
    }
}