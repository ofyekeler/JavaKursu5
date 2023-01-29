package Gun26._02_Ornek2;

public class Person {
    String name;
    String surName;
    int age;

    public void BilgiYazdir(){

        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);

    }
    public String toString(){
        return name+" "+surName+" "+age; // toString formatında return ettik.

    }
/*4.adım*/public void getBirthYear(){
        System.out.println("doğum yılı= "+(2022-age));
    }
/*4.adım*/public String getBirthYear2(){
        return "doğum yılınız= "+(2022-age);
    }
/*5.adım*/public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+
                        surName.toUpperCase().charAt(0)+".");
    }
}