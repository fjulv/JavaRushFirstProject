public class Decipher {

    public static String decipher(String message, int offset) {
        int off = Constants.ALPHABET.length() - (offset % Constants.ALPHABET.length());
        return Cipher.cipher(message, off);
    }
}
