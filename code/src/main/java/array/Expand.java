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
         * 压缩 节省空间
         * 记录总的行列数 非零值的坐标及值 距离: 五子棋
         * 稀疏数组  第几行 共几行 共几列 非零值的个数
         * 第几个有效值 [0] 11 11 n // [0] 相当于表头
         * 第一个有效值 [1]
         * ……
         * 大概是这样
         * 普通数组 -> 稀疏数组 -> 普通数组
         */
        // 先这样
    }

    private static void bubbleSort(int[] nums) {
        // 需要比较 len - 1 轮, 每轮比较 len - 1 - i 次；
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            boolean flag = false; // 对冒泡排序的优化：如果提前排好序了 就提前跳出循环!
            for (int j = 0; j < len - 1 - i; j++) { // 最后一轮一定会跳出
                int temp;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) { // 等价于 flag == false
                break;
            }
        }

    }
}
