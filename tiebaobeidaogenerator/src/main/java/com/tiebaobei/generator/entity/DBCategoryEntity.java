package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.Category;
import com.tiebaobei.generator.model.DBCategoryModel;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBCategoryEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBCategoryModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addIntProperty(DBCategoryModel.COLUMN_PARENT_ID);
		entity.addStringProperty(DBCategoryModel.COLUMN_NAME);
		entity.addStringProperty(DBCategoryModel.COLUMN_EN_FIRST_CHAR);
		entity.addIntProperty(DBCategoryModel.COLUMN_WEIGHT);
		entity.addStringProperty(DBCategoryModel.COLUMN_HOT);
	}
}
