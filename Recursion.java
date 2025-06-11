public class Recursion {
    public static void dec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        dec(n - 1);
    }

    public static void increasing(int n) {
        if (n == 1) {
            System.out.print(1 + "  ");
            return;
        }
        increasing(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn1 = fact(n - 1);
        int fn = n * fn1;
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fn1 = sum(n - 1);
        int fn = n + fn1;
        return fn;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    public static boolean sortedarray(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedarray(arr, i + 1);
    }

    public static int firstoccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, i + 1, key);
    }

    public static int lastoccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccur(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int xpowern(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int fn1 = xpowern(x, n - 1);
        int fn = x * fn1;
        return fn;
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = optimizedPower(x, n / 2);
        int halfPower = (int) Math.pow(half, 2);
        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }
        return halfPower;
    }

    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fn1 = tilingProblem(n - 1);
        // horizontal
        int fn2 = tilingProblem(n - 2);
        return fn1 + fn2;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fn1 = friendsPair(n - 1);
        int fn2 = friendsPair(n - 2);
        int totalWays = fn1 + (n - 1) * fn2;
        return totalWays;
    }

    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // work
        if (lastPlace == 0) {
            printBinStrings(n - 1, 0, str + "0");
            printBinStrings(n - 1, 1, str + "1");
        } else {
            printBinStrings(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        // int n=5;
        // dec(n);
        // increasing(n);
        // System.out.println(fibonacci(n));
        // int arr[] = {2, 4 , 7, 8, 16, 4, 5};
        // System.out.println(lastoccur(arr, 0, 4));
        // System.out.println(xpowern(3, 0));
        // System.out.println(optimizedPower(5, 3));
        // System.out.print(tilingProblem(4));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPair(3));
        printBinStrings(3, 0, "");
    }

}
