package Gun28._02_Ornek;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap(){
        this("",0,"");
    }

/*kit2*/public Kitap(String name, int publishYear, String author)    {
        this.name = name;
        this.publishYear = publishYear;
        this.author =author;
    }

/*kit3*/public Kitap(String name, int publishYear)    {
        this(name,publishYear,"");
    }


/*DöndürVeYazdır*/public String toString(){
        return name+" "+author+" "+publishYear;
    }
}
