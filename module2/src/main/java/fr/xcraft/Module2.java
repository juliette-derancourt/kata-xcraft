package fr.xcraft;

public class Module2 {

    public static String process(String input) {
        String output = "";
        String[] listOfMorseLetter = input.split(" ");
        for (int i = 0; i < listOfMorseLetter.length; i++) {

            output += fromMorse(listOfMorseLetter[i]);
        }
        return output;
    }

    private static String fromMorse(String s) {

        if (s.equals("...--")) {
            return "3";
        }
        if (s.equals("-....")) {
            return "6";
        }
        if (s.equals(".----")) {
            return "1";
        }
        if (s.equals("-.-")) {
            return "K";
        }
        if (s.equals("-...")) {
            return "B";
        }
        return "";
    }


}
