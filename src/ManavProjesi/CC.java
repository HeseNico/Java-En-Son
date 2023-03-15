package ManavProjesi;

import java.util.Scanner;

public class CC {
    public static void main(String[] args) {

        // Kullanıcıya "Lütfen yaşınızı girin" soran bir Java programı yazın.
        // Daha sonra program, kişinin oy kullanmaya uygun olup olmadığını gösterecektir.
        // Oy kullanabilecek kişinin 18 yaş ve üzeri olması gerekmektedir.
        // eski ve program "Oy verme hakkınız var" mesajını gösterecek.
        // Aksi takdirde program "Oy kullanamazsınız" mesajını gösterecektir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasnizi Grinizi : ");
        int yas= scan.nextInt();

        if (yas<18 ){
            System.out.println("Oy Kullanamzsiniz . Oy Kullanmak icin  " + (18-yas) + " Yiliniz var");
        }else {
            System.out.println("Geleceginiz icin Oy Kullanabilirsiniz");
        }
    }
}
