package oop;

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
        Pet dog = new Pet();
        System.out.println(dog.name);

        Pet cat = new Pet();
        cat.name = "我是猫";

        dog.shout(dog);
        dog.shout(cat);
    }
}
