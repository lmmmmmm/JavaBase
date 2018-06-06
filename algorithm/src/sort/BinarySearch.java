package sort;


/**
 * 二分查找算法:需要数组已经排好序
 * 1、非递归方式
 * 2、递归方式
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午5:27
 */
public class BinarySearch {

    /**
     * @param arr 已经排好序的元素
     * @param val 要找的元素
     * @return 要找的元素在数组中的索引
     */
    public static int binarySearch(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int midIndex = (low + high) / 2;
            if (val == arr[midIndex]) {
                return midIndex;
            } else if (val > arr[midIndex]) {
                low = midIndex + 1;
            } else {
                high = midIndex - 1;
            }
        }
        return -1;
    }


    /**
     * 递归方式
     *
     * @param arr  有序数组
     * @param val  要查找的值
     * @param low  从数组中查找的开始位置
     * @param high 从数组中查找的终止位置
     * @return 元素
     */
    public static int binarySearch(int[] arr, int val, int low, int high) {
        if (low > high || arr == null) {
            return -1;
        }
        int midIndex = (low + high) / 2;
        if (arr[midIndex] == val) {
            return midIndex;
        } else if (arr[midIndex] > val) {
            return binarySearch(arr, val, low, midIndex - 1);
        } else {
            return binarySearch(arr, val, midIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 15, 16};
        int index = BinarySearch.binarySearch(arr, 8);
        System.out.println("非递归实现：" + index);
        int index2 = BinarySearch.binarySearch(arr, 8, 0, arr.length);
        System.out.println("递归实现：" + index2);
    }

}
