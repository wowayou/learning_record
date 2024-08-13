package loop;

/**
 * @ClassName: Exercise01
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/7/29 21:28
 * @since: jdk8
 */
public class Exercise01 {
    public static void main(String[] args) {
        // 打印一个五行的三角形
        // 最后一行要打印 2*5 - 1 9个※；第一行一个※ 其他都是两个※(不是这种，这种之后考虑一下)
        // 每一行都是 ※和空格组成的
        // 只在特定的地方打印 ※，其他地方输出空格
        // 分部 对称。先具体 再抽象 逐渐完成
        // 思路还是没厘清，再想一下
//        int n = 5; // 要打印的行数
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j <= 2 * n - 1; j++) {
//                if (j == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        /**
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         * 这样的三角形 1 3 5 7 9; ※的个数 2n-1, 一定是奇数个
         *
         * 先打出五行五列的※
         * 然后加一些条件，将一些地方的※输出成空格
         * 打空格的条件，摸索出来就可以解决问题了
         */
        int n = 5; // n: 要打印的行数
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n - 1; j++) { // 这里跳出循环的条件 也就是说要循环 2n 次
                if (j  < n - i - 1 || j > n + i - 1) { // 形式上 空格不好看，可以先使用其他的样式来调试; 先从简单的找到规律再说
//                    System.out.print(" "); // 空格也是实实在在地打出来了
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
