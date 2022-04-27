package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> textSp = new HashSet<>();
        for (String str : origin) {
            textSp.add(str);
        }
        for (String str1 : text) {
            if (!textSp.contains(str1)) {
                rsl = false;
            }
        }
        return rsl;
    }
}
