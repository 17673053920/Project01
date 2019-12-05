package com.wuqing.bean;


import java.util.ArrayList;

/**
 * @author wuqing
 * @date 2019/11/30 - 22:04
 */
public class MyIdea02 {
    private static final int NUM = 10;

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        String s = new String("asda");
        ArrayList<Integer> list = getList();
        System.out.println(list);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int num : list) {
            System.out.println(num);
            System.out.println("你好啊!");
        }
        return list;
    }
}
