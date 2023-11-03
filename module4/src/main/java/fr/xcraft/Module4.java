package fr.xcraft;

import java.math.BigInteger;

public class Module4 {

    public static final String DELIMITER = ";";

    public static String process(String input) {
        String[] split = input.split(DELIMITER);
        return split[0] + '\n' + toHexaAndFilter(split[1], split[2]);
    }

    private static String toHexaAndFilter(String toDecode, String patternToKeep) {
        return toDecode;

        // to hexa
        //✅ signifie garder
        //❌ signifie ne pas garder
    }

    public static String toHexa(String toDecode) {
        return String.format("%04x", new BigInteger(1, toDecode.getBytes(/*YOUR_CHARSET?*/))).toUpperCase();
    }

}
