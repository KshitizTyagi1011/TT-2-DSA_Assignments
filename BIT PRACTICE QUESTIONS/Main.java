public class Main {
    public static int countIntegers(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }

        return (int) Math.pow(2, count);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countIntegers(n);
        System.out.println(result);  // Output: 3
    }
}
