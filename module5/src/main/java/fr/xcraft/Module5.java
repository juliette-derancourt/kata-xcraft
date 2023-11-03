package fr.xcraft;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Module5 {

    /**
     * Example:
     * keysOrder = abcde -> fghij -> klmno -> pqrst
     * encodedMessage = message XOR abcd XOR ghij XOR klm XOR rst
     */
    public static String process(String encodedMessage, String keysOrder, String keys) {

        // pour rappel
        String module2output = "KBsKASEWZ3AMFG4XWCRSXT0eBnVXdWx0AXsjV2IdGhtaBiZjZWkVUnpoVGUXWhxwVGQdIXQBHm1+E3VoExA=";
        String module3output = "key1 -> key1 -> key2 -> key1";
        String module4output = """
                key1
                B08D207
                key2
                62734D49343156
                """;

        // le vrai code
        byte[] dehashed = Base64.getDecoder().decode(encodedMessage);
        String dehashedString = new String(dehashed, StandardCharsets.UTF_8);

        // TODO appliquer les clés dans l'ordre
        
        return "";
    }

}
