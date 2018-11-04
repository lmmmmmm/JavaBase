package util;

/**
 * 算法中的工具类
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午3:31
 */
public class SortUtil {

    /**
     * 交换数组中元素位置，大的放到后面
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 获得数组中最大的数
     *
     * @param arr
     * @return
     */
    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 随机生成一个数组
     *
     * @param length
     * @param min
     * @param max
     * @return
     */
    public static int[] getRandomArr(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max + 1 - min) + min);
        }
        return arr;
    }


    /**
     * 检查参数
     *
     * @param arr
     */
    public static void checkParam(int[] arr) {
        if (arr == null || arr.length <= 0) {
            throw new IllegalArgumentException("参数错误！");
        }
    }

}
