package Day29;

public class C05_Child extends C03_Parentclas{

    int c=20;
    int a;
    String s="Child class";
    String m;

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        // Child clastan bir obje olusturalim ve ozelliklerini yazdiralim

        C05_Child obj=new C05_Child();
        System.out.println(obj.a); // 0 ..Bu child clasta var degeri 0
        // eger a yoksa daha sonra parente gider
        System.out.println(obj.c); // 20 cunku ilk bu klasta var yoksa parente gideriz
        System.out.println(obj.b); // normalde vermez ama extend
        // yaptigimiz icin sadece bu clasa bakmiyoruz
        // bide parents clasina bakiyoruz onunda degeri sifir
        System.out.println(obj.m);// null
        System.out.println(obj.t); // null
        System.out.println(obj.s); // child class
        obj.method1(); // Child class method1
        obj.method2(); // Parent Method12 calisti


    }
}
