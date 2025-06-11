public class bitManipulation {
    public static void countSetBits(int n) {
        int bitMask = 1;
        int count = 0;
        while (n>0) {
            if ((n & bitMask) != 0) {
                count++;
            } 
            n= (n>>1 );
        }
        System.out.println(count);
    }
    public static int fastExpo(int a , int n) {
        int ans=1;
        while (n>0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String aargs[]) {
        //countSetBits(16);
        //System.err.println(fastExpo(4, 3));
        int x = 4 , y=5;
        System.out.println("Before swap x: "+x+" and y: "+y);
        x=x ^y;
        y= x^ y;
        x =x^y;
        System.err.println("After swap x: "+x+" and y: "+y);
    }
}
