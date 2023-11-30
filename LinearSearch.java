/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

import java.util.Scanner;

/**
 *
 * @author mileidicabezas
 */
public class LinearSearch {
  
    public static int linearSearch(String[] arr,String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    
}


