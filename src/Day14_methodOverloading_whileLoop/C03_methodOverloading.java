package Day14_methodOverloading_whileLoop;

public class C03_methodOverloading {

    public static void main(String[] args) {

        /*
        Bir klasta ayni isme sahip farkli iskem yapan metodlar olabilir
        Java bu methodlardan hangisini calisacagina parametrelere gore karar verir
        Bu isleme bir clasta ismi ayni parametreleri farkli methodlar olmasina
        Method Overloading denir. Asiri yukleme demek
         */
        String str="Bu is olacak";

        System.out.println(str.replace("Bu is ", "Java guzel "));
        System.out.println(str.replace('u', 'e'));
        // ayni isimde iki farkli methid var bri target digeri oldchar bunlari parametresine gore aliyor

    }
}
