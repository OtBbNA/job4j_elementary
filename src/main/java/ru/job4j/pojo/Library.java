package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Solonci", 85);
        Book book2 = new Book("Dersu Uzala", 465);
        Book book3 = new Book("Clean code", 100);
        Book book4 = new Book("I dolshe veka dlitsya den", 360);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk =  books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        }
        books[0] = book4;
        books[3] = book1;
        System.out.println("_____________________");
        for (int i = 0; i < books.length; i++) {
            Book bk =  books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        }
        System.out.println("_____________________");
        for (int i = 0; i < books.length; i++) {
            Book bk =  books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
            }
        }
    }
}
