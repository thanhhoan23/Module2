package BaiMangAnhQuang;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public Scanner st =new Scanner(System.in) ;
    //    Scanner st;
    public ArrayEx(){
//        Scanner st = new Scanner(System.in);
//        Sai vì đang khai báo một biến khác trùng tên
    }
    //    Tim so lon nhat trong mang:
    public int searchMaxByPoint(int arr[] ) {
        int maxPoint = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPoint) {
                maxPoint = arr[i];
                index = i;
            }
        }
        return arr[index];
    }


    public int searchMaxSecond(int arr[], int n ) {
        int firstMax, secondMax;
        if(arr[0]>arr[1]) {
            firstMax= arr[0];
            secondMax = arr[1];
        } else {
            firstMax = arr[1];
            secondMax = arr[0];
        }

        for (int i = 2; i<n; i++) {
            if (arr[i] >= firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i]> secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    //Dao nguoc mang:
    public void reverse(int[]array) {
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
    //    Xóa n phần tử bắt đầu từ vị trí index:
    public int[] deleteIndex(int []arr, int index, int number) {
        int [] newArr = new int[arr.length-number];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        int j = newArr.length-1;
        for(int i =arr.length -1; i> index + number -1; i--){
            newArr[j] = arr[i];
            j--;
        }
        return newArr;
    }

    //     Thêm mảng gồm n phần tử bắt đầu từ vị trí index
    public int[] addIndex(int []arr, int index, int number) {
//        Tạo mảng mới với độ dài number
//    arr = {1,3,5,7}
        int [] newArr = new int[arr.length + number];
//    vòng for sao chép mảng cũ vào mảng mới
//    newArr = {0,0,0,0,0,0}
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
//    newArr = {1,3,0,0,0,0}
//    newArr
//    Vòng for nhâp số phần tử
//    Scanner st = new Scanner(System.in);
//    st = new Scanner(System.in);
        for(int i = index; i< index+number ; i++) {
            System.out.println("Nhap so phan tu: ");
            newArr[i] = st.nextInt();
        }
//    newArr = {1,3,5,6,0,0}
//    arr = { 1,3,5,7}
//
        for ( int i = number + index; i< newArr.length; i++) {
            newArr[i] = arr[i - number];
        }
        return newArr;
    }
    //Thêm một phần tử:
    public static void add (int [] arr, int number, int index){
//        for (int i =0; i< newArr.length; i++) {
//            newArr[i] = arr[i];
//        }
        int [] newArr = new int[arr.length + 1];
        for (int i = 0; i< index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = number;
        for ( int i = index + 1; i< newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        System.out.println(Arrays.toString(newArr));

    }

    //    Xóa một phần tử:
    public static void delete(int[] arr, int index) {
        int [] newArr = new int[arr.length -1];
        for (int i = 0; i< index; i++) {
            newArr[i] = arr[i];
        }
        int j = newArr.length-1;
        for(int i = arr.length -1; i> index; i--){
            newArr[j] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(newArr));
    }

//Nối 2 mảng với nhau:

    public static void connect(int [] arr, int []arr2) {
        int [] newarr = new int[arr.length + arr2.length];
        for (int i = 0; i<arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int i=0; i< arr2.length; i++) {
            newarr[arr.length +i] = arr2[i];
        }
        System.out.println(Arrays.toString(newarr));
    }


    //        Kiểm tra xem mảng b có phải là con mảng a hay không
    public static void check(int [] arr1, int[] arr2) {
        if (arr2.length <= arr1.length) {
            for (int i=0; i< arr1.length; i++) {
                if (arr1[i] == arr2[0]) {
                    int count = 0;
                    for(int j= 0; j< arr2.length; j++) {
                        if (arr1[j+i] != arr2[j]) {
                            break;
                        }
                        count++;
                    }
                    if (count == arr2.length) {
                        System.out.println(Arrays.toString(arr2) + "La mang con");
                        break;
                    } else {
                        System.out.println(Arrays.toString(arr2) + "Khong phai mang con");
                    }
                }
            }
        }
        else {
            System.out.println(Arrays.toString(arr2) + " khong phai");
        }
    }

//    . Sao chép 1 mảng từ vị trí from đến vị trí to
//a=[1,6,7,5,6], from= 2, to= 4 => b=[7,5,6]

    public static void copyArr (int [] arr, int indexStart, int indexEnd ){
        int [] arr2 = Arrays.copyOfRange(arr,indexStart, indexEnd);
        System.out.println(Arrays.toString(arr2));
    }
}
