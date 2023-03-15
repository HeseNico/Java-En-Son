package Day24_StaticKeyword;

public class C01 {



    public static void main(String[] args) {

        System.out.println("Main metod caalisti");

        System.out.println("============");
        C01_StaaticBlocks obj1=new C01_StaaticBlocks();
    }

    static {
        System.out.println("static blok calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
    }
}
