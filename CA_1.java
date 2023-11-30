/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca_1;
import static ca_1.SelectionSort.selectionSortStringAsc;
import static ca_1.SelectionSort.selectionSortStringDesc;
import static ca_1.SelectionSort.selectionSortIntAsc;
import static ca_1.SelectionSort.selectionSortIntDesc;
import static ca_1.BubbleSort.bubblesortStringsAsc;
import static ca_1.BubbleSort.bubblesortStringsDesc;
import static ca_1.BubbleSort.bubbleSortIntAsc;
import static ca_1.BubbleSort.bubbleSortIntDesc;
import static ca_1.LinearSearch.linearSearch;
import static ca_1.BinarySearch.binarySearch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.String;

/**
 *
 * @author mileidicabezas
 */
public class CA_1 {
 //This method will allow printing of the arrays
   public static void printArray(String[] str_arr, int[] num_arr, int limit)
   {
       
       if(limit > str_arr.length)
       {
           limit=str_arr.length;
       }
       for(int i = 0; i < limit; i++)
       {
           System.out.println(str_arr[i]+", "+num_arr[i]);
       }
   }
    
    
    // to handle exceptions include throws
    public static void main(String[] args) throws IOException{
  
  File file = null;
  

  Scanner input = new Scanner (System.in);
  
  do{
  
  System.out.println("Enter the name of your file (including file extension): ");
  String filename = input.next();
  
        file = new File(filename);

            if (!file.exists() || !file.isFile()) {
                System.out.println("File not found. ");
            }
        } while (!file.exists() || !file.isFile());
  
  
  List<String> words = new ArrayList<>();
  List<Integer> numbers = new ArrayList<>();
  
   try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
  /*
   *  Create a new Scanner object which will read the data from the file passed in. 
   * While there are ints left in the file (i.e. while scanner.hasNextInt() is true), 
   * keep reading them.
   * 
   * More hasNext options are available from the API
   //aqui va el cierre de el comentario*/
  

  
                
  
  
        
        String line = "";
        
        while ((line = reader.readLine()) != null) {
                System.out.println("File found succesfully!");
                
        
        boolean end_of_file=false;
        while (!end_of_file) {
            line = reader.readLine();
            if(line == null)
            {
                end_of_file = true;
            }else{
                String[] tokens = line.split(",");
                int tokens_len = tokens.length;
                
                //Takes last part of string as the page number
                numbers.add(Integer.parseInt(tokens[tokens_len - 1]));
                
                //This loop assembles the rest of the parts as the book title
                //except the last one
                String title ="";
                for(int l = 0;l < tokens_len-1;l++)
                {
                    title += tokens[l];
                    
                }
                words.add(title);
            }//else
        }
      }
    } catch (FileNotFoundException e) 
   {
   System.out.println("That file was not found. Program terminating...");

}

    //This hold the titles
    String[] arrWords = words.toArray(new String[]{});
    //int[] arrNums = numbers.toArray(new int[]{});
    int[] arrNums = new int[numbers.size()];
    for(int n = 0; n < numbers.size(); n++)
    {
        arrNums[n] = numbers.get(n);
    }
    
    //thid loop will concatenate the Arrays so they print at the same time
    //for(int i=0;i<arrWords.length;i++){
       // System.out.println(arrWords[i] +" , "+ arrNums[i]);
        
    //}
      
//////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    




Scanner sc = new Scanner(System.in);
    int option, subOption;

