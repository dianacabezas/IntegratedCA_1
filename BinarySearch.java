/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

import java.util.NoSuchElementException;

/**
 *
 * @author mileidicabezas
 */
public class BinarySearch {
public static int binarySearch(String[] arr, String target) {
   int left = 0;
        int right = arr.length - 1;

        try{
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int compareResult = target.compareTo(arr[mid]);

            if (compareResult == 0) {
                return mid; // Found the book title
            } else if (compareResult < 0) {
                right = mid - 1; // Adjust the search range
            } else {
                left = mid + 1; // Adjust the search range
            }
        }
      }catch(NoSuchElementException e){
      System.err.println("Element not found");
      }

        return -1; // Book title not found
    } 
    
}


