package com.cehome.tiebaobei.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CATEGORY_BRAND_MODEL".
 */
public class CategoryBrandModel {

    private Integer brandId;
    private Integer categoryId;
    private Integer modelId;

    public CategoryBrandModel() {
    }

    public CategoryBrandModel(Integer brandId, Integer categoryId, Integer modelId) {
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.modelId = modelId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

}
