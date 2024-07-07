package Function;

import java.util.Scanner;

public class PractiseQuestion {
    public static void main(String[] args) {
        isEven();
        isPalindrome();
        digitSum();

    }
    public static int Scanner(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        return n;
    }

    public static void isEven(){
        System.out.println("Enter number to find out wheather it is even or not:");
        int n=Scanner();
        if(n%2==0)
            System.out.println(n+" is even number.");
        System.out.println(n+" is odd number.");
    }

    public static void isPalindrome(){
        System.out.println("Enter number to find out wheather is it palindrome or not:");
        int n=Scanner();
        int orignal=n;
        int rev=0;
       while (n>0) {
        rev = rev*10 + (n%10);
        n=n/10;
       }
        if(orignal==rev)
            System.out.println(orignal+" is palindrome.");
        else
            System.out.println(orignal+" is not palindrome.");
    }

    public static void digitSum(){
        System.out.println("Enter number to find out the sum of digit:");
        int n=Scanner();
        int sum=0;
       while (n>0) {
        sum = sum + (n%10);
        n=n/10;   
       }
       System.out.println(sum+" is the sum.");

     }
    
}
