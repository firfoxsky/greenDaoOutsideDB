package com.cehome.tiebaobei.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CITY".
 */
public class City {

    private Long id;
    private String cityName;
    private String nameSort;

    public City() {
    }

    public City(Long id) {
        this.id = id;
    }

    public City(Long id, String cityName, String nameSort) {
        this.id = id;
        this.cityName = cityName;
        this.nameSort = nameSort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getNameSort() {
        return nameSort;
    }

    public void setNameSort(String nameSort) {
        this.nameSort = nameSort;
    }

}
