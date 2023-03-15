package daayy;

public class C07_arabaRunner {

    public static void main(String[] args) {

        C06_araba araba1=new C06_araba();

        araba1.marka="Toyota";
        araba1.model="Corolla";
        araba1.hasrkydi=false;
        araba1.yil=2010;
        araba1.fiyat=5250;

        System.out.println(araba1);



        C06_araba araba2=new C06_araba(2019,"Audi","A4",false,8750);
        System.out.println(araba2);

        C06_araba araba3=new C06_araba(2022,"Mercedes","C180",false,17540);
        System.out.println(araba3);



    }
}
