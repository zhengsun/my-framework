package com.yz.common.core.json;

import java.util.List;


public interface IJsonInterface {

    public <T> T parseObject(String json,Class<T> t);

    public <T> List<T> parseList(String json, Class<T> t);

    public String toJsonString(Object obj);

}
