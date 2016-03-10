package com.example.ognl_html_parser;

import org.apache.commons.lang3.builder.*;

import java.util.*;

/**
 * @author hlw
 * @date 2016/3/9
 */
public class BookInfo {
    private String name;
    private String author;
    private Date lastUpdate;
    private Long newestChapterId;
    private String newestChapterName;
    private String description;
    private String coverUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getNewestChapterId() {
        return newestChapterId;
    }

    public void setNewestChapterId(Long newestChapterId) {
        this.newestChapterId = newestChapterId;
    }

    public String getNewestChapterName() {
        return newestChapterName;
    }

    public void setNewestChapterName(String newestChapterName) {
        this.newestChapterName = newestChapterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
