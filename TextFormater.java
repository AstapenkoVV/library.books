package ru.gb.oop.z6.library;

public class TextFormater implements Formatter {
    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getTitle() + " переведена в формат txt ");
    }
}
