import acm.program.ConsoleProgram;

import java.io.Console;

/**
 * The problem with merge sort on big data.
 */

public class MergeSort extends ConsoleProgram {


    public void run(){
        String unsortedSampleOne = "54187263";
        String unsortedSampleTwo = "541867263";
        String unsortedSampleThree = "11423315";

        int length =  unsortedSampleOne.length();
        //println(length);

        if(length % 2  == 0) {
            int midPoint = length / 2;
            //println(midPoint);
            String firstHalf = unsortedSampleOne.substring(0, midPoint);
            println(firstHalf);
            String secondHalf = unsortedSampleOne.substring(midPoint, length);
            println(secondHalf);
            String firstHalfSorted =  mergeSorted(firstHalf);
            println(firstHalfSorted);
            //println(thisSort(firstHalf));
            //thisSort(secondHalf);
        }
        else {

        }
    }

    private String mergeSorted(String firstHalf){
//        char firstDigit = firstHalf.charAt(0);
//        char lastDigit = firstHalf.charAt(firstHalf.length() -1);
//        char nextDigit =  '0';
        boolean isSorted = false;
        int count = 0;
        int stringMaxLength = firstHalf.length();
        while(!isSorted) {
            char firstDigit = firstHalf.charAt(0);
            if(count == stringMaxLength - 1) {
                mergeSorted(firstHalf);
            }
            char currentDigit =  firstHalf.charAt(count);;
            char nextDigit = ' ';
            if(count == stringMaxLength - 1) {
                 nextDigit = firstHalf.charAt(firstHalf.length() - 1);
            } else {
                 nextDigit = firstHalf.charAt(count + 1);
            }
            char lastDigit = firstHalf.charAt(firstHalf.length() -1);
            println("first digit is : " + firstDigit);
            println("current digit is :" + currentDigit);
            println( "next digit is : " + nextDigit);
            println("last digit is :" + lastDigit);
            if(currentDigit < nextDigit){
                sortedFistHalf = sortedFistHalf + currentDigit;
            }

            println( "Sorted now is: " + sortedFistHalf);
            count++;
            if(count == 30){
                isSorted = true;
            }
        }

        return sortedFistHalf;
    }

    public String sortedFistHalf = "";
    public String sortedSeciondHalf = "";
}
