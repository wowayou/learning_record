package variableandoperator;

/**
 * @ClassName: Operator
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/6/20 20:33
 * @since: jdk8
 */
public class Operator {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.0F;
        double f = 60.0;

//        String s = (String) (a + b);
//        String s1 = (String) (a + d);
//        String s2 = (String) (d + f); // long + double > double
//        String s3 = (String) (d + e); // long + float > float 低容量自动变成高容量, 整数会变成int

        String s = "" + a + b; // 1020
        String s1 = a + b + ""; // 30
        System.out.println(s);
        System.out.println(s1);
    }
}
