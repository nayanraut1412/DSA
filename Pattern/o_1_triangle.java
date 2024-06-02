package Pattern;

public class o_1_triangle {
    public static void main(String[] args) {
        int n=5;
        int a=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print(a+" ");
                if(i%2==0 || a==0)
                    a=1;              
                else
                    a=0;
            }
            System.out.println(" ");
        }
    }
    
}

    

