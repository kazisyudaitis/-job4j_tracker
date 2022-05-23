package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\. Task.");
        String[] rightStr = right.split("\\. Task.");
        return  Integer.compare(Integer.parseInt(leftStr[0]), Integer.parseInt(rightStr[0]));
    }
}
