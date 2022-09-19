import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Auth {
    private String path;

    public Auth(String path) {
        setPath(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean login(String login, String pass, Hasher hasher) throws IOException {
        Map<String, String> usrData = read();
        if (usrData.containsKey(login)) {
            return hasher.hash(pass).equals(usrData.get(login));
        }
        return false;
    }

    public boolean register(String login, String pass, Hasher hasher) throws IOException {
        Map<String, String> usrData = read();
        if (!usrData.containsKey(login)) {
            append("\n" + login.concat("," + hasher.hash(pass)));
            return true;
        }
        return false;
    }

    private Map<String, String> read() throws IOException {
        LinkedList<String> lines = new LinkedList<>(Files.readAllLines(Path.of(path)));

        Iterator<String> iterator = lines.iterator();
        Map<String, String> userMap = new HashMap<>();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.isBlank()) {
                iterator.remove();
                continue;
            }
            String[] split = next.split(",");
            userMap.put(split[0], split[1]);
        }
        return userMap;
    }

    private void append(String text) throws IOException {
        Files.write(Path.of(path), text.getBytes(), StandardOpenOption.APPEND);
    }
}
