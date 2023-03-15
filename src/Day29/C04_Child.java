package Day29;

public class C04_Child extends C03_Parentclas{

    int c=20;
    int a;
    String s="Child class";
    String m;

    public void method1(){
        System.out.println("Child class method1");
    }


    public static void main(String[] args) {

        C03_Parentclas objC03=new C03_Parentclas();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1();
        objC03.method2();


        C04_Child objC04= new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();


        // C04 clasini C03 child yapinca
        //Child clasta olmayip parent clasta olan b,t ve method2
        // ozellik olarak objeC04 eklendi
        objC04.b=8;
        objC04.t="y";
        objC04.method2();


        /*
        Javada parent claslar child edilmez.
        Child claslar parent edinir.

        Bir clasin baska bir clastaki tum olelikleri
        otomatik olarak almak istiyorsak clasimizi extend keyword ile o clasa child yapariz.
        Siizi parent yapti diyecezz kisacasi

         */

    }


}
