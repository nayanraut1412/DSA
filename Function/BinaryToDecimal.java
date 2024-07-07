package Function;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(BinaryToDecimal(n));;

    }
    public static int BinaryToDecimal(int n){
        int pow=0;
        int dec=0;
        while (n>0) {
            int ld=n%10;
            dec=dec + (ld*(int)Math.pow(2, pow));
            pow++;
            n=n/10;

            
        }
        return dec;
    }
}
