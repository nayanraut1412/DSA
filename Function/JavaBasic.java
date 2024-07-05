package Function;

import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(add(a,b)); 
        System.out.println(mul(a,b));

        System.out.println("Now enter number for factorial"); 
        // int c=sc.nextInt();
        fact(sc.nextInt());

    }
    static int add(int a, int b){
        return a+b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static void fact(int n){
        int fact=1;
        if(n==1 || n==0)
            System.out.println("1");
        else
            for(int i=1;i<=n;i++){
                 fact=fact*i;
            }
        System.out.println(fact); 
    }
}
