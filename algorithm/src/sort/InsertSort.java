package sort;

import util.SortUtil;

/**
 * 插入排序：时间复杂度为O(n^2)
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午4:20
 */
public class InsertSort {

    public static void insertSort(int[] arr) {
        int i, j, insertNode;
        // 从数组的第二个元素开始循环将数组中的元素插入
        for (i = 1; i < arr.length; i++) {
            // 设置数组中的第2个元素为第一次循环要插入的数据
            insertNode = arr[i];
            //
            j = i - 1;
            while (j >= 0 && insertNode < arr[j]) {
                // 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                arr[j + 1] = arr[j];
                j--;
            }
            // 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
            arr[j + 1] = insertNode;
        }

    }

    public static void main(String[] args) {
        int[] randomArr = {6, 4, 7, 8, 1};
        SortUtil.printArr(randomArr);
        System.out.println();
        InsertSort.insertSort(randomArr);
        SortUtil.printArr(randomArr);
    }
}
