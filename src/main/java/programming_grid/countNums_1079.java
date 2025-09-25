package programming_grid;

import java.util.Scanner;

public class countNums_1079 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            getMax(sc.nextLine());
            sc.nextLine();
        }
    }
    private static void getMax(String str){
        char most = 'a';
        int max = 0;
        int[] count = new int[26];
        for (char c : str.toCharArray()){
            count[c - 'a']++;
            if (count[c - 'a'] > max){
                max = count[c - 'a'];
                most = c;
            }else if (count[c - 'a'] == max && c < most){
                most = c;
            }
        }
        System.out.println(most+" "+max);
    }
}
