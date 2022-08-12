package model;

public class Student {
    private String fullName = "undefined";
    private String address = "undefined";
    private String university = "undefined";
    private Integer yearOfBirth = 1970;
    private Double mark = 0.0;

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + getFullName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", university='" + getUniversity() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", mark=" + getMark() +
                '}';
    }

    public Student(String fullName, String address, String university, int yearOfBirth, Double mark) {
        setFullName(fullName);
        setAddress(address);
        setUniversity(university);
        setYearOfBirth(yearOfBirth);
        setMark(mark);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if ((fullName != null) && !fullName.isBlank())
            this.fullName = fullName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if ((address != null) && !address.isBlank()) {
            this.address = address.trim();
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        if ((university != null) && !university.isBlank()) {
            this.university = university.trim();
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
