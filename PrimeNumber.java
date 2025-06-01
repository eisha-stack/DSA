import java.util.Scanner;
public class PrimeNumber {
    public static String checkPrime (int n){
            if (n<=1){
                return "Not Prime";
            }
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return "Not prime";
                }
            }
            return "Prime";

    }

    public static void main (String []args){
      Scanner scan = new Scanner (System.in);
      int n = scan.nextInt();
      String res= checkPrime(n);
      System.out.print(res);
    }
    
}
