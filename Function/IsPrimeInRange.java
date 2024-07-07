package Function;

public class IsPrimeInRange {
    public static void main(String[] args) {
        IsPrime();
    }
    public static void IsPrime(){
        for(int i=2;i<=10;i++){
            boolean ans=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    ans=false;
                    break;
            }
            if(ans==true)
                System.out.println(i+" is a Prime number");
            // System.out.println(i+" is a Not Prime number");
        }
    }
}
