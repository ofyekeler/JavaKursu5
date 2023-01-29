package Mentoring.mentoring_8.accessModifiers.ornek2_Deneme;

import Mentoring.mentoring_8.accessModifiers.ornek2.Human;

public class Teacher extends Human {

    public int phone;

    public Teacher(String name, String surname, int age, String address, int phone) {
        super(name, surname, age, address);
        this.phone = phone;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "phone=" + phone +
               " " + super.toString() +
                '}';
    }
}
