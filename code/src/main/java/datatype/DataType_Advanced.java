package datatype;

/**
 * @ClassName: datatype.DataType_Advanced
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/6/17 21:01
 * @since: jdk8
 */
public class DataType_Advanced {
    public static void main(String[] args) {
        // 整数类型 进制问题 二进制 0b；十进制；八进制 0；十六进制 0x
//        intType();

        // 浮点类型 不能用于比较；银行业务使用 BigDecimal 这个数学工具类
        float f1 = 0.1f; // 有限 离散; 舍入误差 接近但不等于
        double d1 = 0.1;
        System.out.println(f1 == d1);

        float f2 = 23456787654567898765678f; // 已经越界了吗
//        float max_FloatValue = Float.MAX_VALUE;
//        System.out.println("max_FloatValue - f2 = " + (max_FloatValue - f2));
        double d2 = f2 + 1;
        System.out.println(f2 == d2); // 结果是 true, 分析原因?


        // 字符类型 实质上还是数值类型
        char c1 = 'a';
        int i1 = c1;
        char c2 = '中';

        // 字符编码, Unicode 编码, 一个字符占两字节 范围 U0000 ~ UFFFF。Unicode 编码表 | 转义字符 \t \n 等
        char c3 = '\u0061';

        System.out.println(c1 + "\t" + c2 + "\t" + c3);
        System.out.println(i1);

        // 布尔类型
        boolean flag = true;
        // 等价
        if (flag) {}
        if (flag==true) {}

    }

    private static void intType() {
        int num1 = 10;
        int num2 = 010; // 八进制，逢八进一
        int num3 = 0x10; // 十六进制 0-9 A-F
        int num4 = 0b10;
        System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4);
    }
}
