import java.io.File;

public class Main {
    public static void main(String[] args) {
        new AuthGUI(new File("src\\database.txt").getAbsolutePath());
    }
}
