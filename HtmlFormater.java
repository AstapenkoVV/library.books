package ru.gb.oop.z6.library;

public class HtmlFormater implements Formatter{
    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getName() + " переведена в формат HTML ");
    }
}
