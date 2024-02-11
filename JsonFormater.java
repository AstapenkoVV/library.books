package ru.gb.oop.z6.library;

public class JsonFormater implements Formatter{


    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getTitle() + " переведена в формат Json ");
    }
}
