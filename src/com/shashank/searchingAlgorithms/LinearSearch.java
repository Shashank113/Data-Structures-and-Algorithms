package com.shashank.searchingAlgorithms;

public class LinearSearch {

    public int linearSearch(int[] inputArray, int key){
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] == key){
                return i + 1;
            }
        }
        return -1;
    }
}
