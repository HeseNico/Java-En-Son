package Day22_constructor;

public class C05_DoktorRunner {

    public static void main(String[] args) {

        C04_Doktor doktor1= new C04_Doktor();
        doktor1.isim="Kemal";
        doktor1.soyisim="Efe";
        doktor1.yas=40;

        System.out.println(doktor1.soyisim);
        System.out.println(doktor1.evlimi);


        C04_Doktor doktor2=new C04_Doktor();
        doktor2.isim="Hasan";
        doktor2.yas=32;


        System.out.println(doktor2.isim);
        System.out.println(doktor2.soyisim);
        System.out.println(doktor2.yas);

        C04_Doktor doktor3 ;// bir obje olusturamadiim ama bir variable oldu
        // ortada bir obje yok niyet var olmak adina demek
        //System.out.println(doktor3.yas); calismaz
        // Consturoctor calismadan bir obje olusturulup deger atanmasi mumkun degildir

        System.out.println("variable atanamayan obje icin yas " + new C04_Doktor().yas);
        // variable atanamayan obje icin yas 0

       // sag tarafi calisirirsak sadece istedigimiz variable yazdirir

    }
}
