package Variables;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int A =sc.nextInt();
        // int B =sc.nextInt();
        // int C =sc.nextInt();
        // System.out.println(A+B+C/3);

        // int side =sc.nextInt();
        // System.out.println(side*side);
        int $ = 24;
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float e = sc.nextFloat();

        float total= pencil+pen+e;

        System.out.println(total*(1+0.18f)+$);



    }
}
