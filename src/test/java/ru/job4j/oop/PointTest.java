package ru.job4j.oop;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void when111334then5() {
        Point p = new Point(1, 1, 1);
        int dist3d = p.distance3d(3, 3, 4);
        assertThat(dist3d, is(5));
    }
}