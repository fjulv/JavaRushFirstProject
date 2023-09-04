public class Cipher {

    public static String cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Constans.ALPHABET.indexOf(character) != -1) {
                int startPosition = Constans.ALPHABET.indexOf(character);
                int newPosition = (startPosition + offset) % Constans.ALPHABET.length();
                char newCharacter = Constans.ALPHABET.charAt(newPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
