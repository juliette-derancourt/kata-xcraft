package fr.xcraft;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Module5 {

    /**
     * Example:
     * keysOrder = abcde -> fghij -> klmno -> pqrst
     * encodedMessage = message XOR abcd XOR ghij XOR klm XOR rst
     *
     * Pour chaque caractère du message décodé, appliquer un XOR sur la valeur binaire du caractère
     * avec chaque clé dans l'ordre (donc si ya 4 clés key1 -> key1 -> key2 -> key1, on le fait 4 fois avec les bonnes clés)
     *
     * Attention les clés sont transformées selon l'exemple tout en haut :
     * * la première clé on enlève le dernier caractère
     * * la deuxième clé on enlève le premier caractère
     * * la troisième clé on enlève les 2 derniers caractères
     * * la quatrième clé on enlève les 2 premiers caractères
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

    String xor(String s1, String s2) {
        byte[] a = s1.getBytes();
        byte[] b = s2.getBytes();
        byte[] out = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = (byte) (a[i] ^ b[i%b.length]);
        }
        return new String(out, StandardCharsets.UTF_8);
    }

}
