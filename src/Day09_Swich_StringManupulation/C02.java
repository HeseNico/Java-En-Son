package Day09_Swich_StringManupulation;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        // Ay numarasini alip mesvsimi yaz
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        int ayno= scan.nextInt();

        switch (ayno){
            case 1:
            case 2:
            case 3:
                System.out.println("Kis");
                break;
            case 4:
                System.out.println("ILK bAHAR");
            case 5:
            case 6:
                System.out.println("YAZ");
            case 7:
            case 8:
                break;
            case 9:
                System.out.println("Sonbahar");
            case 10:
            case 11:
                break;
            case 12:
                System.out.println("Kis");

        }
    }
}
