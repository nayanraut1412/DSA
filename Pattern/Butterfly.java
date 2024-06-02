package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=0;i<n*2;i++){
            for(int j=0;j<n*2;j++){
            
                if((i>=0 && j>0+i && i<=(n*2)-1 && j<(n*2)-i-1) || (i>n && j>n*2-1-i && i<=(n*2)-1 && j<=i-1))
                     System.out.print(" ");     
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
