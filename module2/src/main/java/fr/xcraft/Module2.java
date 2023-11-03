package fr.xcraft;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Module2 {

    public static String process(String input) {
        String output = "";
        String[] listOfMorseLetter = extractMorseFromInput(input);
        for (int i = 0; i < listOfMorseLetter.length; i++) {

            output += fromMorse(listOfMorseLetter[i]);
        }
        return Base64.getEncoder().encodeToString(output.getBytes(StandardCharsets.UTF_8));
    }

    private static String[] extractMorseFromInput(String input) {
        // le input va contenir les données pour le module2 puis un séparateur
        // puis les données pour le module3 puis un séparateur
        // puis les données pour le module4
        String[] lines = input.stripLeading().split("\n\n");
        // apparament c'est que la deuxième ligne du morse qu'il faut traduire
        return lines[0].split("\n")[1].split(" ");
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
