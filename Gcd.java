import java.util.Scanner;
public class Gcd {
    static int gcd(int a, int b){
        int min = 0;
        if(a<b){
            min = a;
        }else{
            min = b;
        }

        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }

        }
        return 1;
        
    }

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scan.nextInt();
        System.out.println("Enter second number:");
        int b=scan.nextInt();

        System.out.println(gcd(a,b));
    }
    
}
