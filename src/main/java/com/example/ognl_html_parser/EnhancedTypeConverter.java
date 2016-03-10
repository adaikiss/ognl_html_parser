package com.example.ognl_html_parser;

import ognl.*;
import ognl.ParseException;

import java.text.*;
import java.util.*;

/**
 * @author hlw
 * @date 2016/3/10
 */
public class EnhancedTypeConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if(Date.class.equals(toType)){
            return parseDate(value.toString());
        }
        return super.convertValue(context, value, toType);
    }

    public static Date parseDate(String value){
        if(null == value){
            return null;
        }
        String v = String.valueOf(value);
        try {
            if(v.indexOf("/") != -1){
                if(v.length() == 19){
                    return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(v);
                }
                if(v.length() == 18){
                    return new SimpleDateFormat("yyyy/M/dd HH:mm:ss").parse(v);
                }
                if(v.length() == 10){
                    return new SimpleDateFormat("yyyy/MM/dd").parse(v);
                }
                if(v.length() == 8) {
                    return new SimpleDateFormat("yyyy/M/d").parse(v);
                }
            }
            if(v.indexOf("-") != -1){
                if(v.length() == 19){
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(v);
                }
                if(v.length() == 18){
                    return new SimpleDateFormat("yyyy-M-dd HH:mm:ss").parse(v);
                }
                if(v.length() == 16){
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(v);
                }
                if(v.length() == 10){
                    return new SimpleDateFormat("yyyy-MM-dd").parse(v);
                }
                if(v.length() == 8) {
                    return new SimpleDateFormat("yyyy-M-d").parse(v);
                }
            }
        } catch (java.text.ParseException e) {
            return null;
        }
        return null;
    }
}
