package Day30_inheritance;

public class BToyota extends Araba{


    String marka="Toyota";
    String aku="Inci aku";
    String lastik="Lassa";


    public void motor(){
        System.out.println("Toyotalar cevreci motorlar kullanir");
    }

    public void guvenlik(){

        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }
}
