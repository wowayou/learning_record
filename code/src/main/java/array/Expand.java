package array;

import java.util.Arrays;

/**
 * @ClassName: Expand
 * @desc: 数组扩展
 * @version:
 * @author: xcg
 * @date: 2024/8/19 21:20
 * @since: jdk8
 */
public class Expand {
    public static void main(String[] args) {
        // 冒泡排序 > 耐心地 debug 看一下过程
        int[] numbers = {1, 2, 3, 9, 7, 10, 5}; // 静态初始化
        // 两两比较
        bubbleSort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        /**
         * 稀疏数组
         */
    }

    private static void bubbleSort(int[] nums) {
        // 第一次需要比较的次数, 之后每轮都比上一轮少一次 直到0(一次都不需要比较)
        int len = nums.length;
        for(int i =0; i < len; i++) {
            boolean flag = false; // 优化：如果提前排好序了 就提前跳出循环!
            for (int j = 0; j < len - 1; j ++) { // 最后一轮一定会跳出
                int temp;
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) { // 等价于 flag == false
                break;
            }
        }

    }
}
