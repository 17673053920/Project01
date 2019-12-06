package com.wuqing.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuqing
 * @date 2019/12/5 - 21:08
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","张三");
        map.put("address","北京");
        map.put("phone","13677231122");
        map.put("age","18");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" " + entry.getValue());
        }

    }
}
