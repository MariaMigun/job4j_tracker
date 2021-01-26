package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 100);
        Book bookTwo = new Book("Big Ban", 120);
        Book bookThree = new Book("War and peace", 1000);
        Book bookFour = new Book("Three fat guys", 200);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            System.out.println(bk.getName() + "- " + bk.getCount());
        }
        System.out.println("Replace 0 and 3.");
        Book reserv = new Book("ss", 1);
        reserv = books[0];
        books[0] = books[3];
        books[3] = reserv;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + "- " + bk.getCount());
        }
        System.out.println("Books named  Clean code: ");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")){
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
