package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class BibliotecaAppTest {

    @Test
    public void shouldShowWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp.main("");
        assertThat(outContent.toString(), containsString("Hello, you are welcome to Biblioteca!"));
    }
}