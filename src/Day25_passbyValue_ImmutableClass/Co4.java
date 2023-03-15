package Day25_passbyValue_ImmutableClass;

public class Co4 {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3= new String("Java");
        String str4="Ja"+"va";
        String s   ="Ja";
        String t   ="va";
        String str5=s.concat(t);  // Java

        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(s.concat(t))); // true

        System.out.println("==========");

        System.out.println(str1==str2); // true
        System.out.println(str1==str4); // true
        System.out.println(str1==str5); // false
        System.out.println(str1==str3); // false
        // bazilari dogru bazilari yanliz bu yuzden esitlikte hata olmamasi icin equals kullanmali


    }
}
