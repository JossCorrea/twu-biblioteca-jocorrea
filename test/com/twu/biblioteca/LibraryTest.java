package com.twu.biblioteca;

        import org.junit.Test;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void showBookList() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library.showBookList();
        assertEquals("Author: A - Year Published: 2015\n" + "Author: B - Year Published: 2019\n",outContent.toString());
    }
}