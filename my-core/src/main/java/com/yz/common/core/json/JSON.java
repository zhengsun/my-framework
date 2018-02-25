package com.yz.common.core.json;



public final class JSON {

    private static IJsonInterface jsonInterface;

    public static void init(int type){
        switch (type){
            case 1:
                jsonInterface = new FastJson();
                break;
            case 2:
                jsonInterface = new Jackson();
                break;
            default:
                jsonInterface=new FastJson();
        }
    }

    public static IJsonInterface getJsonInterface(){
        if (jsonInterface==null){
            throw new RuntimeException("jsonInterface接口==null,请预先实例化该工具类");
        }
        return jsonInterface;
    }
}
