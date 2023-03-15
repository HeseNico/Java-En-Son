package Day22_constructor;

public class C02_hemsire {

    /*
    ornegin bir hastahane programinda
    hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak
    hangi metodlari hemsireler icin kullanmak istiyorsak
    bir hemsire clasi olusturup
    tum bu ozellikleri yani variable ve metodlari o classta olustururuz.

    programda ne zaman bir hemsireye ihtiyac olsa hemsire clasindan obje olustururuz
    boylece otomatik tum metodlara ve variablelere sahib olur

    Eger biz istedigimiz paramatrelere shp bir contructor olusturmazsak
    Java class dan obje olusturulabilmesi icin
    classa default bir contructor koyar

     default constructor GORUNMEZ
     parametresi yoktur,cons. bodysi bostur

     olsaydi boyle olurdu
      C02_hemsire(){
      }
      olmaidgi halde deger atamasi yapablriz

      Bizde istedigimiz parametrelere sahip istedigimiz kadar cons. olusturabiliriz.

      COK ONEMLI: Eger biz bir cons. olusturursak
                  yani claasda gozle gorunen bir conss. varsa
                  Java default conts. siler
                  Bizim olusturdugumuz hicbir cont. default cont denemez



     */

    String isim;
    String soyisim;
    String adres;
    int yas;
    boolean izindeMi;
    char evlimi;
    int ekmesaiucreti=20;

    public int mesaiUcretiHesapla(int mesaisaati){
        return mesaisaati*ekmesaiucreti;
    }

}
