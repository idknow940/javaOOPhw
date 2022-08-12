package service;

import model.Student;

import java.io.IOException;

public interface StudentService {
    void printStudents(Student[] students);

    Student[] loadStudents(String[] studentsRaw, String regex);

    int getStudentAge(Student student);

    Student[] loadStudentsFromAFile(String path, String regex) throws IOException;

    void putStudents(Student[] students) throws IOException;
}
