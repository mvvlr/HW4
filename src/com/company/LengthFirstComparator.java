package com.company;

import java.util.Comparator;

public class LengthFirstComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) {
            return o1.length() - o2.length();
        }
        return o1.compareTo(o2);
    }
}

