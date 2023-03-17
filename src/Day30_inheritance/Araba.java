package Day30_inheritance;

public class Araba {

    // Marka gozetmeden tum arabalarin sahip olacagi ozellikleri bu clasa koyariz

    String marka="Tum arabalarin markasi olur";
    String model="Tum arabalarin model olur";
    String vites="Tum arabalarin vitesi olur";
    String yakit="Tum arabalar yakit ile calisir";

    public void uretimyeri(){
        System.out.println("Tum arabalar fabrikada uretilir");
    }

    public void motor(){
        System.out.println("Tum arabalarin motoru olur");
    }

}
