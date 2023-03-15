package Day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListeolusturma());
    }

    public static List<String> kullaniciyaListeolusturma(){

        List<String> isimler=new ArrayList<>();
        String girilenisim="";
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Listeye icin isim girin"+
                               "\nBitirmek icin Q basiniz" );

            girilenisim= scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }
        }while(!girilenisim.equalsIgnoreCase("Q"));

        return isimler;



    }

}
