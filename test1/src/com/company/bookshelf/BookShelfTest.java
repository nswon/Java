package com.company.bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("강서구 1");
        shelfQueue.enQueue("강서구 2");
        shelfQueue.enQueue("강서구 3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
