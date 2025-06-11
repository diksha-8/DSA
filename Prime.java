import java.util.*;
public class Prime {
    public static boolean prime (int n) {
       // boolean isPrime = true;
        for(int i= 2;i<= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
    return true;

        /*if (isPrime == false){
            System.out.println("Number is not prime");
        } else {
            System.out.println("Number is prime");
        }*/
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i =a ; i<= b; i++) {
            if ( prime(i)) {
                System.out.println(i);
            }
        }
        
    }
}
