package Variables;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println(n+" is prime no");

        }
        else{
            boolean isPrime = true;
            for(int i = 2; i < Math.sqrt(n); i++)
            {
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        
        if(isPrime==true){
            System.out.println(n+" is prime no");
        }
        else
        {
            System.out.println(n+" is not prime no");
        }   
    }
        // for(int i = 0; i < n;i++){
        //     int count = 0;
        //     for(int j = 1; j <= i; j++){
        //         if(i % j == 0){
        //             count++;
        //         }
        //     }
        //     if(count == 2){
        //         System.out.print(i + " ");
        //     }
        // }
    }
}
