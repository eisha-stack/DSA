import java.util.Scanner;
public class lcm {
    static int findLcm(int a, int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(findLcm(a,b));
    }
    
}
