import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        CaesarCipher caesarCipher = new CaesarCipher();

        while (true) {
            menu.showMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> caesarCipher.encryptText();
                case 2 -> caesarCipher.decipheredText();
                case 3 -> caesarCipher.decipheredBruteForce();
                case 4 -> {
                    System.out.println("Ну ты это, заходи, если чё...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Введи цифру от 1 до 4");
                }
            }
        }
    }
}