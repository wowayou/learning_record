import exception.HandleException;
import string.Demo01;
import variableandoperator.Operator;

/**
 * @ClassName: Application
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/11/9 10:34
 * @since: jdk8
 */
public class Application {
    // 一个项目中只保留一个 main() 方法
    public static void main(String[] args) {
        new Operator().selfIncrement();
    }
}
