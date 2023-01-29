package Mentoring.mentoring_8.static_keyword.ornek1;

public class Student {

    String firstname;

    String lastname;

    int schoolNumber;

    int studentCount;

    static int sayac = 1;

    public Student(String firstname, String lastname, int schoolNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolNumber = schoolNumber;
        studentCount = sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", studentCount=" + studentCount +
                '}';
    }
}
