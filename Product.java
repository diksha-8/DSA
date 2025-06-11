import java.util.*;
public class Product {
    public static int pro(int a, int b){
        //Scanner sc = new Scanner(System.in);
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int prod = pro(num1, num2);
        System.out.println("Product is:"+prod);
    }
}
