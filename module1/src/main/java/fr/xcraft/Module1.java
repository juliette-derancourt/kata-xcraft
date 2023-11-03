package fr.xcraft;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module1 {

    public static String process(String input) {
        Pattern pattern= Pattern.compile("```(.*)```", Pattern.MULTILINE);
        Matcher matcher=pattern.matcher(input);
        StringBuilder output = new StringBuilder();
        if (matcher.find()){ // Rapport de progrès : ça match pas
            String output1=matcher.group(1);
            output.append(output1);
            output.append("\n\n");
        }
        if (matcher.find()){
            String output1=matcher.group(1);
            output.append(output1);
            output.append("\n\n");
        }
        if (matcher.find()){
            String output1=matcher.group(1);
            output.append(output1);
            output.append("\n\n");
        }

        return input;
    }

}
