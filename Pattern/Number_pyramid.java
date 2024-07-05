package Pattern;

public class Number_pyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n*2;j++){
                if((i>=0 && j>=0 && i<n && j<n-i) || (i>=0 && j>n+i && j<=n*2))
                    System.out.print(" ");
                else if((j%2==0) && ((j+1)%2)==1) {
                    System.out.print(i+1);
               } else {
                     System.out.print(" ");
               }        
            }
            System.out.println();
        }
    }
}
