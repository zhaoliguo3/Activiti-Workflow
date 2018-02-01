package com.xzl.bat.utils;

import java.util.HashMap;
import java.util.Map;

public class WxbStatus {
    //0未派发 1已派发   2已结束
    public static int ORDER_ALLOTING = 0;
    public static int ORDER_ALLOTED = 1;
    public static int ORDER_END = 2;

    public static Map<Integer,String> MTPLAN_STATUS = new HashMap(){{
        put(6001, "未开始");
        put(6002, "执行中");
        put(6003, "确认中");
        put(6004, "审核中（维保）");
        put(6005, "审核中（物业）");
        put(6006, "已完成");
    }};
}
