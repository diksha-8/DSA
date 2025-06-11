public class matrices {

    public static void PrintSpiral(int matrix[][]) {
        int startRow =0;
        int startCol=0;
        int EndRow=matrix.length-1;
        int EndCol = matrix[0].length-1;

        while ( startRow <= EndRow && startCol <= EndCol) {
            //top
            for (int j=startCol ; j<=EndCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=EndRow; i++){
                System.out.print(matrix[i][EndCol]+" ");
            }

            //bottom
            for (int j=EndCol-1 ; j>=startCol; j--) {
                if (startRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j]+" ");
            }

            //left
            for(int i=EndRow-1; i>=startRow+1; i--) {
                if (startCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }

    public static void sum (int matrix[][]) {
        int sum =0; 
        // for (int i=0; i<matrix.length; i++) {
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (i==j) {
        //             sum+=matrix[i][j];

        //         }
        //         else if(i+j==matrix.length-1) {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for (int i=0; i<matrix.length; i++) {
            sum+=matrix[i][i];
            if (i != matrix.length-i-1) {
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }

    public static boolean staircaseSearch(int matrix[][] , int key) {
        int col = 0, row = matrix.length-1;
        while (row >=0 && col < matrix[0].length) {
            if ( matrix[row][col] == key) {
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if (key > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] ={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        staircaseSearch(matrix, 11);
    }
}