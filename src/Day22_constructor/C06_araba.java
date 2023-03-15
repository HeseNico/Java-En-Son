package Day22_constructor;

public class C06_araba {

     /*
        Bir obje olusturulurken
        default constructor veya parametresiz gorunur constructor kullanilirsa
        obje ilk atanan degerlere sahip olur
        istedigimiz degerleri atamak icin tek tek tum variable'lara
        atama yapmamiz gerekir
        Bunun yerine
        atamak istedigimiz degerleri parametre olarak
        constructor'a yollayalim
        ve atamalari constructor icinde yapalim
     */

    public  C06_araba(String mrk , String mdl, boolean hmi , int fyt, int yl){

        yil=yl;
        marka=mrk;
        model=mdl;
        hasarkadi=hmi;
        fiyat=fyt;

    }

    public C06_araba(){

    }

    @Override
    public String toString() {
        return "C06_araba{" +
                "yil=" + yil +
                ", fiyat=" + fiyat +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarkadi=" + hasarkadi +
                '}';
    }

    int yil;
    int fiyat;
    String  marka="Belirtilmemis";
    String model="Belirtilmemis";


    boolean hasarkadi;

    public void yakittuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin" :
                System.out.println("Benzinli arac 6l/100 km");
                break;
            case "Diesel":
                System.out.println("Diesel arac 5l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrik 5kw/100");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }
}
