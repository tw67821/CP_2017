package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        byte b1;
        b1 = 56;

        int a = 675;
        a = a + b1;

        float fl = 1353535353;
        double d1 = 5.5675 * 10e9;
        boolean p = true && false;
        boolean q = true || false;
        char c = 't';
        String abc = "m text";
        int a2 = 5656;
        Integer a3 = 45644;
        a3 = a2+a3;
        a2 = a3 +a2;
        System.out.println("abc=" + abc);
        System.out.println("c=" + c);
        System.out.println("p=" + p);
        System.out.println("bl=" + b1);
        System.out.println("d1=" + d1);
        System.out.println("fl=" + fl);
        System.out.println("q=" + p);
        // System.out.println("Hello!!!");
    }
}
