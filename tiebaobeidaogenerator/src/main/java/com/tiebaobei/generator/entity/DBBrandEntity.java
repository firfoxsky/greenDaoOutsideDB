package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.Brand;
import com.tiebaobei.generator.model.DBBrandModel;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBBrandEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBBrandModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addStringProperty(DBBrandModel.COLUMN_NAME);
		entity.addStringProperty(DBBrandModel.COLUMN_EN_FIRST_CHAR);
		entity.addIntProperty(DBBrandModel.COLUMN_WEIGHT);
		entity.addStringProperty(DBBrandModel.COLUMN_HOT);
		entity.addStringProperty(DBBrandModel.COLUMN_IMAGE_URL);
	}
}
