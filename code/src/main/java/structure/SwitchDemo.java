package structure;

/**
 * @ClassName: SwitchDemo
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/7/16 21:15
 * @since: jdk8
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String name = "中文";

        switch (name) {
            case "xcg":
                System.out.println("xcg");
                break;
            case "hello":
                System.out.println("hello");
                break;
            case "中文":
                System.out.println("中文, .hashcode()");
                break;
            default:
                System.out.println("default");
        }
    }
}
