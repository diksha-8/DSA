import java.util.*;
public class Matrix {

    public static void value(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(largest+","+smallest);
        
    }


    public static void main(String args[]) {
        int n=4,m=3;
        int matrix[][] = new int [4][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n ; i++){
            for (int j= 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n ; i++){
            for (int j= 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        value(matrix);
    }
}