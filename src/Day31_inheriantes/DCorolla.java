package Day31_inheriantes;

public class DCorolla extends CToyota{

    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corollaconstructor calisti");
    }
    DCorolla(int sayi){
        this();
        System.out.println("int Parametreli Corolla constructor calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1= new DCorolla(5);
    }
}
/*
biz gorunur bir constructor olusturdugumuzda
javanin default contructori silmesine benzer olarak

extends keyword kullanilmis bir klstaki herhangi bir const. ilk satirinda
gozle gorunur bir const. call yazilmissa
Java default olarak koyduygu super  cont call siler
 */
