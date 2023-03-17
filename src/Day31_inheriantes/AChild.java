package Day31_inheriantes;

import Day30_inheritance.GParent;

public class AChild  extends GParent{

    String chilStr;

    AChild() {

        System.out.println("Child class contructor calisti");
    }

    public static void main(String[] args) {

        // System.out.println(childStr); static olmadigi icin kullanamiyorum
        // System.out.println(sayiParent);
        // sag tarav variable adi sol taraf deger
        AChild objeChild = new AChild();

        /*
        Java da inheritens kullanirken child classdaki obje
        parent claslardaki tum ozelliklere sahip olur
        Bunu saglayan Java mekanizmasi super konstructor call dur

        Extend keyword kullanan bir claasta olsturulan herbir
        constructirin ilk satirinda biz gormesek bile bir super contructor call vardir
        super() ===> once parent clasa gidip once parametresiz constructuri calistir demektir
        Bu sekilde chil clasindaki constructor calistiginda extends keywor parent buluncaya kadar
        parent claslara gider.extends kullanmayan bir parenta kadar gider ve yazdiriz

         */


    }


}
