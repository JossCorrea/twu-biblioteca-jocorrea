package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldTurnIsAvailableFalse() {
        Book book = new Book("Book test",2020);
        book.checkOutBook();

        assertEquals(false, equals(book.isAvailable));
    }

    @Test
    public void shouldShowSuccessMessageWhenCheckOutBook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Book book = new Book("Book test",2020);
        book.checkOutBook();

        assertEquals("Thank you! Enjoy the book\n",outContent.toString());
    }

    @Test
    public void shouldShowUnSuccessfulMessageWhenCheckOutBook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Book book = new Book("Book test", 2020);
        book.isAvailable = false;
        book.checkOutBook();

        assertEquals("Sorry, that book is not available\n", outContent.toString());
    }
}