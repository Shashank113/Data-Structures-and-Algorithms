package com.shashank.searchingAlgorithms;

public class LinearSearch {

    public int linearSearch(int[] inputArray, int key){
        for(int position = 0; position < inputArray.length; i++){
            if(inputArray[position] == key){
                return position + 1;
            }
        }
        return -1;
    }
}
