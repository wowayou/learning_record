package scanner;

import java.util.Scanner;

/**
 * @ClassName: ScannerDemo
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/6/20 22:12
 * @since: jdk8
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        basic(sc);
        // 输入一组数，计算它们的总和以及平均数。当输入非数字时，计算结束，输出结果。
//        double sum = 0.0;
//        int n = 0; // 记录一共输入了几个数字
//        while (sc.hasNextDouble()) {
//            double v = sc.nextDouble();
//            n++;
//            sum+=v;
//            // 辅助理解
//            System.out.println("这是你输入的第 " + n + " 个数, 当前总和是: " + sum);
//        }
//        System.out.println("总和是：" + sum);
//        System.out.println("平均数是: " + sum / n);
        sc.close(); // 用完后一定要记得关闭流
    }

    private static void basic(Scanner sc) {
        System.out.print("请输入: ");
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.print("您输入的内容是:" + s); // 只输入enter会不会直接结束, 必须在识别到有效字符之后才会结束; 无法读空格
        }
//        if (sc.hasNextLine()) {
//            String s = sc.nextLine();
//            System.out.print("您输入的内容是:" + s); // 只输入enter可以直接结束; 可以读空格
//        }
    }
}
