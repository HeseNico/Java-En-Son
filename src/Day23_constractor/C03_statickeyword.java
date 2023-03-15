package Day23_constractor;

public class C03_statickeyword {
    static String hastahaneismi="Yildiz Hastahanesi";
    static String hastahaneTelefonu="877665544534";
    static String bashekimIsmi="Hasan Efe";

    String persIsmi;
    String persAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_statickeyword pers1=new C03_statickeyword();

        System.out.println(pers1.persIsmi);
        System.out.println(hastahaneismi);
        System.out.println(pers1.bashekimIsmi); // Hasan Efe






        C03_statickeyword pers2=new C03_statickeyword();
        pers2.persIsmi="Hasan";
        pers2.perTelefonu="08080898";

        System.out.println(pers2.persIsmi); // atandi Hasan
        System.out.println(pers1.persIsmi); // atanmadi null

        pers2.bashekimIsmi="Hilal";
        System.out.println(pers2.bashekimIsmi); // Hilal
        
        // pers2.bashekimIsmi degistirirsem pers1.bashekimIsmi ismide degisisir





        /*
        1-Static variable lar tum clas icin gecerlidir(class varable denir)
        2-Static variabler lar tum objeler icin ayni degeri tasidiklari icin
          her obje icin ayrica olusturulmaz sadece 1 variabl olur
        3-Static v. ulasmak veya update etmek icin obje ismi kullanmaya gerek yokatur
          direkt ulasilabilir
          Baska clasdan static v. ulasmak icin clasismi.staticvariableismi yazilir

         */
    }
}
