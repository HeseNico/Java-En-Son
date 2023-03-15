package Day07_GeneltekrarIfSyayements;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {


        /*
        // pozotif sayi alin
        // 3 ile bolunuyorsa ucun kati
        //sayi 5 ile bolunuyorsa 5 kati
        // sayi hem 3 hemde 5 ile bolunuyorsa 3 ve 5 kati yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanicidan pir tam sayi alin");

        int sayi= scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("3 cun ve 5 sin kati");
        }else if(sayi%3==0 ){
            System.out.println("3 kati");
        }else if (sayi%5==0){
            System.out.println("sayi 5 kati");
        }

    }
}
