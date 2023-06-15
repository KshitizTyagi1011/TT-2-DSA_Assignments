// Q1 : Perfect Number using recursion only
// Write a java program to find all Perfect numbers between 1 to n using recursion.

// Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

// For example: 6 is the first perfect number
// Proper divisors of 6 are 1, 2, 3
// Sum of its proper divisors = 1 + 2 + 3 = 6.
// Hence 6 is a perfect number.

import java.util.ArrayList;

public class Perfect_Number {
    public static ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i, i / 2, 0)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfectNumber(int number, int divisor, int sum) {
        if (divisor == 0) {
            return sum == number;
        }

        if (number % divisor == 0) {
            sum += divisor;
        }
        return isPerfectNumber(number, divisor - 1, sum);
    }

    public static void main(String[] args) {
        int n = 1000;
        ArrayList<Integer> perfectNumbers = perfect(n);
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int number : perfectNumbers) {
            System.out.println(number);
        }
    }
}


/*OUTPUT: Perfect numbers between 1 and 1000:
          6
          28
          496
*/
