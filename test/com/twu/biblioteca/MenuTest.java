package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class MenuTest {

    @Test
    public void shouldShowMainMenu() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Menu menu = new Menu();
        menu.showMainMenu();
        assertThat(outContent.toString(), containsString(menu.menuOptions));
    }

    @Test
    public void selectOptionMustBe1WhenUserSelect1() {
        String data = "1";
        final ByteArrayInputStream inputContent = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputContent);
        Menu menu = new Menu();
        menu.selectOption();
        assertEquals(data, menu.selectedOption);
    }

    @Test
    public void shouldShowMenuWhenSelectedOptionIs1() {
        String data = "1";
        final ByteArrayInputStream inputContent = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputContent);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Menu menu = new Menu();
        menu.selectOption();
        assertEquals("Enter the number of your choice:\nAuthor: A - Year Published: 2015\n" + "Author: B - Year Published: 2019\n", outContent.toString());
    }

    @Test
    public void shouldShowMessageWhenChooseInvalidOption() {
        String data = "2";
        final ByteArrayInputStream inputContent = new ByteArrayInputStream(data.getBytes());
        System.setIn(inputContent);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Menu menu = new Menu();
        menu.selectOption();
        assertEquals("Enter the number of your choice:\nPlease select a valid option!\n", outContent.toString());
    }

}