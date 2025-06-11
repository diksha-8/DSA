public class divideAndConquer {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;//left iterator
        int j=mid+1;//right iterator
        int k=0;//temp iterator

        while (i<= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        //left
        while(i <= mid) {
            temp[k++]=arr[i++];
        }
        //right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k=0,i=si ; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    //QuickSort
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivotIndex = partition(arr,si, ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i= si-1;

        for (int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    //Search in rotated sorted array
    public static int rotatedSortedArray(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si+ (ei-si)/2;

        //Case 1;
        if (arr[mid] == tar) {
            return mid;
        }

        //Case mid on L1
        if ( arr[si] <= arr[mid]) {
            //case a: left
            if (tar >= arr[si] && tar <= arr[mid]) {
                return rotatedSortedArray(arr, tar, si, mid-1);
            } else {
                return rotatedSortedArray(arr, tar, mid+1, ei);
            }
        } else { //mid on L2
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return rotatedSortedArray(arr, tar, mid+1, ei);
            } else {
                return rotatedSortedArray(arr, tar, si, mid-1);
            }
        }
    }


    public static void main(String[] args) {
        // int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        // int arr[] = {6, 3, 9, 8, 2, 5};
        // quickSort(arr, 0, arr.length-1);
        // printArray(arr);
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(rotatedSortedArray(arr, 0, 0, arr.length-1));
    }
}
