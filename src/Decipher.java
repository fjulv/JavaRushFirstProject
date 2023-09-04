public class Decipher {

    public static String decipher(String message, int offset) {
        int off = Constans.ALPHABET.length() - (offset % Constans.ALPHABET.length());
        return Cipher.cipher(message, off);
    }
}
