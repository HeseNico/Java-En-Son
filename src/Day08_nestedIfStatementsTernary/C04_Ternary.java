package Day08_nestedIfStatementsTernary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        //Kullanicidan sayi alin
        // Cift ise cift
        // degilse tek yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi girin");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Cift sayi");
        }else{
            System.out.println("Tek sayi");
        }
        // Ternary ile

        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");

    }
}
