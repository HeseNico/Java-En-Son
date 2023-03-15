package Day11_stringmanupulation_forlop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str="java candir";
        System.out.println(str.isEmpty());// false
        System.out.println(str.isBlank());//buda diyorki str spaclerden mi bosluklardan mi olusuyor //false
        str="   ";
        System.out.println(str.isEmpty());// bos degil cunku 3 space yani bosluk var
        System.out.println(str.isBlank());// true cunku sadece bosluklardan olusur

        str="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());// true hicligi blank olarak kabul etti



    }
}
