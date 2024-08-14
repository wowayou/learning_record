package method_demo;

/**
 * @ClassName: Variable_Parameter
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/8/14 21:05
 * @since: jdk8
 */
public class Variable_Parameter {
    public static void main(String[] args) {
        Variable_Parameter demo = new Variable_Parameter();
        demo.test(1, 2,3,4);
    }

    public void test(int ... i) {
        System.out.println(i[0]);
        System.out.println(i[1]);
        /**
         * JDK 1.5, java 支持传递同类型的可变参数给一个方法
         * 在方法声明中，在指定参数类型后加三个英文句号（...);
         * 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明。
         */
    }
}
