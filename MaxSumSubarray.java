public class MaxSumSubarray {
    public static void Sum(int array[]) {
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++) {
            for(int j=i; j<array.length; j++) {
                sum=0;
                for (int k=i ; k<=j; k++) {
                    sum += array[k];  
                }
                System.out.print(sum+",");
            
                if (MaxSum < sum ) {
                    MaxSum = sum ;
                }
            }    
            System.out.println("");       
        }
        System.out.println("Max sum is:"+MaxSum);
    }
    public static void main(String[] args) {
        int array[] = {-1, 0 , 3 ,-2, 8,6};
        Sum(array);
    }
}
