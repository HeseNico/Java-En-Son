package Day31_inheriantes;

public class CToyota extends BAraba {

    String str2="Toyota";

    protected CToyota(){
        super("Java");
        System.out.println("Parametresiz Toyota contructoru calisti");
    }

    protected CToyota(int sayi){
        System.out.println("int Parametreli Toyota constructor calisti");


    }

    protected CToyota(String s){
        System.out.println("String li Parametreli Corolla constructor calisti");


    }
}
