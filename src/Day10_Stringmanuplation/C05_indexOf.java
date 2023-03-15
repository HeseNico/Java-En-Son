package Day10_Stringmanuplation;

public class C05_indexOf {
    public static void main(String[] args) {


        String str="Java cok ama cok guzeldir";
        System.out.println(str.indexOf("c")); // 5 indexte oldugunu verdi

        System.out.println(str.indexOf("a"));// ilk buldugu indexi  verir yani 1
        System.out.println(str.indexOf("cok")); // cok bolumunu paket yapar ilk harfi alir 5
        System.out.println(str.indexOf("cok", 6));// c den sonra cok ariyor

        System.out.println(str.indexOf("java")); // aranan string yoksa -1 yazar daima


        // verilen bir cumlede istenen bir string icin
        // asagidaki cumlelerden uygun olani yazdirin
        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        //2- aradiginiz kelime cumlede 2 kere kullanilmis
        //3-aradiginiz kelime cumlede  2'den fala kullanilmis
        //4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle="Yasasin java, iki ki java ogreniyorum";
        String kelime="java";



        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            }else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else{
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }
        }


    }
}
