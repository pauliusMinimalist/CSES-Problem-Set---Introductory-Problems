import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        System.out.print(n);
        if (n > 0) {
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.print(" " + n);
                } else {
                    n = n * 3 + 1;
                    System.out.print(" " + n);
                }
            }
        }
    }
}
