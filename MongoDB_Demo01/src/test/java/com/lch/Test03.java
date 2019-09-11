package com.lch;

import java.util.Arrays;

/**
 * @ClassName:Test03
 * @Author：Mr.lee
 * @DATE：2019/08/13
 * @TIME： 13:55
 * @Description: TODO
 */
public class Test03 {

    //创建一个冒泡排序的静态数组
    static int[] array = {1,2,4,5,0,3};

    //冒泡排序的静态方法
    public static void maopaoSort(int[] a){

        //先遍历冒泡排序的次数，6个元素遍历5次
        //外层遍历
        for (int i = 0; i < a.length - 1; i++) {

            System.out.println("外层第" + (i + 1) + "轮排序后的数组为: " + Arrays.toString(a));

            //里层遍历，元素之间做两两比较的运算
            for (int j = 0; j < a.length -1-i; j++) {

                //判断，当索引1的值 大于 索引2 的值时，索引1与索引2交换位置
                if(a[j] > a[j+1]){
                    //定义一个变量为temp为当前元素
                    int temp = a[j];
                    //索引1与索引2互换位置
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.println("内层第" + (i + 1) + "轮排序后的数组为: " + Arrays.toString(a));
        }
    }

    public static void main(String[] args) {

        maopaoSort(array);
    }
}
