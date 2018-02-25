package com.yz.common.core.utils;


import com.alibaba.fastjson.JSON;

import java.util.List;

public class JsonUtil {

    public <T> T parseObject(String json, Class<T> t) {
        T t1 = JSON.parseObject(json, t);
        return t1;
    }

    public <T> List<T> parseList(String json, Class<T> t) {
        List<T> tList = JSON.parseArray(json, t);
        return tList;
    }

    public String toJsonStr(Object obj) {
        return  JSON.toJSONString(obj);
    }
}
