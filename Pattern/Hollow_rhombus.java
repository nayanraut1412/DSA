package Pattern;

public class Hollow_rhombus {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n*2-1;j++){
                if((i>=0 && j>=0 && i<n-1 && j<n-i-1) || (i>0 && j>n-i-1 && i<n-1 && j<n*2-1-i-1) || (i>0 && j>n*2-1-i-1))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
