package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.DBCategoryBrandModel;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBCateBrandModelEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBCategoryBrandModel.class.getSimpleName());
		entity.addIntProperty(DBCategoryBrandModel.COLUMN_BRAND_ID);
		entity.addIntProperty(DBCategoryBrandModel.COLUMN_CATEGORY_ID);
		entity.addIntProperty(DBCategoryBrandModel.COLUMN_MODLE_ID);

	}
}
