package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n=3;
        for(int i=0; i<=n*2+1; i++){   
            for(int j=0;j<=n*2;j++){
                if((i>=0 && j>=0 && i<=n && j<n-i) || (i>=0 && j>n+i && i<=n && j<=n*2-i+n)
                 || (i>n+1 && j>=0 && i<=n*2+1 && j<i-n-1) || (i>n+1 && j>n*2-i+n+1))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        // int n=3;
        // for(int i=0; i<=n; i++){   
        //     for(int j=0;j<=n;j++){
        //         if(i>0 && j>n-i)
        //             System.out.print(" ");
        //         else
        //             System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
