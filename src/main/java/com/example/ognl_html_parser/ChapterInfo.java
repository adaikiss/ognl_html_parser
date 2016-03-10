package com.example.ognl_html_parser;

import org.apache.commons.lang3.builder.*;

/**
 * @author hlw
 * @date 2016/3/10
 */
public class ChapterInfo {
    private Long originId;
    private String name;

    public Long getOriginId() {
        return originId;
    }

    public void setOriginId(Long originId) {
        this.originId = originId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this);
    }
}
