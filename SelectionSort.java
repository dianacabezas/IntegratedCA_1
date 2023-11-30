/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

/**
 *
 * @author mileidicabezas
 */
public class SelectionSort {
    
    
    public static void selectionSortIntAsc(String[] str_arr,int[] arr){
        /* array is of length 10*/
        /*assign the length of the array to n*/
        int n = arr.length;
        /* i is 0 => 12*/
        for(int i = 0; i < n-1; i++){
            /* create a minimum index placeholder*/
            /*minIndex is at 0 here*/
            int minIndex = i;
            /*create a second index j and increment ahead of i*/
            /* j is nopw at index i +1 which is 0+1=1*/
            /*j=1*/
            for(int j = i +1; j<n; j++){
              /* aar[j][ check if its smaller than the minimum index of the array*/
              /* check if the previous element that is the minimum index value*/
              /*against the proceeding element j at index min+1*/
              /*If the minimum index value is bigger than the element after it*/
              /*the value of j at index j => arr[j] => 5*/
                if(arr[j] < arr[minIndex]){
                    /*assign the value of the index j as the minimum index value of the array*/
                    /* overwrite the value at index i=> the minimum index value*/
                    minIndex = j;
                }
            }
            /*create a temporary array and assign the value of the proceeding element*/
            int temp = arr[i];
            /*reassign the value of the minimum index to i to keep moving forward*/
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
            
            
        }  
    
    }
   
    
   public static void selectionSortIntDesc(String[] str_arr,int[] arr){
        /* array is of length 10*/
        /*assign the length of the array to n*/
        int n = arr.length;
        /* i is 0 => 12*/
        for(int i = 0; i < n-1; i++){
            /* create a minimum index placeholder*/
            /*minIndex is at 0 here*/
            int minIndex = i;
            /*create a second index j and increment ahead of i*/
            /* j is nopw at index i +1 which is 0+1=1*/
            /*j=1*/
            for(int j = i +1; j<n; j++){
              /* aar[j][ check if its smaller than the minimum index of the array*/
              /* check if the previous element that is the minimum index value*/
              /*against the proceeding element j at index min+1*/
              /*If the minimum index value is bigger than the element after it*/
              /*the value of j at index j => arr[j] => 5*/
                if(arr[j] > arr[minIndex]){
                    /*assign the value of the index j as the minimum index value of the array*/
                    /* overwrite the value at index i=> the minimum index value*/
                    minIndex = j;
                }
            }
            /*create a temporary array and assign the value of the proceeding element*/
            int temp = arr[i];
            /*reassign the value of the minimum index to i to keep moving forward*/
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
            
            
        }  
    
    }
   
    
    
    
    
    public static void selectionSortStringAsc( String[] str_array, int[] num_array )
  {
    
    // Find the string reference that should go in each cell of
    // the array, from cell 0 to the end
    for ( int j=0; j < str_array.length-1; j++ )
    {
      // Find min: the index of the string reference that should go into cell j.
      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
      int min = j;
      for ( int k=j+1; k < str_array.length; k++ )
        if ( str_array[k].compareTo( str_array[min] ) < 0 ) min = k;  

      // Swap the reference at j with the reference at min 
      String temp = str_array[j];
      str_array[j] = str_array[min];
      str_array[min] = temp;
      
      int temp_num = num_array[j];
      num_array[j] = num_array[min];
      num_array[min] = temp_num;
    }
  
  }
    
    
     public static void selectionSortStringDesc( String[] str_array, int[] num_array)
  {
    
    // Find the string reference that should go in each cell of
    // the array, from cell 0 to the end
    for ( int j=0; j < str_array.length-1; j++ )
    {
      // Find min: the index of the string reference that should go into cell j.
      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
      int min = j;
      for ( int k=j+1; k < str_array.length; k++ )
        if ( str_array[k].compareTo( str_array[min] ) > 0 ) min = k;  

      // Swap the reference at j with the reference at min 
      String temp = str_array[j];
      str_array[j] = str_array[min];
      str_array[min] = temp;
      
      int temp_num = num_array[j];
      num_array[j] = num_array[min];
      num_array[min] = temp_num;
    
    }
  
  }
}
    
    

