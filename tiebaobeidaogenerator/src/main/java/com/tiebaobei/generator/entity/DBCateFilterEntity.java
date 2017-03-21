package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.CategoryBrandModel;
import com.tiebaobei.generator.model.CategoryFilter;
import com.tiebaobei.generator.model.DBCategoryFilterModel;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBCateFilterEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBCategoryFilterModel.class.getSimpleName());
		entity.addIntProperty(DBCategoryFilterModel.COLUMN_FILTER_ID);
		entity.addIntProperty(DBCategoryFilterModel.COLUMN_CATEGORY_ID);

	}
}
