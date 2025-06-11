public class array {
    public static void main(String[] args) {
        int arr[] = {12, 35 ,1,10,34,1,35} ;
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length -1 ;i++) {
            if (arr[i]>arr[i+1]) {
                largest = arr[i];
            } else{
                largest = arr[i+1];
            }
        }
        System.out.println(largest);
    }
}
