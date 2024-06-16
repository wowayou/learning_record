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
        short num1 = 32767;
        int num2 = 2147483647;
        long num3 = 9223372036854775807L; // Long 类型要加L说明

        float num4 = 2147483647.0F; // float 类型要加 F 说明
        double num5 = 9223372036854775807.9999;

        char num6 = 'A' - 65;
        int num7 = num6;

        boolean flag = true;

        System.out.println(num7);
    }
}
