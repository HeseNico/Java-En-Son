package Day16_Scope_arrays;

public class C01_Hastahane {

    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikyaptimi);// onceki sayfada deger atamadigimiz icin default aldi false
        dok1.isim="Kemal";
        dok1.soyisim="Yilmaz";
        dok1.dogumyili=1980;

        System.out.println(dok1.isim); // Kemal yazdi

        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);// bull yazar cunku veriablesi kendisini baglar
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim);// deger atadik bu sahsiz soyadini alir karismaz Celik

        System.out.println(dok1.fakulte);// Tip
        System.out.println(dok2.fakulte);// sariya boyadi Tip

        dok1.isim="Burcu";
        System.out.println(dok2.isim);// null olur dotor 1 degistiyse degissin dok2 ilgilendirmez
        // dok2 bir atama yapmadik
        dok1.fakulte="Tip fakultesi";
        System.out.println(dok2.fakulte);//Tip fakultesi yazdi

        // isim variable objeden objeye degisir
        // degisen bir obje digerini ilgilendirmez
        // ama statik variable fakulte tip oldugu icin tip mezunu adi
        // altinda 26 satirdan sonra tip fakultesi atandi

        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumyili);//0 yazar atama yapmadik

        System.out.println(dok3.fakulte);//Tip fakultesi yazar
        // static oldugu icin enson neyse o olur


    }
}
