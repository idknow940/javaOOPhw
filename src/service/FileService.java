package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static Path getPath(String path) {
        if ((path != null) && !path.isBlank()) {
            return Path.of(path);
        }
        return null;
    }

    public static String[] readLines(Path path) throws IOException {
        if (path != null) {
            return Files.readAllLines(path).toArray(new String[0]);
        }
        return null;
    }

    public static void write(Path path, String str) throws IOException {
        Files.write(path, str.getBytes());
    }

    public static void create(Path path) throws IOException {
        Files.write(path, "".getBytes(), StandardOpenOption.CREATE);
    }

    public static void append(Path path, String str) throws IOException {
        String[] lines = FileService.readLines(path);
        String total = "";
        for (int i = 0; i < lines.length + 1; i++) {
            if (i < lines.length && lines[i] != null){
                total =
                        i != 0 ?
                        total.concat("\n" + lines[i])
                        :
                        total.concat(lines[i]);
            } else {
                total = total.concat("\n" + str);
            }
        }
        Files.write(path, total.getBytes());
    }
}
