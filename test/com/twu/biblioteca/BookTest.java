package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.twu.biblioteca.Constants.*;
import static org.junit.Assert.*;


public class BookTest {

    @Test
    public void shouldTurnIsAvailableFalseWhenCheckout() {
        Book book = new Book("Book test",2020);
        book.checkoutBook();

        assertEquals(false, book.isAvailable());
    }

    @Test
    public void shouldShowSuccessMessageWhenCheckoutBook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Book book = new Book("Book test",2020);
        book.checkoutBook();

        assertEquals(CHECKOUT_SUCCESS_MESSAGE + "\n",outContent.toString());
    }

    @Test
    public void shouldShowUnSuccessfulMessageWhenCheckoutBook() {
        Book book = new Book("Book test", 2020);
        book.checkoutBook();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        book.checkoutBook();

        assertEquals(CHECKOUT_UNSUCCESSFUL_MESSAGE + "\n", outContent.toString());
    }

    @Test
    public void shouldTurnIsAvailableTrueWhenReturn() {
        Book book = new Book("Book test",2020);
        book.checkoutBook();
        book.returnBook();

        assertEquals(true, book.isAvailable());
    }

    @Test
    public void shouldShowSuccessMessageWhenReturnBook() {
        Book book = new Book("Book test",2020);
        book.checkoutBook();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        book.returnBook();

        assertEquals( RETURN_SUCCESS_MESSAGE + "\n",outContent.toString());
    }

    @Test
    public void shouldShowUnSuccessfulMessageWhenReturnBook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Book book = new Book("Book test", 2020);
        book.returnBook();

        assertEquals(RETURN_UNSUCCESSFUL_MESSAGE + "\n", outContent.toString());
    }

}