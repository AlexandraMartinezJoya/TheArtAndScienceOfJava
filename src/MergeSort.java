import acm.program.ConsoleProgram;

import java.io.Console;

/**
 * The problem with merge sort on big data.
 */

public class MergeSort extends ConsoleProgram {


    public void run(){
        String unsortedSampleOne = "54187263";
        String unsortedSampleTwo = "541867263";

        int length =  unsortedSampleOne.length();
        //println(length);

        if(length % 2  == 0) {
            int midPoint = length / 2;
            int intermediary = 0;
            //println(midPoint);
            String firstHalf = unsortedSampleOne.substring(0, midPoint);
            println(firstHalf);
            String secondHalf = unsortedSampleOne.substring(midPoint, unsortedSampleOne.length());
            println(secondHalf);
            String firstHalfSorted =  thisSort(firstHalf);
            println(firstHalfSorted);
            //println(thisSort(firstHalf));
            //thisSort(secondHalf);
        }
    }

    private String thisSort(String firstHalf){
        char firstDigit = firstHalf.charAt(0);
        char lastDigit = firstHalf.charAt(firstHalf.length() -1);
        char intermediary = '0';
        char smallest = '0';
        char nextDigit =  '0';
        boolean isSorted = false;
        String sorted = "";
        while(!isSorted) {
            for (int currentNumberInSequence = 0; currentNumberInSequence <= firstHalf.length() -1; currentNumberInSequence++){
                char currentChar = firstHalf.charAt(currentNumberInSequence);
               // println(currentChar);
                if(firstHalf.length() - 1 != currentNumberInSequence){
                    println("There still is a next char");
                    char nextChar = firstHalf.charAt(currentNumberInSequence + 1);
                   // println("The next char is : " + nextChar);
                    if (currentChar < nextChar ) {
                        smallest = currentChar;
                        intermediary = nextChar;
                        nextChar =  firstHalf.charAt(currentNumberInSequence + 2);

                        println(smallest);
                        println(intermediary);
                        println(nextChar);
                        sorted += ""+ smallest;
                        if(currentNumberInSequence != 0) {
                            String rightNowPt1 =  firstHalf.substring(firstDigit , currentNumberInSequence);
                            String rightNowPt2 =  firstHalf.substring(currentNumberInSequence, lastDigit);
                            firstHalf = rightNowPt1 + rightNowPt2;
                        }
                        if(sorted.length() < firstHalf.length() ) {
                            isSorted = false;
                        } else {
                            isSorted = true;
                        }
                    }
                }
            }
        }


        return sorted;
    }
}
