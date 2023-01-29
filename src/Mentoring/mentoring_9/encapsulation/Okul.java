package Mentoring.mentoring_9.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String name;

    private List<Kurs> list = new ArrayList<>();

    public Okul(String name) {
       setName(name);
    }

    public void kursEkle(Kurs kurs){

        this.list.add(kurs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Kurs> getList() {
        return list;
    }

    public void setList(List<Kurs> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
