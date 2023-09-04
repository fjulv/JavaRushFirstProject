import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileManager {

    public static String readFile(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.readString(path);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла " + e.getMessage());
            return "";
        }
    }

    public static void writeFile(String filePath, String text) {
        try {
            Path path = Paths.get(filePath);
            Files.writeString(path, text);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла " + e.getMessage());
        }
    }
}


