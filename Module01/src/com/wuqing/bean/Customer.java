package com.wuqing.bean;


import java.util.ArrayList;

public class Customer {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();
        System.out.println("你好呀,我是赛丽亚!");
        System.out.println(diGui(100));     //递归调用1+2+3+4+...+n
        int[] arr = {1,3,2,7,4,5};
        int[] Array = maoPao(arr);
        for(int num : Array){
            System.out.print(num + " ");
        }


    }

    //递归调用1+2+3+4+...+n
    public static int diGui(int num){
        if(num == 1){
            return 1;
        }else{
            return diGui(num-1)+num;
        }
    }
     //冒泡排序 int[] arr = {1,3,2,7,4,5};
     public static int[] maoPao(int[] arr){
        int num;
            for(int a=0;a<arr.length-1;a++){
                System.out.println("a=" + a);
                for(int b=a+1;b<arr.length;b++){
                    System.out.println("b=" + b);

                    if(arr[a] < arr[b]){
                            num = arr[b];
                            arr[b] = arr[a];
                            arr[a] = num;
                        }
                }
            }
            return arr;
        }

}
