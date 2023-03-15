package Day24_StaticKeyword;

public class C01_StaaticBlocks {
    public static void main(String[] args) {

        System.out.println("Main method calisti");
        System.out.println("===========");

        C01_StaaticBlocks obj1=new C01_StaaticBlocks();

    }

    static {
        /*
        static bloklar class ilk calismaya basladiginda calisir
        genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir

        birden fazla static blok varsa yukaridan asagiya sirasiyla calisir

         */
        System.out.println("static block calisti");
    }
    static {
        System.out.println("Alttaki static blok calisti");
    }
    {
        /*
        static olmayan bloklar ise obje olusturulurken contructur dan once calisir
        obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir
         */
        System.out.println("static olmayan blok calisti");
    }
}
