package programming_grid;

import java.util.Scanner;

public class adicSwitch {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arr = sc.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        var num = new adicNum(arr[1].toUpperCase(),a);
        System.out.println(num.changeAdic(b).toStr());
    }

    private static class adicNum{
        long[] nums;
        int adic;
        adicNum(long num, int adic){
            this.adic = adic;
            if (num == 0){
                this.nums = null;
                return;
            }
            int n = Math.toIntExact(Math.round(Math.log(num) / Math.log(adic)));
            long[] arr = new long[n+1];
            for (int i = n; i >= 0; i--){
                arr[i] = num / (long) Math.pow(adic,i);
                num %= (long) Math.pow(adic,i);
            }
            this.nums = arr;
        }

        adicNum(String str, int adic){
            this.adic = adic;
            int n = str.length();
            if (n == 0 || str.equals("0")){
                this.nums = null;
                return;
            }
            long[] arr = new long[n];
            for (int i = n - 1; i >= 0; i--){
                arr[i] = translateDigit(str.charAt(n - 1 - i));
            }
            this.nums = arr;
        }

        private long toNum(){
            if (this.nums == null){
                return 0;
            }
            long result = 0;
            for (int i = 0; i < this.nums.length; i++) {
                result += this.nums[i] * (long) Math.pow(this.adic, i);
            }
            return result;
        }

        private String toStr(){
            if (this.nums == null){
                return "0";
            }
            int n =  this.nums.length;
            char[] arr = new char[n];
            for (int i = 0; i < n; i++) {
                arr[i] = translateDigit(this.nums[n - i - 1]);
            }
            String result = new String(arr);
            while (result.charAt(0) == '0' && result.length() != 1){
                result = result.substring(1);
            }
            return result;
        }

        private adicNum changeAdic(int adic){
            return new adicNum(this.toNum(),adic);
        }
    }
    private static long translateDigit(char c){
        if(c >= '0' && c <= '9'){
            return Character.getNumericValue(c);
        }else{
            return c-55;
        }
    }

    private static char translateDigit(long num){
        if(num >= 0 && num <= 9){
            return (char)(num+48);
        }else{
            return (char)(num+55);
        }
    }

}
