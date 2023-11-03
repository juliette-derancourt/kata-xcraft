package fr.xcraft;

public class Module4 {

    public static final String DELIMITER = ";";

    public static String process(String input) {
        String[] split = input.split(DELIMITER);
        return split[0] + '\n' + toHexa(split[1], split[2]);
    }

    private static String toHexa(String toDecode, String patternToKeep) {
        return toDecode;

        // to hexa
        //✅ signifie garder
        //❌ signifie ne pas garder
    }

}
