import java.util.HashMap;

public class BruteForce {

    public static String breakCipher(String message) {
        int space = Constans.ALPHABET.indexOf(' ');
        int shift = space - Constans.ALPHABET.indexOf((char) searchRecurringSymbol(message));
        return Cipher.cipher(message, shift);
    }


    private static int searchRecurringSymbol(String message) {
        HashMap<Character, Integer> mapOfSymbols = new HashMap<>();
        for (char character : message.toCharArray()) {
            if (!mapOfSymbols.containsKey(character)) {
                mapOfSymbols.put(character, 1);
            } else {
                mapOfSymbols.put(character, mapOfSymbols.get(character) + 1);
            }
        }
        return getRecurringSymbol(mapOfSymbols);
    }

    private static Character getRecurringSymbol(HashMap<Character, Integer> map) {
        Character maxKey = null;
        for (Character key : map.keySet()) {
            if (maxKey == null || map.get(key) > map.get(maxKey)) {
                maxKey = key;
            }
        }
        return maxKey;
    }
}
