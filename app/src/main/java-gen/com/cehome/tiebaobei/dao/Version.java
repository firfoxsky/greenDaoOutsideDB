package com.cehome.tiebaobei.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "VERSION".
 */
public class Version {

    private Integer dbVersion;
    private String dataVersion;
    private String lastUpdateTime;

    public Version() {
    }

    public Version(Integer dbVersion, String dataVersion, String lastUpdateTime) {
        this.dbVersion = dbVersion;
        this.dataVersion = dataVersion;
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(Integer dbVersion) {
        this.dbVersion = dbVersion;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

}
