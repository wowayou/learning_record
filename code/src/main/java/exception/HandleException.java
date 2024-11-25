package exception;

/**
 * @ClassName: HandleException
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/11/17 11:58
 * @since: jdk8
 */
public class HandleException {
    public void divide(int a, int b) {
        System.out.println(a/b);
    }
}

/*
try {
            new HandleException().divide(1,0);
        } catch (ArithmeticException e) {
            System.out.println("被除数不能为0: " + e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("我执行了");
            e.printStackTrace();
        }
        System.out.println("哈哈哈哈");
 */