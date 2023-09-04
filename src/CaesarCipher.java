import java.util.Scanner;

public class CaesarCipher {

    Scanner scanner = new Scanner(System.in);

    public void encryptText() {
        System.out.println("Введи ключ для шифрования: ");
        int key = scanner.nextInt();
        String inputText = FileManager.readFile(Constans.TEXT_INPUT_FILE);
        FileManager.writeFile(Constans.TEXT_ENCRYPTED_FILE, Cipher.cipher(inputText, key));
        System.out.println("Зашифрованный текст добавлен в файл " + Constans.TEXT_ENCRYPTED_FILE);
    }

    public void decipheredText() {
        System.out.println("Введи ключ для расшифровки: ");
        int key = scanner.nextInt();
        String outputText = FileManager.readFile(Constans.TEXT_ENCRYPTED_FILE);
        FileManager.writeFile(Constans.TEXT_DECIPHERED_FILE, Decipher.decipher(outputText, key));
        System.out.println("Расшифрованный текст добавлен в файл " + Constans.TEXT_DECIPHERED_FILE);
    }

    public void decipheredBruteForce(){
        String encryptText = FileManager.readFile(Constans.TEXT_ENCRYPTED_FILE);
        String breakText = BruteForce.breakCipher(encryptText);
        FileManager.writeFile(Constans.TEXT_BRUTEFORCE_FILE, breakText);
        System.out.println("Взломанный текст добавлен в файл " + Constans.TEXT_BRUTEFORCE_FILE);
    }
}
