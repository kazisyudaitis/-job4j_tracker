package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            } else if (i == value.length - 1 && rsl == -1) {
                throw new ElementNotFoundException("Element not found in array");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"1", "2", "3"}, "3");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
