package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName: Array_Basic
 * @desc:
 * @version:
 * @author: xcg
 * @date: 2024/8/15 21:39
 * @since: jdk8
 */
public class Array_Basic {
    public static void main(String[] args) {
//        // 数组的声明 declaration
//        int[] nums;
//        int nums1[]; // 早期为了让 C/C++ 的程序员能快速转到java
//        // 数组的初始化 dataType[] name = new dataType[arraySize]
//        nums = new int[10];
//        // 数组的赋值
//        int length = nums.length;
//        System.out.println("Array.getLength(nums) = " + Array.getLength(nums));
//        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums)); // 默认值
//        for (int i = 0; i < length; i++) {
//            nums[i] = i + 1;
//            System.out.println(nums[i]);
//        }

        // 数组的初始化；初始化之后才有默认值
        int[] bikes = {1, 2, 3}; // 静态初始化
        System.out.println("bikes[0] = " + bikes[0]);
        int[] choices;
        choices = new int[10]; // 动态初始化
        System.out.println("choices[0] = " + choices[0]);
    }
}
