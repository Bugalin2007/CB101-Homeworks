package programming_grid;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] =  sc.next();
        }
        arr = sort(arr);
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    private static String[] sort(String[] arr){
        Arrays.sort(arr);
        return arr;
                /*
        boolean flag = false;
        int n = arr.length;
        while (!flag){
            for (int i=0;i<n-1;i++){
                flag=true;
                if (arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    flag=false;
                }
            }
        }
        return arr;

         */
    }

    private static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
