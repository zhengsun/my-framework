package com.yz.common.core.utils;

import org.apache.http.NameValuePair;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.*;


public class XMLUtil {
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getMapFromXML(String xml) {
        try {
            Document document = DocumentHelper.parseText(xml);
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            return parseElements(elements);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> getMapFromXML(InputStream is) {
        SAXReader reader = new SAXReader();
        Document document;
        try {
            document = reader.read(is);
            Element rootElement = document.getRootElement();
            return parseElements(rootElement.elements());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, Object> parseElements(List<Element> elements) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (Element element : elements) {
            String key = element.getName();
            String value = element.getText();
            map.put(key, value);
        }
        return map;
    }
    /**
     * 请求参数转换xml
     * @param params
     * @return
     */
    public static String toXml(List<NameValuePair> params) {
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        for (int i = 0; i < params.size(); i++) {
            sb.append("<" + params.get(i).getName() + ">");

            sb.append(params.get(i).getValue());
            sb.append("</" + params.get(i).getName() + ">");
        }
        sb.append("</xml>");
        return sb.toString();
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static String toXml(Map<String,String> map){
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        Set keySet = map.keySet();
        Iterator<String> iterator=keySet.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            String value=map.get(key);
            sb.append("<" +key+ ">");
            sb.append(value);
            sb.append("</" +key + ">");
        }
        sb.append("</xml>");
        return sb.toString();
    }
}