    do {
        System.out.println("---------------Main Menu:--------------");
        System.out.println("What do you wat to do? ");
        System.out.println("1. Sort");
        System.out.println("2. Search");
        System.out.println("3. Exit");
        System.out.println("Enter your option [1,2,3]:");
        System.out.println();
        option = sc.nextInt();
        System.out.println("=========================================");
        System.out.println();

        switch (option) {
        case 1: {

            do {
                System.out.println("=========================================");
                System.out.println("Sort Sub-Menu:");
                System.out.println("1. Sort by Book Title");
                System.out.println("2. Sort By number of pages");
                System.out.println("3. Exit");
                System.out.println("Enter your option [1,2,3]:");
                System.out.println();
                subOption = sc.nextInt();
                System.out.println("=========================================");
                System.out.println();

                switch (subOption) {
                case 1: {

                     do {
                         System.out.println("=========================================");
                        System.out.println("In what order do you want the titles to be sorted?");
                        System.out.println("1. Ascending");
                        System.out.println("2. Descending");
                        System.out.println("3. Exit");
                        System.out.println("Enter your option [1,2,3]:");
                        System.out.println();
                        System.out.println("=========================================");
                        subOption = sc.nextInt();

                        switch (subOption) {
                        case 1: {
                            System.out.println("=========================================");
                            System.out.println("ARRAY SORTED IN ASCENDING ORDER BY TITLE ");
                            System.out.println("=========================================");
                            ////////////////Bubble sort///////////////////////////////
                            
                             long startTime = System.nanoTime(); // Capture the start time
                            
                             bubblesortStringsAsc(arrWords, arrNums);
                            
                            long endTime = System.nanoTime(); // Capture the end time

                            long duration = endTime - startTime; // Calculate the elapsed time

                            double milliseconds = duration / 1e6; // Convert nanoseconds to milliseconds

                            
                            
                            ////////////////Selection Sort//////////////////////////////
                            
                            long startTimes = System.nanoTime(); // Capture the start time
    
                            selectionSortStringAsc(arrWords, arrNums);
                            
                            printArray(arrWords, arrNums, 50);
                            
                            long endTimes = System.nanoTime(); // Capture the end time

                            long durations = endTimes - startTimes; // Calculate the elapsed time

                            double millisecondsS = durations / 1e6; // Convert nanoseconds to milliseconds
                            
                            
                            
                            
                            //This is goint to print the time taken by the two sorting arrays
                            System.out.println("=========================================");
                            System.out.println("Time taken by bubble sort algorithm: " + milliseconds + " milliseconds");

                            System.out.println("Time taken by selection sort algorithm: " + millisecondsS + " milliseconds");
                            System.out.println("=========================================");
                            
                            
                            if(milliseconds<millisecondsS){
                                System.out.println("Bubble sort is faster");
                            }else{System.out.println("Selection sort is faster");}
                            
                            
                            break;
                        }
                        
                        case 2: {
                            System.out.println("=========================================");
                            System.out.println("ARRAY SORTED IN DESCENDING ORDER BY TITLE ");
                            System.out.println("=========================================");
                            /////////////////////Bubble sort//////////////////////////////////
                            
                            long startTimeB = System.nanoTime(); // Capture the start time
                            
                             bubblesortStringsDesc(arrWords, arrNums);
                            
                            long endTimeB = System.nanoTime(); // Capture the end time

                            long durationB = endTimeB - startTimeB; // Calculate the elapsed time

                            double millisecondsB = durationB / 1e6; // Convert nanoseconds to milliseconds
                            
                            
                            
                            ///////////////Selection sort//////////////////////////////
                            
                            long startTime = System.nanoTime(); // Capture the start time
                            
                            selectionSortStringDesc(arrWords, arrNums);
                            printArray(arrWords, arrNums, 50);
                            
                            long endTime = System.nanoTime(); // Capture the end time

                            long duration = endTime - startTime; // Calculate the elapsed time

                            double milliseconds = duration / 1e6; // Convert nanoseconds to milliseconds

                            //This is goint to print the time taken by the two sorting arrays
                            
                            System.out.println("=========================================");
                            System.out.println("Time taken by bubble sort algorithm: " + millisecondsB + " milliseconds");

                            System.out.println("Time taken by selection sort algorithm: " + milliseconds + " milliseconds");
                            System.out.println("=========================================");
                            
                            if(millisecondsB<milliseconds){
                                System.out.println("Bubble sort is faster");
                            }else{System.out.println("Selection sort is faster");}
                            
                            break;
                        }
                
                        case 3: {
                            System.out.println("in Exit");
                        break;
                        }
                
                        }
                    } while (subOption != 3);
                     break;
                }
                case 2: {

                     do {
                         System.out.println("=========================================");
                        System.out.println("In what order do you want the number of pages to be sorted?");
                        System.out.println("1. Ascending");
                        System.out.println("2. Descending");
                        System.out.println("3. Exit");
                        System.out.println("Enter your option [1,2,3]:");
                        System.out.println("=========================================");
                        subOption = sc.nextInt();

                        switch (subOption) {
                        case 1: {
                            System.out.println("=========================================");
                            System.out.println("ARRAY SORTED IN ASCENDING ORDER BY NUMBER OF PAGES");
                            System.out.println("=========================================");
                            ////////////////////Selection sort////////////////////////////////////////
                            long startTimeS = System.nanoTime(); // Capture the start time
                            
                             selectionSortIntAsc(arrWords,arrNums);

                             printArray(arrWords, arrNums, 50);
                            long endTimeS = System.nanoTime(); // Capture the end time

                            long durationS = endTimeS - startTimeS; // Calculate the elapsed time

                            double millisecondsS = durationS / 1e6; // Convert nanoseconds to milliseconds

                            
                            
                            ////////////////////////Bubbble sort////////////////////////////////////////
                            long startTime = System.nanoTime(); // Capture the start time
                            
                             bubbleSortIntAsc(arrNums,arrWords);
                             
                              printArray(arrWords, arrNums, 50);

                            
                            long endTime = System.nanoTime(); // Capture the end time

                            long duration = endTime - startTime; // Calculate the elapsed time

                            double milliseconds = duration / 1e6; // Convert nanoseconds to milliseconds
                            
                            System.out.println("=========================================");
                            System.out.println("Time taken by Selection sort algorithm: " + millisecondsS + " milliseconds");

                            System.out.println("Time taken by bubble sort algorithm: " + milliseconds + " milliseconds");
                            System.out.println("=========================================");
                            
                            if(millisecondsS<milliseconds){
                                System.out.println("Selection sort is faster");
                            }else{System.out.println("Bubble sort is faster");}
                            
                            break;
                        }
                        
                        case 2: {
                            System.out.println("=====================================================");
                            System.out.println("ARRAY SORTED IN DESCENDING ORDER BY NUMBER OF PAGES");
                            System.out.println("======================================================");
                            
                            ////////////////////Selection sort////////////////////////////////////////
                            long startTimeS = System.nanoTime(); // Capture the start time
                            
                             selectionSortIntDesc(arrWords,arrNums);

                             printArray(arrWords, arrNums, 50);
                            long endTimeS = System.nanoTime(); // Capture the end time

                            long durationS = endTimeS - startTimeS; // Calculate the elapsed time

                            double millisecondsS = durationS / 1e6; // Convert nanoseconds to milliseconds

                            
                            
                            
                            
                            
                            
                            ////////////////////////Bubbble sort////////////////////////////////////////
                            
                            
                            
                            long startTime = System.nanoTime(); // Capture the start time
                            
                             bubbleSortIntDesc(arrNums, arrWords);
                             
                             printArray(arrWords, arrNums, 50);
                            
                            long endTime = System.nanoTime(); // Capture the end time

                            long duration = endTime - startTime; // Calculate the elapsed time

                            double milliseconds = duration / 1e6; // Convert nanoseconds to milliseconds
                            
                            System.out.println("======================================================");
                            System.out.println("Time taken by Selection sort algorithm: " + millisecondsS + " milliseconds");

                            System.out.println("Time taken by bubble sort algorithm: " + milliseconds + " milliseconds");
                            System.out.println("======================================================");
                            
                            
                            if(millisecondsS<milliseconds){
                                System.out.println("Selection sort is faster");
                            }else{System.out.println("Bubble sort is faster");}
                            
                            break;
                        }
                
                        case 3: {
                            System.out.println("in Exit");
                        break;
                        }
                
                        }
                    } while (subOption != 3);
                     break;
                }
                case 3: {
                    System.out.println("in Exit");
                    break;
                }
                // option = sc.nextInt();
                }
            } while (subOption != 3);
            break;
        }

        case 2:

        {

            do {
                System.out.println("=========================================");
                System.out.println("Search Sub-Menu:");
                System.out.println("1. Search");
                System.out.println("2. Exit");
                System.out.println("Enter your option [1,2,3]:");
                System.out.println();
                System.out.println("=========================================");
                subOption = sc.nextInt();
                System.out.println();

                switch (subOption) {
                case 1: {
                    System.out.println("======================================================");
                    System.out.println("SEARCH SELECTED");
                    System.out.println("======================================================");
                    
                    long startTime = System.nanoTime(); // Capture the start time
                    
                    Scanner scan= new Scanner(System.in);
                    
                    System.out.print("Enter the book title you want to search for: ");
                    String targetBookTitle = scan.nextLine();
                    
                   
                     //Array sorted in Ascending order
                    selectionSortStringAsc(arrWords, arrNums);
                    
                    /////////////////////////////////////////////////////////////////
                    
                    long startTimeL = System.nanoTime(); // Capture the start time

                    linearSearch(arrWords, targetBookTitle);               
               
                    long endTimeL = System.nanoTime(); // Capture the end time

                    long durationL = endTimeL - startTimeL; // Calculate the elapsed time

                     double millisecondsL = durationL / 1e6; // Convert nanoseconds to milliseconds
                    
                    //////////////////////////////////////////////////////////////////
                    //Array sorted in Ascending order
                    selectionSortStringAsc(arrWords, arrNums);
                    int result = binarySearch(arrWords, targetBookTitle);

                    if (result != -1) {
                    System.out.println("Element " + targetBookTitle + " found at index: " + result);
                    System.out.println("Number of Pages: " + arrNums[result]);
                     } else {
                   System.out.println("Element " + targetBookTitle + " not found in the array.");
                   
                    }
                
                    long endTime = System.nanoTime(); // Capture the end time

                    long duration = endTime - startTime; // Calculate the elapsed time

                    double milliseconds = duration / 1e6; // Convert nanoseconds to milliseconds
                    System.out.println("======================================================");
                    System.out.println("Time taken by binary Search algorithm: " + milliseconds + " milliseconds");
                    System.out.println("Time taken by linear search algorithm: " + millisecondsL + " milliseconds");        
                    System.out.println("======================================================");
                    
                    if(milliseconds<millisecondsL){
                        System.out.println("Binary search is faster");
                    }else{System.out.println("Linear search is faster");}
                    System.out.println("======================================================");
                    break;
                }
                
                case 2: {
                    System.out.println("in Exit");
                    break;
                }
                // option = sc.nextInt();
                }
            } while (subOption != 2);
            break;
        }


        case 3:
            System.out.println("You have finished the program");
            System.exit(0);
            break;
        }

    } while (option != 3);



     }
     
   }
  



