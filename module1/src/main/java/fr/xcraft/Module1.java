package fr.xcraft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module1 {

    public static String process(String input) {
        Pattern pattern= Pattern.compile("```\\n(.*)\\n```");
        Matcher matcher=pattern.matcher(input);
        matcher.find();
        return matcher.group(0); // la regex trouve, mais le test module1_should_get_triple_backquoted_content on a pas réussi à extraire juste la chaine "code"
    }

}
