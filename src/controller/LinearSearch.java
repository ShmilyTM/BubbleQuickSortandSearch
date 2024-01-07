
package controller;

public class LinearSearch {
    public static int linearSearch(int[] arr, int searchNumber) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == searchNumber) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1; // hoặc nếu arr là null, có thể trả về giá trị đặc biệt khác để biểu thị không tìm thấy
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
