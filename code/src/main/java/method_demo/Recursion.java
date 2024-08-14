package method_demo;

/**
 * @ClassName: Recursion
 * @desc: 关键是找到规律
 * @version:
 * @author: xcg
 * @date: 2024/8/14 21:22
 * @since: jdk8
 */
public class Recursion {
    // 递归
    public static void main(String[] args) {
//        System.out.println(f(5));
        System.out.println(loop(6));
    }

    private static double loop(int n) {
        if ( n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = n; i > 1; i--) {
                result = result * i;
            }
            return result;
        }
    }

    /*
    计算某个数的阶乘
    n * f(n-1) 这就是规律
     */
    private static double f(int i) {
        double result = 0;
        if (i == 1) {
            result = i;
        } else {
            result = i * f(i - 1);
        }
        return result;
    }

}
