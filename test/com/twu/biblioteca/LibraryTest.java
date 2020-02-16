package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class LibraryTest {
    @Before
    public void loadData(){
        Library.bookList = new ArrayList<>();
        Library.loadDataBooklist();
    }

    @Test
    public void showBookList() {
        String expectedResult = "----------------------------------------------------------------------------------\n" +
                "BOOK LIST : \n\n";
        for (Book book: Library.bookList) {
            expectedResult += book.toString() + "\n";
        }

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Library.showBookList();

        assertEquals(expectedResult,outContent.toString());
    }

    @Test
    public void showBookListWithoutCheckoutBook() {
        Book bookItem = Library.bookList.get(1);
        bookItem.checkoutBook();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedResult = "----------------------------------------------------------------------------------\n" +
                "BOOK LIST : \n\n";
        for (Book book : Library.bookList) {
            if (book.isAvailable()) {
                expectedResult += book.toString() + "\n";
            }
        }

        Library.showBookList();
        assertEquals(expectedResult,outContent.toString());
    }

    @Test
    public void showBookListWithReturnedBook() {
        Book bookItem = Library.bookList.get(1);
        bookItem.checkoutBook();
        bookItem.returnBook();

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedResult = "----------------------------------------------------------------------------------\n" +
                "BOOK LIST : \n\n";
        for (Book book : Library.bookList) {
            if (book.isAvailable()) {
                expectedResult += book.toString() + "\n";
            }
        }

        Library.showBookList();
        assertEquals(expectedResult,outContent.toString());
    }
}