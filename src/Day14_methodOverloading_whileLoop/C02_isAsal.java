package Day14_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {

        // void yazdirma ama boolen ise yani dondurme boolen
        System.out.println(isAsal(20));
        // atama yapmadan asagida goremeyiz yada yazdirmak lazim
        // yazdirdim false yazdirdi
        System.out.println(isAsal(43));
        boolean sonuc=isAsal(57);// sonuc vareiblasina false degeri atar
    }
    public static boolean isAsal(int sayi){


        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }

        }
        if (sayi==2){
            return true;
        }
        else if (flag==0){
            return true;
        }else {
            return false;
        }

    }
}
