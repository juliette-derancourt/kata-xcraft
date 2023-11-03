package fr.xcraft;

import java.util.stream.Stream;

public class Module3 {

    public static String process(String input) {
        return processLine(input);
        /*
         * 
         String[] lines = input.split("\n");
 
         String[] splitInput = input.split(" \\[x");
         String key = splitInput[0];
         String times = splitInput[1];
 
         return times;
         */
    }

    public static String processLine(String input) {
        String[] splitInput = input.split(" \\[x");
        String key = splitInput[0];
        if(splitInput.length == 1) {
            return key;
        }
        
        String timesString = splitInput[1].substring(0, splitInput[1].length()-1);
        Integer times = Integer.parseInt(timesString);
        
        return "";

    }

}
