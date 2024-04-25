package com.atguigu.cloud.test;

import java.time.ZonedDateTime;

/**
 * @Author: administrator
 * @Date: 2024/4/19 10:15
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
