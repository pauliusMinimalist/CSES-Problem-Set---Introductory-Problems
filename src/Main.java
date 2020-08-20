import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String segment = in.next();
        System.out.println(whileLetters(segment));
    }

    private static int whileLetters(String segment) {
        String[] segmentArray = segment.split("");
        int max = 0;
        int maximum = 0;
        int j = 0;

        for (int i = 0; i < segmentArray.length; i += j) {
            j = i;
            max = 0;
            try {
                while (segmentArray[i].equals(segmentArray[j])) {
                    max++;
                    j++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
            if (maximum < max) {
                maximum = max;
            }
            j -= i;
        }
        return maximum;
    }
}
