package Day23_constractor;

public class C02_ConstructorCall {
    /*
    Java da ihtyac olursa bir contructor icinden baska contructor cagrilabilir
    this(ilgili parametreler)  yazarak  istedigimiz contructori cagirabiliriz

    Constructor call icin 2 kural vardir
    1- Constructor call icinde bulundugu Constructorin ilk satirinda olmalidir
    2-
     */

    int sayi;
    String str;
    public C02_ConstructorCall() {
        System.out.println("Parametresiz contructor calisti");
    }


    public C02_ConstructorCall(int sayi) {
        System.out.println(" int parametreli contsructor calisti");
        this.sayi = sayi;
    }


    public C02_ConstructorCall(String str) {
        System.out.println("String parametreli contsructor calisti");


        this.str = str;
    }

    public C02_ConstructorCall(int sayi, String str) {
        // C02_ConstructorCall(); Boyle yazildiginda method call olarak alglar
        this(); // Java ssyntax olarak contructor call icin bunu belirtmistir
        this.sayi = sayi;
        this.str  = str;
    }

    public static void main(String[] args) {
        // C02_ConstructorCall obj1= new C02_ConstructorCall(); // Parametresiz contructor calisti
        C02_ConstructorCall obj2= new C02_ConstructorCall("Java");
    }
}
