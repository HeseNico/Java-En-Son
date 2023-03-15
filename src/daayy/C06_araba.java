package daayy;

public class C06_araba {


    public C06_araba(int yl, String mrk, String mdl, boolean hsr, int fyt) {
        this.yil = yl;
        this.marka = mrk;
        this.model = mdl;
        this.hasrkydi = hsr;
        this.fiyat = fyt;
    }

    C06_araba(){

    }

    int yil;
    String marka="Marka Belertilmemis";
    String model="Marka Belertilmemis";
    boolean hasrkydi;
    int fiyat;

    @Override
    public String toString() {
        return "C06_araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasrkydi=" + hasrkydi +
                ", fiyat=" + fiyat +
                '}';
    }

    public void yakitTukemi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin":
                System.out.println("100 km de 6l yakar");
                break;
            case "Diesel":
                System.out.println("100 km de 4l yakar");
                break;
            case "Elektrik":
                System.out.println("100 km de 50kW yakar");
                break;
            default:
                System.out.println("Gecersiz yakit Turu");
        }
    }
}
