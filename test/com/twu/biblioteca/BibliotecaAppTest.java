package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void shouldShowWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp.showWelcomeMessage();
        assertEquals("Hello, you are welcome to Biblioteca!\n",outContent.toString());
    }
}