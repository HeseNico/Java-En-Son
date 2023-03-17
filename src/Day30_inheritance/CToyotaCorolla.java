package Day30_inheritance;

public class CToyotaCorolla extends BToyota {


    String lastik="Lassa 255-55-15";
    String model="Corolla";
    String yakit="Corolla dizel,benzin ve elektrikli olabilir";



    public void motor(){
        System.out.println("Corolla araclar turkiyede uretilen motor kullanir");

    }

    public void uretimyeri(){
        System.out.println("Corolla araclar Turkiyede uretilir");
    }


    public static void main(String[] args) {

        CToyotaCorolla corolla=new CToyotaCorolla();

        // Oncelikle bu Clasta varsa burdan yazar olmayan digerlerinden alir
        System.out.println(corolla.lastik);
        System.out.println(corolla.model);
        System.out.println(corolla.yakit);
        corolla.motor();
        corolla.uretimyeri();

        System.out.println("========");

        System.out.println(corolla.aku); // parenttan gelir
        corolla.motor(); // parenttan gelir
        System.out.println(corolla.marka); // parenttan gelir
        corolla.guvenlik(); // parenttan gelir

        System.out.println(corolla.vites); // Grand parentstan aliraraba klasindan

    }
}
