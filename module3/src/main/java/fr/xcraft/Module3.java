package fr.xcraft;

import java.util.stream.Stream;

public class Module3 {

    public static String process(String input) {
        return processLine(input);

    }

    public static String processLine(String input) {
        String splitInput = """
key1 [x2]
key2
key1 [x1]
""";
        String[] lignes = splitInput.split("\n");

        // Parcourir et afficher chaque ligne
        for (String ligne : lignes) {
            // Trier par ordre ascendant
            System.out.println(ligne);
        }
        String key = lignes[0];
        if(lignes.length == 1) {
            return key;
        }
        
        String timesString = lignes[1].substring(0, lignes[1].length()-1);
        Integer times = Integer.parseInt(timesString);
        
        return "";

    }

}
