package Function;

import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int a=n_fact(n);
        int b=n_fact(r);
        int c=n_fact(n-r);

        System.out.println(a/(b*c));



    }
    public static int n_fact(int n){
        int fact=1;
        if(n==1 || n==0)
            System.out.println("1");
        else
            for(int i=1;i<=n;i++){
                 fact=fact*i;
            }
       return fact;
    }
}
