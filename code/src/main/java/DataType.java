/**
 * @ClassName: DataType
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/6/16 22:13
 * @since: jdk8
 */
public class DataType {
    public static void main(String[] args) {
        byte num = 127;
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        short num1 = 32767;
        int num2 = 2147483647;
        long num3 = 9223372036854775807L; // Long 类型要加L说明

        float num4 = 2147483647.0F; // float 类型要加 F 说明 float 的范围不只是这样
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE; // float 类型不为零的最小正值
        float negativeValue = -maxFloat;
        System.out.println("negativeValue = " + negativeValue);
        System.out.println(minFloat);
        double num5 = 9223372036854775807.9999;

        char num6 = 'A' - 65;
        int num7 = num6;

        boolean flag = true;

        System.out.println(num7);
    }
}
