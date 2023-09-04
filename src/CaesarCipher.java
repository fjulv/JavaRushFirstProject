import java.util.Scanner;

public class CaesarCipher {

    Scanner scanner = new Scanner(System.in);

    public void encryptText() {
        System.out.println("Введи ключ для шифрования: ");
        int key = scanner.nextInt();
        String inputText = FileManager.readFile(Constants.TEXT_INPUT_FILE);
        FileManager.writeFile(Constants.TEXT_ENCRYPTED_FILE, Cipher.cipher(inputText, key));
        System.out.println("Зашифрованный текст добавлен в файл " + Constants.TEXT_ENCRYPTED_FILE);
    }

    public void decipheredText() {
        System.out.println("Введи ключ для расшифровки: ");
        int key = scanner.nextInt();
        String outputText = FileManager.readFile(Constants.TEXT_ENCRYPTED_FILE);
        FileManager.writeFile(Constants.TEXT_DECIPHERED_FILE, Decipher.decipher(outputText, key));
        System.out.println("Расшифрованный текст добавлен в файл " + Constants.TEXT_DECIPHERED_FILE);
    }

    public void decipheredBruteForce(){
        String encryptText = FileManager.readFile(Constants.TEXT_ENCRYPTED_FILE);
        String breakText = BruteForce.breakCipher(encryptText);
        FileManager.writeFile(Constants.TEXT_BRUTEFORCE_FILE, breakText);
        System.out.println("Взломанный текст добавлен в файл " + Constants.TEXT_BRUTEFORCE_FILE);
    }
}
