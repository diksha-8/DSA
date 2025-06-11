import java.util.*;

public class PairsArray {
    public  static void pair(int array[]) {
        for(int i = 0; i < array.length; i++) {
            //int curr= array[i];
            for(int j =(i+1); j< array.length; j++) {
                
                System.out.print("("+array[i]+","+array[j]+")");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int array[] = new int[n];

        for(int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        pair(array);

    }
}
