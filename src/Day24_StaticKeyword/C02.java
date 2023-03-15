package Day24_StaticKeyword;

public class C02 {
    public static void main(String[] args) {


        double fiyat=200;


        indirimyap10(fiyat);
        System.out.println("Method calldan sonra : " +fiyat); // 200 vegasta olan vegasta kalir
        // metodda olan metodda kalir burada yazdirirsak 200 yazar

        indirimyap25(fiyat);

        System.out.println("%25 indirimli fiyat : " +fiyat);
        System.out.println(" return fiyat: " +indirimliFiyatgetir10(fiyat));
        System.out.println(fiyat);

        // kalci olarak degistirmek istersek main metiodunda atama yapmaliyiz

        fiyat=indirimliFiyatgetir10(fiyat);
        System.out.println("main icinde atama yaptiktan sonra:" +fiyat);
        System.out.println(fiyat);// 180 artik atama yapildi daima bu gecer yeni bir atamaya kadar ama main icinde

    }

    public static void indirimyap10(double fiyat){// double fiyat= degeri metodun cagildigi yerden
        // double fiyat burada fiyat yerine ne yazarsak sonuc degismez

        // atama varsa kalici olarak degisir
        fiyat=fiyat*0.8;
        System.out.println("%20 indirimli fiyat : " + fiyat);
        System.out.println("Return yapilan metod" + indirimliFiyatgetir10(fiyat));

    }
    public static void indirimyap25(double fyt){
        // double fiyat burada fiyat yerine ne yazarsak sonuc degismez

        // atama varsa kalici olarak degisir
        fyt=fyt*0.75;
        System.out.println("%25 indirimli fiyat : " + fyt);

    }
public static double indirimliFiyatgetir10(double fiyat){
        fiyat=fiyat*0.9;
        return fiyat;
}

}
