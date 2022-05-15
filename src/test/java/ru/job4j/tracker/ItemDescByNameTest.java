package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Alex")
        );
        Collections.sort(items, new ItemDescByName().reversed());
        List<Item> expected = Arrays.asList(
                new Item("Petr"),
                new Item("Ivan"),
                new Item("Alex")
        );
        assertThat(items, is(expected));
    }
}