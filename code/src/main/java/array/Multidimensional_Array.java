package array;

import java.util.Arrays;

/**
 * @ClassName: Multidimensional_Array
 * @desc: 多维数组
 * @version:
 * @author: xcg
 * @date: 2024/8/19 20:48
 * @since: jdk8
 */
public class Multidimensional_Array {
    public static void main(String[] args) {
        // 多维数组 数组的元素类型还是数组 实质上嵌套
        int[][] arrays = new int[4][2];
        int firstDimension = arrays.length;
        int secondDimension = arrays[0].length;
        int k = 1;
        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < secondDimension; j++) {
                arrays[i][j] = k;
                k++;
            }
        }
        System.out.println("arrays = " + Arrays.deepToString(arrays));
    }
}
