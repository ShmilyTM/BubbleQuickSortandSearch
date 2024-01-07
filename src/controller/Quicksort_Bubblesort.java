
package controller;

import model.Validate;

public class Quicksort_Bubblesort {

// Phần của Bubble sort
    public int[] BubbleSort(int[] arr) {
        int count = arr.length;
        int temp;
        boolean isSwap;
        for (int i = 0; i < count - 1; i++) {
            isSwap = false;             //Biến check xem thử có swap hay ko
            for (int j = 0; j < count - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;      //swap arr[i] va arr[j]
                    isSwap = true;      //biến để check nếu qua 1 vòng lặp i mà ko có swap thì dừng
                }
            }
            
            if(isSwap != true) { break; }  //Nếu true thì chạy tiếp lượt i mới, false thì dừng
        }
        return arr; 
    }
    
    
// Phần của Quick sort
    public void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    
    // Hàm chia mảng thành hai phần, trả về chỉ số của pivot
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        
        return i + 1;
    }
    
    public int[] QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Chọn pivot và đặt nó ở đúng vị trí
            int pi = partition(arr, low, high);

            // Đệ quy sắp xếp các phần mảng trước và sau pivot
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
        return arr;
    }

//Phần hiển thị arr,...     
    public void Display(int[] arr) {
        if(arr != null) {
            int count = arr.length;
            System.out.print("[");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i]);
                if(i != (count-1)) { System.out.print(", "); }
            }
            System.out.print("]");
        } else {
            System.out.print("[ ]");
        }
    }
    
    public int[] RandomNumber(int num) {        //Tạo mảng random ko trùng lặp từ 1 -> n-1 ở dưới 
        int[] arr = new int[num];                           //Khởi tạo arr
        for (int i = 0; i < num; i++) {
            double randomDouble = Math.random();    //random trong Math chạy từ [0;1)
            arr[i] = (int)(randomDouble * num + 1);  //ramdom từ 1 -> num
        }
        return arr;
    }
    
    public int[] UserInputNumber(int num) {
        int[] arr = new int[num];       
        for (int i = 0; i < num; i++) {
            arr[i] = Validate.getInt("arr[" + i + "]= ");
        }
        return arr;
    }
    
}
