package oop;

/**
 * @ClassName: Pet
 * @desc: 继承
 * @version:
 * @author: xcg
 * @date: 2024/11/9 10:35
 * @since: jdk8
 */
public class Pet {
    String name;
    int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shout(Pet pet) {
        System.out.println(pet.name + " 在叫");
    }
}
