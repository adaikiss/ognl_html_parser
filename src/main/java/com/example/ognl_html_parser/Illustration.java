package com.example.ognl_html_parser;

import ognl.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

import java.util.*;

/**
 * @author hlw
 * @date 2016/3/9
 */
public class Illustration {
    public static void main(String[] args) throws Exception{
        Document doc = Jsoup.connect("http://www.biquge.la/book/14/").get();
        BookInfo book = new BookInfo();
        String bookInfoExpression = "#maininfo=#doc.select(\"#maininfo\"),#book.name=#maininfo.select('#info h1').text(),#book.author=substringFromIndexOf(#maininfo.select('#info p:nth-child(2)').text(), '：'),#book.lastUpdate=substringFromIndexOf(#maininfo.select('#info p:nth-child(4)').text(), '：'),#_lastChapterA=#maininfo.select('#info p:nth-child(5) a'),#book.newestChapterId=substringToIndexOf(#_lastChapterA.attr(\"href\"), '.'),#book.newestChapterName=#_lastChapterA.text(),#book.description=#maininfo.select(\"#intro\").text(),#book.coverUrl=#doc.select(\"#fmimg>img\").attr('src')";
        OgnlContext context = new OgnlContext();
        context.put("doc", doc);
        context.put("book", book);
        ParserRoot root = new ParserRoot();
        Ognl.setTypeConverter(context, new EnhancedTypeConverter());
        Ognl.getValue(bookInfoExpression, context, root);
        System.out.println(book);
        String chapterListExpression = "#doc.select(\"#list dd >a\").{#item=#this,#root.chapter(substringToIndexOf(#item.attr(\"href\"), \".\"), #item.text())}";
        List<ChapterInfo> chapters = (List<ChapterInfo>)Ognl.getValue(chapterListExpression, context, root);
        System.out.println(chapters);
        String name = "完美世界";
        doc = Jsoup.connect("http://so.biquge.la/cse/search?s=7138806708853866527&q=" + name).get();
        context.put("doc", doc);
        context.put("name", name);
        context.put("author", "辰东");
//        String searchExpression = "substring(#doc.select(\".result-list>.result-item:has(.result-game-item-info-tag>span:nth-child(2):matches(\\\\s*\" + \"辰东\" + \"\\\\s*)):has(.result-item-title>a[title=\" + \"完美世界\" + \"])\").select(\"a[cpos=title]\").attr('href'), '(\\\\d+)')";
        String searchExpression = "substring(#doc.select(\".result-list>.result-item:has(.result-game-item-info-tag>span:nth-child(2):matches(\\\\s*\" + #author + \"\\\\s*)):has(.result-item-title>a[title=\" + #name + \"])\").select(\"a[cpos=title]\").attr('href'), '(\\\\d+)')";
        Long value = (Long)Ognl.getValue(searchExpression, context, root, Long.class);
        System.out.println(value);
    }
}
