package Function;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(DecimalToBinary(n));
    }
    public static int DecimalToBinary(int n){
        int bin=0,rem=0;
        int pow=0;
        while(n>0){ 
            rem=n%2;
            n=n/2;
            bin=bin+(rem * (int)Math.pow(10, pow));
            pow++;
        }
        return bin;
    }
}
