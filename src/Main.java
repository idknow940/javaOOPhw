import service.StudentServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.putStudents(studentService.loadStudentsFromAFile("log.txt", ","));
    }
}
