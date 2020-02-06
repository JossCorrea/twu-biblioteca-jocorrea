package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.CoreMatchers.containsString;
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
}
