package Day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity());

        System.out.println(sb1.length());

        sb1.append("Mustafa");

        System.out.println(sb1.length());

        sb1.append("Yilmazturk");
    }
}
