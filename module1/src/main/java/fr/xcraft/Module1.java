package fr.xcraft;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module1 {

    public static String process(String input) {
        Pattern pattern= Pattern.compile("```(.*)```");
        Matcher matcher=pattern.matcher(input);
        if (matcher.find()){
            String output=matcher.group(1);
            System.out.println(output);
        }else{
            System.out.println("pas de code");
        }

        return input;
    }

}
