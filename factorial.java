import java.util.*;
public class factorial {
    public static int fact(int num) {

        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num*fact(num-1);
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int binomial= fact(n)/(fact(r)*fact(n-r));
        
        System.out.println("Binomial is:"+binomial);
    }
    
}
