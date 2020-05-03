package com.shashank.searchingAlgorithms;

import arrayUtils.ArrayPrinter;

public class Driver {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] inputArray = {10, 20, 35, 89, 100};
        System.out.println("For the array = " +  ArrayPrinter.print1dArray(inputArray));
        System.out.println("20 is in position = " + binarySearch.binarySearch(inputArray,20));
    }
}
