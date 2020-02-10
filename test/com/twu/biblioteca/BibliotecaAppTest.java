package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class BibliotecaAppTest {

    @Test
    public void shouldShowWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp.showWelcomeMessage();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book in Bangalore!\n",outContent.toString());
    }

    @Test
    public void shouldShowListOfBooks() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp.showBookList();
        assertEquals("Author: A - Year Published: 2015\n" + "Author: B - Year Published: 2019\n",outContent.toString());
    }
}