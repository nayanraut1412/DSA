package Pattern;

public class inverted_rotated_halfpramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=0 && i<n && j>=0 && j<n-i-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    
}
