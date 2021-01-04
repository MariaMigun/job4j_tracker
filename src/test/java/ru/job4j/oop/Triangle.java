package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean exists = false;
        if (((ab + bc) > ac) && ((ac + bc) > ab) && ((ab + ac) > bc)) {
            exists = true;
        }
            return exists;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            double pabc = (p - ab) * (p - bc) * (p - ac);
            rsl = sqrt(p * pabc);
        }
        return rsl;
    }
}