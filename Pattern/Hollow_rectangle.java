package Pattern;

public class Hollow_rectangle {
    public static void main(String[] args) {
        int n=5;
        // int spacerow=n-2;
        // int spacercol=n+1-2;

        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                if(i>=1 && i<n-1 && j>=1 && j<n){
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
