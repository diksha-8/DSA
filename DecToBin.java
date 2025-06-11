import java.util.*;
public class DecToBin {
    public static void Dec(int dec) {
        int i=0,bin=0;
        while (dec > 0) {
            int rem = dec %2;
            bin = bin + rem*((int)Math.pow(10,i));
            i++;
            dec= dec/2;
        }
        System.out.println("Binary equivalent is "+bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        Dec(dec);
    }
}
