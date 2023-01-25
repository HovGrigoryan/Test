package designPattern.flyweight;

import java.util.List;

public class MainApp {

    private static final int BOOK_TYPES = 2;
    private static final int BOOK_TO_INSERT = 10_000_000;

    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < BOOK_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook("Avetiq", 20.1, "Action", "Follet", "Stuff");
            store.storeBook("AgataQristi", 10.2, "Fantasy", "Ingram", "Extra");
        }

        System.out.println(BOOK_TO_INSERT + "Books Inserted");
        System.out.println("=========================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOK_TO_INSERT + " BookTypes Size (30 bytes) * " + BOOK_TYPES);
        System.out.println("=========================");
    }
}
