package com.shashank.searchingAlgorithms;

public class BinarySearch {

    public int binarySearch(int[] inputArray, int key){
        int length = inputArray.length;
        int low = 0;
        int high = length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(inputArray[mid] == key){
                return mid + 1;
            }
            else if(key > inputArray[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
