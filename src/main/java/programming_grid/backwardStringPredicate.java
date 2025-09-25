package programming_grid;

import java.util.Scanner;

public class backwardStringPredicate {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(isBwstr(sc.nextLine()) ? "1" : "0");
    }

    private static boolean isBwstr(String str){
        int n = str.length();
        for(int i = 0 ; i < ( n / 2 ) ; i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
