package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Сказки", 5);
        Book book2 = new Book("Clean code", 98);
        Book book3 = new Book("Рассказ", 12);
        Book book4 = new Book("Повесть", 53);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bookIndex = books[i];
            System.out.println(bookIndex.getName() + " Количество страниц " + bookIndex.getCountOfPages());
        }
        System.out.println("Replace book3 to book1");
        books[0] = book3;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book bookIndex = books[i];
            System.out.println(bookIndex.getName() + " Количество страниц " + bookIndex.getCountOfPages());
        }
        System.out.println("Print book Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bookIndex = books[i];
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(bookIndex.getName() + " Количество страниц " + bookIndex.getCountOfPages());
            }
        }

    }
}
