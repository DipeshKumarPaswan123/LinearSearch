package com.anonymous.p1;

/**
 * This class implements a simple Linear Search algorithm.
 *   The purpose of this class is to demonstrate how to search for a target element
 *  in an array by checking each element sequentially.
 *
 * @author DIPESH
 * @date 9/14/2024
 */
public class LinearSearch {
    public static int linearSearch(int number[], int key) {
        for(int i = 0; i < number.length; i++) {
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = linearSearch(number, key);
        if(index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Key found at: " + index);
        }
    }
}