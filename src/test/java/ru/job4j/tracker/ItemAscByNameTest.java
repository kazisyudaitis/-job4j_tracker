package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.collection.NotifyAccount;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Ivan"),
                new Item("Petr"),
                new Item("Alex")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Alex"),
                new Item("Ivan"),
                new Item("Petr")
        );
        assertThat(items, is(expected));
    }
}