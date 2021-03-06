- 选择排序：每次从待排序列中选择最小的元素，放置在序列的开始位置。
### 概要
##### 性质
- 不稳定
- 时间复杂度：O(n<sup>2</sup>)
- 空间复杂度：O(1)
### 解读
##### 简要思路
- 找最小：在待排序列中找到最小的元素；
- 交换元素：最小元素是待排序的第一个元素，无操作；最小元素不是带一个，将于第一个元素交换；
- 完成前两步，待排序列为N-1，重复上述操作，直到排序结束。
##### 算法图解
[![npF1Dx.png](https://s2.ax1x.com/2019/09/01/npF1Dx.png)](https://imgchr.com/i/npF1Dx)
### 实现
##### 实现方式1：数组
``` java

选择排序和冒泡排序执行了相同次数的比较：N*（N-1）/2，但是至多只进行了N次交换。
当 N 值很大时，比较次数是主要的，所以和冒泡排序一样，用大O表示是O(N2) 时间级别。但是由于选择排序交换的次数少，
所以选择排序无疑是比冒泡排序快的。当 N 值较小时，如果交换时间比选择时间大的多，那么选择排序是相当快的

public class ChoiceSort {
    public static int[] sort(int[] array){
        //总共要经过N-1轮比较
        for(int i = 0 ; i < array.length-1 ; i++){ 
            int min = i;
            //每轮需要比较的次数
            for(int j = i+1 ; j < array.length ; j++){
                if(array[j]<array[min]){
                    min = j;//记录目前能找到的最小值元素的下标
                }
            }
            //将找到的最小值和i位置所在的值进行交换
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
```
##### 实现方式2：链表

### 性能分析
##### 时间复杂度
##### 空间复杂度
##### 适用场景

### 算法应用例子
- 源码地址：
##### 例子1：
##### 例子2：
##### 例子3：
