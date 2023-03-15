package Day24_StaticKeyword;

public class C02_passByValue {
    public static void main(String[] args) {

        double fiyat=200;


        /*
        int fiyat=500
        Java ayni method icerisinde ayni isimde birden fazla variable
        olusturulmasina izin vermez

         */

        indirimYap10(fiyat);
        System.out.println("method call dan sonra fiyat : "+ fiyat);

    }

    public static void indirimYap10(double fiyat){

        fiyat= fiyat*0.9;

        System.out.println("%10 indirimli fiyat : " + fiyat);

        // atama varsa kalici olarak degisir

    }
}
