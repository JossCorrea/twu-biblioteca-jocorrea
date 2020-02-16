package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static com.twu.biblioteca.Constants.WELCOME_MESSAGE;


public class BibliotecaAppTest {

    @Test
    public void shouldShowWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp.showWelcomeMessage();
        assertEquals(WELCOME_MESSAGE + "\n",outContent.toString());
    }
}
// Kudos to Marcio and Matheus