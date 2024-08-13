package method_demo;

/**
 * @ClassName: Method_Demo
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/8/13 20:42
 * @since: jdk8
 */
public class Method_Demo {
    public static void main(String[] args) {
        System.out.println();
        // System 类的 out 对象的 println() 方法

        // 值传递 和 引用传递

        // 方法重载, 同一个类中，有多个同名方法 (后边看源码的时候 这些基础都有体现)
        // 怎样就是方法重载?
        /**
         * 1. 方法名必须相同
         * 2. 参数列表必须不同（类型，个数，顺序等）
         * 3. 返回值类型可以相同，也可以不同
         * 4. 仅仅只有返回值类型不同，不能称之为方法重载
         */
        // 实现方法重载的原理
        /**
         * 方法名称相同时，编译器会根据调用方法的参数个数、类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错
         */

        // 命令行传参
        /**
         * public static void main(String[] args) {
         *      for(int i = 0; i < args.length; i++ {
         *          System.out.println(i + ": " + args[i]);
         *      }
         * }
         */
    }
}
