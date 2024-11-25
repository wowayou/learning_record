package practices.luckydraw;

import scanner.ScannerDemo;

import java.util.Scanner;

/**
 * @ClassName: Draw
 * @desc: 幸运抽奖
 * @version:
 * @author: xcg
 * @date: 2024/11/25 21:41
 * @since: jdk8
 */
public class Draw {
    private static Scanner sc; // 只是声明

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("*****" + "欢迎来到即刻好运抽奖系统" + "*****");
        System.out.println("\t\t\t" + "1. 注册" + "\t\t\t");
        System.out.println("\t\t\t" + "2. 登录" + "\t\t\t");
        System.out.println("\t\t\t" + "3. 抽奖" + "\t\t\t");
        System.out.println("******************************************");
        System.out.print("请选择菜单：");

        int menuNumber = sc.nextInt();
        selectMenu(menuNumber);

        sc.close();
    }
    public static void selectMenu(int menuNumber) {
        System.out.print(menuNumber);
        switch (menuNumber) {
            case 1:
                System.out.println("请注册");
                break;
            case 2:
                System.out.println("请登录"); // 现在大多数直接是登录，然后在这个登录页面 会 提示你如果之前没有注册过，会自动注册；更完善一点的话，应该有一个登录状态的标志位，没有登录是不能开始抽奖的，无非就是在抽奖的逻辑前在加一个条件而已。
                break;
            case 3:
                System.out.println("开始抽奖吧");
                break;
            default:
                System.out.println();
                System.out.print("你输入的菜单编号有误, 请重新输入: ");
                menuNumber = sc.nextInt();
                selectMenu(menuNumber);
        }
    }
}
