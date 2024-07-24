package loop;

/**
 * @ClassName: For_Demo
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/7/17 21:35
 * @since: jdk8
 */
public class For_Demo {
    public static void main(String[] args) {
//        1. 计算0到100之间的奇数 及 偶数的和
//        确定哪些是奇数，不能被 2 整除
//        oddAndEvenSum();

//        死循环
//        for (;;) {
//            System.out.println("--");
//        }

        // 2. 用 while 或 for 循环输出 1-1000 之间能被 5 整除的数，并且每行输出 3 个
        outputMultiplesOfFive();

        // 3. 打印九九乘法表
        // 考察如何拆分问题
//        multiplicationTable();

    }

    private static void multiplicationTable() {
        int row = 1; // 第几行
        int col = 1; // 第几列
        for (int i = row; i < 10; i++) {
            for (int j = col; j < i + 1; j++) {
                System.out.print(i);
                System.out.print(" * ");
                System.out.print(j);
                System.out.print(" = ");
                System.out.print(i * j);
                // 同样的问题 最后不输出 tab 有没有其他方式
                if (j < i) {
                    System.out.print("\t");
                }
            }

            System.out.print("\n");
        }
    }

    private static void outputMultiplesOfFive() {
        int counter = 0;
        int initValue = 5; // 1-1000 之间能被 5 整除的第一个数
        for (int i = initValue; i < 1001; i++) {
            if (i % 5 == 0) {
                System.out.print(i);
                // 最后一个就不要输出 tab 了; 还有其他的方式吗, 这样每次都要判断一次
                if (counter < 2) {
                    System.out.print("\t");
                }
                counter++;
                // 这里也可以不使用计数器, i % (5 * 3) == 0 判断
                if (counter % 3 == 0) {
                    System.out.print("\n");
                    counter = 0; // 计数器归零
                }
            }
        }
    }

    private static void oddAndEvenSum() {
        int odd_sum = 0;
        int even_sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            } else {
                odd_sum += i;
            }
        }
        System.out.println("odd_sum = " + odd_sum);
        System.out.println("even_sum = " + even_sum);
    }
}
