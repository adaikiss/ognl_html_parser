package com.example.ognl_html_parser;

import java.util.regex.*;

/**
 * @author hlw
 * @date 2016/3/9
 */
public class ParserRoot {
    public String substringToIndexOf(String text, String indexText){
        if(text == null){
            return "";
        }
        int pos = text.indexOf(indexText);
        if(pos == -1){
            return text;
        }
        return text.substring(0, pos);
    }

    public String substringFromIndexOf(String text, String indexText){
        if(text == null){
            return "";
        }
        int pos = text.indexOf(indexText);
        if(pos == -1){
            return text;
        }
        return text.substring(pos + indexText.length());
    }

    public static String substring(String text, String regex){
        Matcher matcher = Pattern.compile(regex).matcher(text);
        if(matcher.find()){
            return matcher.group(1);
        }
        return null;
    }

    public ChapterInfo chapter(String originId, String name){
        return chapter(Long.valueOf(originId), name);
    }

    public ChapterInfo chapter(Long originId, String name){
        ChapterInfo chapterInfo = new ChapterInfo();
        chapterInfo.setOriginId(originId);
        chapterInfo.setName(name);
        return chapterInfo;
    }

    public static void main(String[] args){
        System.out.println(substring("http://www.biquge.la/book/3711/", "(\\d+)"));
    }
}
