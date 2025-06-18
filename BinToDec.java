import java.util.*;

public class BinToDec {
    public static void Bin (int bin) {
        int i =0, dec=0,ld;
        while (bin > 0) {
            ld = bin % 10;
            bin = bin / 10;
            dec =dec+ ld*((int)Math.pow(2,i));
            i++;
            
        }
        System.out.println("Decimal conversion is "+dec);
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        Bin(bin);
        
    }
}
