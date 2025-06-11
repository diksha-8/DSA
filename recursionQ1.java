//For a given integer array of size N.
//YOu have to find all occurrences(indices) of a given key element and print them.
//Use a recursive function to solve this. 
public class recursionQ1 {
    public static void allOccurences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i]==key) {
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }


    //Q2 We are given a string S, we need to find and count all contiguous substrings starting and ending with the same character.
    public static int countSubstr(String str, int i, int j, int n) {
        if (n==1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = countSubstr(str, i+1, j, n-1) + countSubstr(str, i, j-1, n-1) - countSubstr(str, i+1, j-1, n-2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    } 

    public static void main(String[] args) {
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key =2;
        // allOccurences(arr, key, 0);
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstr(str, 0, n-1, n));
    }
    
}
