
package controller;

import view.MyMenu;
import model.Node;
import model.Validate;

public class Executed extends MyMenu {
    Node arr = new Node();
    
    public Executed() {
        super("\n------------------------------\n***QuickSort and BubbleSort***", 
                new String[] {"Create array","Quick sort", "Bubble Sort", "Linear Search", "Binary Search", "Close program!"});
    }
    
    public static void main(String[] args) {
        Executed hi = new Executed();
        hi.run();
        
    }

    @Override
    public void execute(int choice) {
        //Khởi tạo đối tượng cho các class
        Quicksort_Bubblesort sort = new Quicksort_Bubblesort();
        
        switch (choice) {
            case 1:
                System.out.println(">>>>>>Create array<<<<<<");
                System.out.println("1. Generate random integer in number range for each array element.");
                System.out.println("2. User enters each element of the array.");
                int choiceCreate = Validate.inputIntMinMax(">>Your choice: ", 1, 2);
                if(choiceCreate == 1) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.RandomNumber(numberRange);
                    arr = new Node(array, numberRange);                    
                }else if(choiceCreate == 2) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.UserInputNumber(numberRange);
                    arr = new Node(array, numberRange);
                }
                System.out.print("New array: ");
                sort.Display(arr.getArray());
                System.out.println();
                break;
            case 2:
                System.out.println(">>>>>>Quick sort<<<<<<");
                System.out.println("1. Generate random integer in number range for each array element.");
                System.out.println("2. User enters each element of the array.");
                System.out.println("3. Get the existing array.");
                int sortChoiceQ = Validate.inputIntMinMax(">>Your choice: ",1 ,3);
                
                if(sortChoiceQ == 1) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.RandomNumber(numberRange);
                    arr = new Node(array, numberRange);                    
                }else if(sortChoiceQ == 2) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.UserInputNumber(numberRange);
                    arr = new Node(array, numberRange);                    
                }else if(sortChoiceQ == 3) {
                    if(arr.getArray() == null) {
                        System.out.println("Empty array!");
                        break;
                    }
                }
                System.out.print("Unsorted array: ");
                sort.Display(arr.getArray());
                System.out.println();
                    
                System.out.print("Sorted array: ");
                sort.QuickSort(arr.getArray(), 0, arr.getSize() - 1);       //sort
                sort.Display(arr.getArray());                
                break;
            case 3:
                System.out.println(">>>>>>Bubble sort<<<<<<");
                System.out.println("1. Generate random integer in number range for each array element.");
                System.out.println("2. User enters each element of the array.");
                System.out.println("3. Get the existing array.");
                int sortChoiceB = Validate.inputIntMinMax(">>Your choice: ",1 ,3);
                
                if(sortChoiceB == 1) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.RandomNumber(numberRange);
                    arr = new Node(array, numberRange);                    
                }else if(sortChoiceB == 2) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.UserInputNumber(numberRange);
                    arr = new Node(array, numberRange);                    
                }else if(sortChoiceB == 3) {
                    if(arr.getArray() == null) {
                        System.out.println("Empty array!");
                        break;
                    }
                }
                System.out.print("Unsorted array: ");
                sort.Display(arr.getArray());
                System.out.println();
                    
                System.out.print("Sorted array: ");
                sort.BubbleSort(arr.getArray());        //sort
                sort.Display(arr.getArray());                
                break;
            case 4:
                System.out.println(">>>>>>Linear search<<<<<<");
                System.out.println("1. Generate random integer in number range for each array element.");
                System.out.println("2. User enters each element of the array.");
                System.out.println("3. Get the existing array.");
                int searchChoiceL = Validate.inputIntMinMax(">>Your choice: ",1 ,3);
                
                if(searchChoiceL == 1) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.RandomNumber(numberRange);
                    arr = new Node(array, numberRange);
                    System.out.print("Array: ");
                    sort.Display(arr.getArray());
                    System.out.println();
                }else if(searchChoiceL == 2) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.UserInputNumber(numberRange);
                    arr = new Node(array, numberRange);
                    System.out.print("Array: ");
                    sort.Display(arr.getArray());
                    System.out.println();
                }else if(searchChoiceL == 3) {
                    if(arr.getArray() == null) {
                        System.out.println("Empty array!");
                        break;
                    }
                }                
                int searchL = Validate.getInt("Enter search number: ");
                int indexResultL = LinearSearch.linearSearch(arr.getArray(), searchL);
                System.out.print("Array: ");
                sort.Display(arr.getArray());
                System.out.println();
                
                LinearSearch.displayIndex(searchL, indexResultL);
                break;
            case 5:
                System.out.println(">>>>>>Binary search<<<<<<");                
                System.out.println("1. Generate random integer in number range for each array element.");
                System.out.println("2. User enters each element of the array.");
                System.out.println("3. Get the existing array.");
                int searchChoiceB = Validate.inputIntMinMax(">>Your choice: ",1 ,3);
                
                if(searchChoiceB == 1) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.RandomNumber(numberRange);
                    arr = new Node(array, numberRange);
                    System.out.print("Array: ");
                    sort.Display(arr.getArray());
                    System.out.println();
                }else if(searchChoiceB == 2) {
                    int numberRange = Validate.getInt(">Enter number of array: ");
                    int[] array = sort.UserInputNumber(numberRange);
                    arr = new Node(array, numberRange);
                    System.out.print("Array: ");
                    sort.Display(arr.getArray());
                    System.out.println();
                }else if(searchChoiceB == 3) {
                    if(arr.getArray() == null) {
                        System.out.println("Empty array!");
                        break;
                    }
                }
                sort.QuickSort(arr.getArray(), 0, arr.getSize() - 1);   //sort array before search (binary search)
                int searchB = Validate.getInt("Enter search number: ");
                int indexResultB = BinarySearch.binarySearch(arr.getArray(), searchB);
                System.out.print("Array(sorted): ");
                sort.Display(arr.getArray());
                System.out.println();
                
                BinarySearch.displayIndex(searchB, indexResultB);
                break;
            case 6:
                System.out.println(">>>Program close!");    // (choice == list.size) ==> close (in menu)
                break;
            default:
                System.out.println("Option is not valid. Please make another selection!");
                System.out.println();   // tao khoang trong
                break;
        }
    }
}
