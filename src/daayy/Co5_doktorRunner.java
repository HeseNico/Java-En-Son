package daayy;

public class Co5_doktorRunner {
    public static void main(String[] args) {

        C04_Doktor doktor1=new C04_Doktor();

        doktor1.isim="Hasan";
        doktor1.yas=32;

        System.out.println(doktor1.isim); // hasan yazar atadigimiz icin
        System.out.println(doktor1.soyisim);// Henuz atanmamis yazar kaliptan gelen
        System.out.println(doktor1.adres); // null yazar

        C04_Doktor doktor2=new C04_Doktor();

        doktor2.isim="Hilal";
        doktor2.yas=28;


        System.out.println(doktor2.isim);// Hilal atadigmiz icin hilal
        System.out.println(doktor2.soyisim);// atanmadigimiz icin kaliptan gelen "Henuz atanmamis" yazar
        System.out.println(doktor2.yas);// atadigimiz yasi yaza 28


        // Yani ilk olusturdugumuz contructor yani kalip atandikca  yeni urun cikar


    }
}
