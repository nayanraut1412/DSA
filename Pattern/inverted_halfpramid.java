package Pattern;

public class inverted_halfpramid {
    public static void main(String[] args){
        int n=5;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
