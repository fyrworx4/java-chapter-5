import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;
        int i;

        numElements = scnr.nextInt();

        // Below will populate userList with values
        for (i = 0; i < numElements; i++) {
            userList[i] = scnr.nextInt();
        }

        for (i = 1; i <= numElements; i++) {
            System.out.print(userList[numElements - i] + ",");
        }
    }    
}
