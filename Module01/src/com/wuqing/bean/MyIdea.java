package com.wuqing.bean;

import java.util.ArrayList;

public class MyIdea {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        //region Description
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

        for (Integer num : list) {
            System.out.println(num);
        }
        //endregion
        System.out.println(list);
        getMethed();
    }

    private static void getMethed() {
        int num = 10;
        System.out.println(num);
    }


}
