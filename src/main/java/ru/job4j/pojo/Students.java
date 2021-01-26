package ru.job4j.pojo;
import java.util.Date;

public class Students {
    private String name;
    private String group;
    private Date entering;

    public Date getEntering() {
        return entering;
    }

    public void setEntering(Date data) {
        this.entering = data;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
