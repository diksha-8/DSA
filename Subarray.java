public class Subarray {
    public static void print(int numbers[]) {
        int ts=0;   //for printing total number of subarrays

        for(int i=0; i<numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                for (int k=i; k<=j; k++) {
                    System.out.print(numbers[k]+" ");
                   
                }
                ts++;
                System.out.println();          
            }
            System.out.println();
        }
        System.err.println(ts);
    }

    public static void main(String args[]) {
        int numbers[]={2,4,6,7,8};
        print(numbers);
    }
}