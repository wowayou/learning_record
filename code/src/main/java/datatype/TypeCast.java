package datatype;

/**
 * @ClassName: datatype.TypeCast
 * @desc: 类型转换的演示
 * 强制类型转换
 * 自动类型转换
 * 容量: 低 > 高
 * byte, short, char > int > long > float > double
 * 布尔类型 不能进行类型转换
 * @version:
 * @author: xcg
 * @date: 2024/6/18 21:50
 * @since: jdk8
 */
public class TypeCast {
    public static void main(String[] args) {
        /*
        类型转换要注意内存溢出以及精度问题
        不能对布尔值进行转换
         */
        int num1 = 128;
        byte num = (byte) num1; // 内存溢出了
        System.out.println(num);

        System.out.println("========");

        float num2 = num1;
        System.out.println(num2);
        System.out.println("========");

        int unit = 20_0000_0000; // JDK 7 提供的新特性, 可以在数字中加下划线分割; 输出的时候并不会输出
        System.out.println("unit = " + unit);
        int years = 10;
        int total = unit * years;
        System.out.println("total = " + total);
        long total1 = unit * years; // 这里是因为 两个因子 都是int, 计算出的结果也是 int; 在计算过程中就已经有问题了(结果在转换之前就已经存在问题了)
        System.out.println("total1 = " + total1);
        long total2 = unit * (long)years;
        System.out.println("total2 = " + total2);
    }
}
