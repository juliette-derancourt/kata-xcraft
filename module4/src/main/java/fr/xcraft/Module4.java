package fr.xcraft;

import java.math.BigInteger;
import java.util.HexFormat;

public class Module4 {

    public static final String DELIMITER = ";";

    public static String process(String input) {
        String[] split = input.split(DELIMITER);
        return split[0] + '\n' + toHexaAndFilter(split[1], split[2]);
    }

    private static String toHexaAndFilter(String toDecode, String patternToKeep) {
        String toHexa = toHexa(toDecode);
        return toHexa.substring(4);

        // to hexa
        //✅ signifie garder
        //❌ signifie ne pas garder
    }

    public static String toHexa(String toDecode) {
        StringBuilder output= new StringBuilder();
        for (int i = 0; i < toDecode.length(); i++) {
            output.append(String.format("%020x", toDecode.getBytes()[i])
                              .toUpperCase());
        }
        return output.toString();
    }

}
