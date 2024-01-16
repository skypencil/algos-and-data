package org.main;

import org.fivesort.FiveSort;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(5, 2, 5, 6, 2, 1, 10, 5, 5, 5));
        FiveSort.fiveSort(array);
    }
}