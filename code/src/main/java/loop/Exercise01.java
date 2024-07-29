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
        // 最后一行要打印 2*5 - 1 9个※；第一行一个※ 其他都是两个※
        // 每一行都是 ※和空格组成的
        // 只在特定的地方打印 ※，其他地方输出空格 > 明天再说
        int n = 5; // 要打印的行数
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}