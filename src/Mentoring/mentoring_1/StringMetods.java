package Mentoring.mentoring_1;

public class StringMetods {
    public static void main(String[] args) {

        String word = "Techno Study";

        System.out.println("word uzunluğu : " + word.length());
        System.out.println("word un küçük harfle yazımı: "+ word.toLowerCase());
        System.out.println("word un büyük harfle yazımı:" + word.toUpperCase());
        System.out.println("word boş mu: " + word.isEmpty());
        System.out.println("3 no index karakteri: " + word.charAt(3));
        System.out.println("h harfinin indexi: " + word.indexOf("h"));
        System.out.println("z harfi var mı?: " + word.contains("z"));
        System.out.println(word.substring(0,word.indexOf(" ")));
        System.out.println(word.substring(6));

        String a = "Merhaba";
        String b = "Java";
        System.out.println(a.concat(" ").concat(b));



    }
}
