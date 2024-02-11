package ru.gb.oop.z6.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Librarys implements Searchable, LibraryManager{
    private List<Book> books;

    public Librarys() {
        books = fullBook();
    }

    private List<Book> fullBook(){
        List<Book> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(new Book(
                    "Метель",
                    "Пушкин А.С.",
                    new Random().nextInt(100),
                    new BookGenre("Любовный роман")));
        }
        return res;
    }


    @Override
    public List<Book> bySeaechable(String byAuthor) {
        List<Book> res = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(byAuthor)) {
                res.add(book);
            }
        }
        return res;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);

    }
}
