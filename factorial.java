import java.util.Scanner;
public class factorial {
    static int fact (int n){
        int res = 1;
        for (int i=1;i<n;i++){
            res *= i;
        }
        return res;
    }
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scan.nextInt();
        System.out.println(fact(n));
    }
    
}
