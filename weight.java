import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] weightList = new double[5];
        int i;

        double total = 0;
        double average = 0;
        double max = 0;

        // User Input Section 
        for (i = 0; i < 5; i++) {
            System.out.println("Enter weight " + (i + 1) + ":");
            weightList[i] = scnr.nextDouble();
        }

        System.out.print("You entered: ");

        for (i = 0; i < 5; i++) {
            System.out.print(weightList[i] + " ");
        }

        System.out.println();
        System.out.println();

        // get totals
        for (i = 0; i < 5; i++) {
            total += weightList[i];
        }
        
        // get average
        average = total / 5;

        // max
        for (i = 0; i < 5; i++) {
            if (weightList[i] > max) {
                max = weightList[i];
            }
        }

        System.out.println("Total weight: " + total);
        System.out.println("Average weight: " + average);
        System.out.println("Max weight: " + max);

        
    }
}
