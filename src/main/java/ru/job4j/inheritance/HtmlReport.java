package ru.job4j.inheritance;

public class HtmlReport extends TextReport {
    public String genreate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}