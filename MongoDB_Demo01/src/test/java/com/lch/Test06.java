package com.lch;

/**
 * @ClassName:Test06
 * @Author：Mr.lee
 * @DATE：2019/08/28
 * @TIME： 21:59
 * @Description: TODO
 */
public class Test06 {

    public static void main(String[] args) {

        //整体思路：第一个数加第二个数等于第三个数
        int a = 1;
        int b = 1;
        int c = 0;

        //遍历1~10；
        //1、1、2、3、5、
        for (int i = 0; i < 10; i++) {

            c = a + b;

            a = b;

            b = c;
        }

        System.out.println(c);
    }
}
