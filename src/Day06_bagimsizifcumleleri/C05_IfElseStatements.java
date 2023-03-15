package Day06_bagimsizifcumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
/*
eger  ir olay icin 2 olasilik varsa ve bu olasiliklardan birisi
mutlaka calisacaksa
If Else Statements kullaniriz
 */
        /*
        // Soru 5- Kullanicidan notunu alin
//         50 veya daha buyukse "Sinifi Gectin",
//         50’den kucukse "Maalesef kaldin" yazdirin.




// Kullanicidan pozitif bir tamsayi alin
// sayinin tek veya cift sayi oldugunu yazdirin




// Kullanicidan pozitif bir tamsayi alin
// 5 ile bolunup bolunmedigini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sinifi gectin");

    }else if (not >= 0 && not <= 49){
            System.out.println("Maalesef kaldin");
        }

    }
}
