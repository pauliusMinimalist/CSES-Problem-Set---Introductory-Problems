import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long[] a = getScannerArray();
        System.out.println(getMissingNo(a, a.length));
    }


    static long getMissingNo(long[] a, long n) {
        long total;
        total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }
    static long[] getScannerArray() {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long[] numbers = new long[(int) (num - 1)];

        for (int i = 0; i < num - 1; i++) {
            numbers[i] = input.nextLong();
        }

        input.close();
        return numbers;
    }
}
