package Day08_nestedIfStatementsTernary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        //Kullanicidan sayi al mutlak degere cevir ve yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>=0){
            System.out.println(sayi);
        }else{
            sayi=sayi * (-1);
            System.out.println(sayi);
        }
        // Ternary ile

        sayi = sayi>=0 ? sayi : sayi*(-1);
        System.out.println(sayi);

    }
}
