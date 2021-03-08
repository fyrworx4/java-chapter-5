import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int listLength = scnr.nextInt();
        String[] wordList = new String[listLength];
        int[] freqList = new int[listLength];

        int i;
        int j;

        for (i = 0; i < listLength; i++) {
            wordList[i] = scnr.next();
        }

        for (i = 0; i < listLength; i++) {
            //System.out.println("--------------------------");
            //System.out.println("Iteration i = " + i);
            
            for (j = 0; j < listLength; j++) {
                //System.out.println("Iteration j = " + j);
                if (wordList[i].compareTo(wordList[j]) == 0) {
                    freqList[i] += 1;
                    //System.out.println(wordList[i] + " matches with " + wordList[j]);
                }
            }
        }

        for (i = 0; i < listLength; i++) {
            System.out.println(wordList[i] + " - " + freqList[i]);
        }


    }
}
