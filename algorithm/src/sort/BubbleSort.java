package sort;

import util.SortUtil;

/**
 * 冒泡排序 :
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午2:34
 */
public class BubbleSort {

    public static void bubbleSort(int[] list) {

        if (list.length <= 0 || list == null) {
            throw new RuntimeException("参数错误");
        }

        //两两比较，大大元素放到后面
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    SortUtil.swap(list, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] randomArr = SortUtil.getRandomArr(10, 0, 10);
        SortUtil.printArr(randomArr);
        System.out.println();
        BubbleSort.bubbleSort(randomArr);
        SortUtil.printArr(randomArr);
    }

}
