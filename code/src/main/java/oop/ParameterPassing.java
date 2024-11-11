package oop;

/**
 * @ClassName: ParameterPassing
 * @desc: 函数的传参方式; Java中实质上是值传递（传递的是参数的副本）, 之所以会在传递对象和
 * 数组的时候表现出引用传递（传递的是地址）的特征, 是因为传递的是引用的副本。也是指向实际位置的
 * @version:
 * @author: xcg
 * @date: 2024/10/16 20:49
 * @since: jdk8
 */
public class ParameterPassing {
    public static void main(String[] args) {
        int i = 10;
        valueTrans(i);
        System.out.println("i = " + i);

        Animal animal = new Animal();
        animal.age = 10;
        referenceTrans(animal);
        System.out.println("animal.age = " + animal.age);

    }

    private static void referenceTrans(Animal animal) {
        animal.age=100;
        animal.gender="male";
    }

    private static void valueTrans(int i) {
        i = 20;
    }
}
class Animal {
    int age;
    String gender;
}
