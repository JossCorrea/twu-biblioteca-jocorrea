package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldTurnIsAvaibleFalse() {
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
}