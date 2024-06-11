import acm.program.ConsoleProgram;

import java.util.HashMap;

public class TestEqualsInStringAndHashMap extends ConsoleProgram {

    public void run(){

        String stringOne = "1";
        String stringTwo = "2";
        String areStringsEqual = "The strings are equal";
        String stringsAreNotEqual = "The strings are not equal";
        if(stringOne.equals(stringTwo)) {
            println(areStringsEqual);
        } else {
            println(stringsAreNotEqual);
        }

        String stringThree = "1";
        if(stringOne.equals(stringThree)) {
            println(areStringsEqual);
        } else {
            println(stringsAreNotEqual);
        }

        String hashMapsAreEqual = "These two hash maps are equal";
        String hashMapsAreNotEqual = "These two hash maps are not equal";
        HashMap stringHashMap = new HashMap<String, String>();
        HashMap anotherStringHashMap = new HashMap<String, String>();

        if(stringHashMap.equals(anotherStringHashMap)){
            println(hashMapsAreEqual);
        } else {
            println(hashMapsAreNotEqual);
        }

        HashMap stringHashMapTwo = new HashMap<String, String>();
        HashMap anotherStringHashMapTwo = new HashMap<String, String>();
        anotherStringHashMapTwo.put("One", "One");
        if(stringHashMapTwo.equals(anotherStringHashMap)){
            println(hashMapsAreEqual);
        } else {
            println(hashMapsAreNotEqual);
        }
    }
}
