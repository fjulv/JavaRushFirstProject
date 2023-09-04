public class Cipher {

    public static String cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Constants.ALPHABET.indexOf(character) != -1) {
                int startPosition = Constants.ALPHABET.indexOf(character);
                int newPosition = (startPosition + offset) % Constants.ALPHABET.length();
                char newCharacter = Constants.ALPHABET.charAt(newPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
