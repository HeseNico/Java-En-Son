package Day26_LocalTime;

import java.util.Arrays;

public class C08_Varargs {

    public static void main(String[] args) {

        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6);
        topla(1,2,3,4,5,6);
        topla(1,9,5,6,7,8,6,2,5,8,9);

    }
    public static void topla(int... a){
        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a) {
            toplam +=each;

        }
        System.out.println(" Toplam : " + toplam);

    }
        /*
          Java da bir metod parametrelerine uygun argiumente sahib metod call oldugunda calisir

          ornegin 2 int parametre varsa
          sadece sadece 2 int argument ile metod call yapildiginda calisir

          Java ayni data turune sahip olmak sartiyla
          parametre sayisini esnek tuta bilmek icin Varargs olusturmustur


          Varargs bir arr dir bu yuzden bu kadar parametre kabur ediyor ne yazarsak onu biir arrays olarak kaydeder

        */
}
