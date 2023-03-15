package Day11_stringmanupulation_forlop;

public class C02_nulPointer {
    public static void main(String[] args) {


        // null bir deger degildir
        // null bir Pointerder
        // ne ise yarar . yanina yazilan non-primitive variable deger atamadigi isartee eder

        String str; //burda yapilan islem str olusturdduk ama deger atamadi

        // java metod icerisinde deger atamadan variable olusturmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez
       // System.out.println(str);// deger atanmamis diyor
       // bazen degeri sonradan atamak yaparak variable olustrurabiliriz

        // stringe deger ataniren cift tirnak icine alinir ama null alinmaz

        str=null; // str="null" degil yazilamaz
                   // null olarak isaretlenmis ama degeri nasl degil

        System.out.println(str);
        //System.out.println(str.concat("Java")); //NullPointerException Run Time Error

        //System.out.println(str.length());// yine nullpointerexseption verir

        System.out.println(str + "java"); // nullJava

        String str2=str + "Java";
        System.out.println("str2 : " + str2); // nulljava

        // null primitive variablea null deger almaz

        // biz genelde String bir ifade olusturup sonra deger atayacaksak
        // hiclik degeri atariz

        String str3=""; // str3 hiclik degeri atanmistir hiclik bir degerdir.
    }
}
