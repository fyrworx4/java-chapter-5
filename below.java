import java.util.Scanner;

public class below {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues = scnr.nextInt();
        int[] userValues = new int[numValues];
        int i;

        for (i = 0; i < numValues; i++) {
            userValues[i] = scnr.nextInt();
        }

        int threshold = scnr.nextInt();

        for (i = 0; i < numValues; i++) {
            if (userValues[i] <= threshold) {
                System.out.print(userValues[i] + ",");
            }
        }

        System.out.println();


    }
}
