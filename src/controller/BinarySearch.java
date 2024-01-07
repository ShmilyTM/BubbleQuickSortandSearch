
package controller;

public class BinarySearch {
    public static int binarySearch(int[] arr, int searchNumber) {
        if(arr != null) {
            int left = 0;
            int right = arr.length - 1;
            for(int i = left; i <= right; i++) {
                int mid = (left + right) / 2;
                if(searchNumber == arr[mid]) {
                    return mid;
                } else if(searchNumber > mid) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }
    
    public static void displayIndex(int searchNumber, int index) {
        if (index >= 0) {
            System.out.println("Found " + searchNumber + " at index: " + index);
        } else {
            System.out.println("Not found " + searchNumber + " in the array!");
        }
    }
}
