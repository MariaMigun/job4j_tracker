package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Students student = new Students();
        student.setName("Maria Migunova");
        student.setGroup("IIT-111");
        student.setEntering(new Date());
        System.out.println(student.getName() + "from group " + student.getGroup()
                + " entered on " + student.getEntering());
    }
}
