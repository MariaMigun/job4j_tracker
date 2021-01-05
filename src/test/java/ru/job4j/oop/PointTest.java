package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when111334then5() {
        Point p = new Point(1, 1, 1);
        Point d = new Point(3, 3, 4);
        int expect = 4;
        int dist3d = (int) p.distance3d(d);
        assertThat(dist3d, is(expect));
    }
}