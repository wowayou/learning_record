package variableandoperator;

/**
 * @ClassName: operator.VariableDemo
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/6/19 21:59
 * @since: jdk8
 */
public class VariableDemo {
    // 实例变量 不初始化值 会是默认值
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean flag;
    char c;

    public static void main(String[] args) {
        VariableDemo variable = new VariableDemo();
        System.out.println("byte = " + variable.b);
        System.out.println("short = " + variable.s);
        System.out.println("int = " + variable.i);
        System.out.println("long = " + variable.l);
        System.out.println("float = " + variable.f);
        System.out.println("double = " + variable.d);
        System.out.println("boolean = " + variable.flag);
        System.out.println("char = " + variable.c);
        System.out.println((int) variable.c);
    }
}
