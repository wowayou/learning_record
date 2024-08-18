package exercises;

import java.util.Scanner;

/**
 * @ClassName: Simple_Calculator
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/8/17 10:00
 * @since: jdk8
 */
public class Simple_Calculator {
    public static void main(String[] args) {// 用英文写代码注释?
        // 写一个计算器 要求实现加减乘除功能 并且能够循环接收新的数据 通过用户交互实现
        double result = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
//            boolean calculation = calculation(sc, result, flag);
//            flag = calculation;
            System.out.println("请输入第一个数字: ");
            double v1 = sc.nextDouble();
            System.out.println("请输入操作符(+ - * /): ");
            String operator = sc.next();
            System.out.println("请输入第二个数字：");
            double v2 = sc.nextDouble();
            switch (operator) {
                case "+": result = v1 + v2; break; // break 一定不要忘记呀, 不然会穿透
                case "-": result = v1 - v2; break;
                case "*": result = v1 * v2; break;
                case "/":
                    if (v2 == 0) {
                        System.out.println("被除数不能为零");
//                        return; // return 语句会立即结束当前的函数或方法，后面的代码将不会被执行。
//                        result = -1; // 无法输出null. 也可以把它做成一个集合, 不同情况返回集合不同下标的值
                    } else {
                        result = v1 / v2;
                    }
                    break;
                default:
                    System.out.println("暂不支持其他运算 | 你输入的操作符有误; 请重新输入: ");
            }
            if (v2 == 0 && "/".equals(operator)) {
                System.out.println("没有结果");
            } else {
                System.out.println(v1 + operator + v2 + " = " + result);
            }
            System.out.println("是否要继续运算, 请输入 y/n: ");
            String isContinue = sc.next();
            if ("n".equals(isContinue) || "N".equals(isContinue)) {
                flag = false;
            }
        }

        sc.close();
    }
    public static boolean calculation(Scanner sc, double result, boolean flag) {
        System.out.println("请输入第一个数字: ");
        double v1 = sc.nextDouble();
        System.out.println("请输入操作符(+ - * /): ");
        String operator = sc.next();
        System.out.println("请输入第二个数字：");
        double v2 = sc.nextDouble();
        switch (operator) {
            case "+": result = v1 + v2; break; // break 一定不要忘记呀, 不然会穿透
            case "-": result = v1 - v2; break;
            case "*": result = v1 * v2; break;
            case "/":
                if (v2 == 0) {
                    System.out.println("被除数不能为零");
//                        return; // 跳出 main 方法?
                    // 可以写成一个方法, 然后这里调用自身(使用递归), 不行，逻辑上不太对。递归结束之后 还是会往下执行
                    calculation(sc, result, flag);

                } else {
                    result = v1 / v2;
                }
                break;
            default:
                System.out.println("暂不支持其他运算 | 你输入的操作符有误; 请重新输入: ");
        }
        System.out.println(v1 + operator + v2 + " = " + result); // 如果除数是0，就不要做这个了>所以这个输出语句放到每一个case后? 其实也不必，1/0 = null 这样处理也可以的, 说得过去

        System.out.println("是否要继续运算, 请输入 y/n: ");
        String isContinue = sc.next();
        if ("n".equals(isContinue) || "N".equals(isContinue)) {
            flag = false;
        }
        return flag;
    }
}
