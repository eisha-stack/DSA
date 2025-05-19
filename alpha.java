import java.util.Scanner;
public class alpha {
    static int trailingZeros(int n){
        int res = 0;
        int powOf5 = 5;
        while (n >= powOf5){
            res = res +(n/powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }  
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number:");
        int n = scan.nextInt();
        System.out.println(trailingZeros(n));
    }  
}
