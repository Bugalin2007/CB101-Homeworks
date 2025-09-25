package programming_grid;

import java.util.Scanner;

public class caseSwap_1005 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(flip(sc.nextLine()));
    }
    private static String flip(String str){
        char[] arr = str.toCharArray();
        char[] arr2 = new char[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > 64 && arr[i] < 129) {
                arr2[i] = Character.toChars(arr[i] > 96 ? arr[i] - 32 : arr[i] + 32)[0];
            }else{
                arr2[i] = arr[i];
            }
        }
        return new String(arr2);
    }
}
