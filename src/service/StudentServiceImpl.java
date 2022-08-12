package service;

import model.Student;

import java.io.IOException;
import java.time.LocalDate;

public class StudentServiceImpl implements StudentService {
    @Override
    public void printStudents(Student[] students) {
        if (students != null) {
            for (Student s : students) {
                if (s != null) {
                    System.out.println(s);
                }
            }
        }
    }

    @Override
    public Student[] loadStudents(String[] studentsRaw, String regex) {
        Student[] students = null;
        if ((studentsRaw != null) && ((regex != null) && !regex.isBlank())) {
            students = new Student[studentsRaw.length];
            for (int i = 0; i < studentsRaw.length; i++) {
                if ((studentsRaw[i] != null) && !studentsRaw[i].isBlank()) {
                    String[] split = studentsRaw[i].split(regex);
                    if (split.length >= 5) {
                        students[i] = new Student(
                                split[0].trim(),
                                split[1].trim(),
                                split[2].trim(),
                                Integer.parseInt(split[3].trim()),
                                Double.parseDouble(split[4].trim())
                        );
                    } else {
                        System.out.println("need at least 5 fields on each line");
                    }
                }
            }
        }
        return students;
    }

    @Override
    public int getStudentAge(Student student) {
        if (student != null) {
            return LocalDate.now().getYear() - student.getYearOfBirth();
        }
        return 0;
    }

    @Override
    public Student[] loadStudentsFromAFile(String path, String regex) throws IOException {
        StudentServiceImpl studentService = new StudentServiceImpl();
        String[] lines = FileService.readLines(FileService.getPath("log.txt"));
        return studentService.loadStudents(lines, ",");
    }

    @Override
    public void putStudents(Student[] students) throws IOException {
        if (students != null) {
            for (Student s : students) {
                if (s != null) {
                    FileService.write(FileService.getPath(s.getFullName() + ".txt"), s.toString());
                }
            }
        }
    }
}
