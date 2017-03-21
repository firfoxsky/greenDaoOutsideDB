package com.cehome.tiebaobei.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CATEGORY".
 */
public class Category {

    private long id;
    private Integer parentId;
    private String name;
    private String enFirstChar;
    private Integer weight;
    private String hot;

    public Category() {
    }

    public Category(long id) {
        this.id = id;
    }

    public Category(long id, Integer parentId, String name, String enFirstChar, Integer weight, String hot) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.enFirstChar = enFirstChar;
        this.weight = weight;
        this.hot = hot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnFirstChar() {
        return enFirstChar;
    }

    public void setEnFirstChar(String enFirstChar) {
        this.enFirstChar = enFirstChar;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

}
