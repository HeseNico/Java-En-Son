package Day07_GeneltekrarIfSyayements;

import java.util.Scanner;

public class C02_ {
    public static void main(String[] args) {

        // pozotif sayi alin
        // 3 ile bolunuyorsa ucun kati
        //sayi 5 ile bolunuyorsa 5 kati
        // sayi hem 3 hemde 5 ile bolunuyorsa 3 ve 5 kati yazdirin
        //ikisinde bolunmuyorsa ne 3 un nede 5 in kati yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayi aliniz");

        int sayi=scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("sayi 3 ve 5kati");
        }else if (sayi%5==0){
            System.out.println("sayi 5 kati");
        }else if (sayi%3==0 ){
            System.out.println("sayi ve 3 kati");
        }else{
            System.out.println("Girilen sayi 3 kati ve 5 kati degil" );
        }

    }
}
