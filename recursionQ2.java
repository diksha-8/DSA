//You are given a number(eg - 2019), convert it into string of english like "two zero one nine".
//Use a recursive fn. to solve.   

public class recursionQ2 {
    static String digits[] = {"zero", "one", "two", "three","four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        printDigits(2025);
        System.out.println();
    }
}
