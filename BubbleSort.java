/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

/**
 *
 * @author mileidicabezas
 */
public class BubbleSort {
    
    
    //Main method
    public static void bubbleSortIntAsc(int[] arr, String[] str_arr){
    
    int n= arr.length;
    
    //Switch on
    boolean swapped;
    
    //do block
    do{
    swapped=false;
    //loop the array
    //atarting at position 1
    //value here is 9
    for(int i=1;i<n;i++){
        //assess the index items
        // if the item before the index i (that starts at 1)
        // is bigger than the element in the index of i
        //or the proceeding element that is after i
        //index 0 or arr[i-1]==12
   
    if(arr[i-1]> arr[i]){
        
        //assing it to the element of i in the temp array
        //assing the element value 12 at index 1 to the array
       int temp= arr[i-1];
       //assing the value 9 that was in index 1 to the index 0
      arr[i-1] =arr[i];
      
      
      arr[i]=temp;
      
          String temp_str = str_arr[i];
          str_arr[i] = str_arr[i-1];
          str_arr[i-1] = temp_str;
      
      swapped=true;
    
    }
    }
    
    
    }
    //while swapped is true
    while(swapped==true);
    }
    
    
    public static void bubbleSortIntDesc(int[] arr, String[] str_arr){
    
    int n= arr.length;
    
    //Switch on
    boolean swapped;
    
    //do block
    do{
    swapped=false;
    //loop the array
    //atarting at position 1
    //value here is 9
    for(int i=1;i<n;i++){
        //assess the index items
        // if the item before the index i (that starts at 1)
        // is bigger than the element in the index of i
        //or the proceeding element that is after i
        //index 0 or arr[i-1]==12
   
        if(arr[i-1]< arr[i]){

            //assing it to the element of i in the temp array
            //assing the element value 12 at index 1 to the array
           int temp= arr[i-1];
           //assing the value 9 that was in index 1 to the index 0
          arr[i-1] =arr[i];


          arr[i]=temp;

          String temp_str = str_arr[i];
          str_arr[i] = str_arr[i-1];
          str_arr[i-1] = temp_str;

          swapped=true;

        }
    }
    
    
    }
    //while swapped is true
    while(swapped==true);
    }
    
    
    //Main method
    public static void bubblesortStringsAsc(String[] string_arr, int [] num_array)
    {
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j <string_arr.length- 1; j++) {
            for (int i = j + 1; i < string_arr.length; i++) {
                if (string_arr[j].compareTo(string_arr[i]) > 0) {
                    temp = string_arr[j];
                    string_arr[j] = string_arr[i];
                   string_arr[i] = temp;
                   
                   int temp_num = num_array[j];
                   num_array[j] = num_array[i];
                   num_array[i] = temp_num;
                    
                    
                    
                }
            }
        }
        
        
        
        
    }
    
    
    
    
    //Main method
    public static void bubblesortStringsDesc(String[] string_arr, int [] num_array)
    {
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j <string_arr.length- 1; j++) {
            for (int i = j + 1; i < string_arr.length; i++) {
                if (string_arr[j].compareTo(string_arr[i]) < 0) {
                    temp = string_arr[j];
                    string_arr[j] = string_arr[i];
                   string_arr[i] = temp;
                   
                   int temp_num = num_array[j];
                   num_array[j] = num_array[i];
                   num_array[i] = temp_num;
                    
                    
                    
                }
            }
        }
        
        
        
        
    }
    
    
    
}
