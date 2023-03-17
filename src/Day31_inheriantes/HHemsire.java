package Day31_inheriantes;

public class HHemsire extends FMuhasebe{

    String unvan="Hemsire";

    public void standartMaas(){
        System.out.println("Hemsireler in. 10 bin tl alir");
    }

    public void ozelSigorta(){
        System.out.println("Hemsireler aylik 300 tl katki ile ozel sigrta yaptirabilir");
    }
    public void nobetUcreti(int nobetsayisi){
        System.out.println(nobetsayisi*200);
    }

    public static void main(String[] args) {
        HHemsire hemsire=new HHemsire();
        hemsire.method();
    }

    public void method() {

        HHemsire hemsire=new HHemsire();
        System.out.println(hemsire.unvan); // Hemsire bu clasta var diye bunu yazdi
        System.out.println(super.unvan);
        System.out.println(this.sgkNo);
        System.out.println(super.sgkNo);
        this.standartMaas();
        this.fazlaMesai(3);
        super.fazlaMesai(4);
        this.ozelSigorta();
        super.ozelSigorta();
        // System.out.println(super.unvan); burda olmaz
        // ama public void method(){ da yapabiliriz
    }
}
