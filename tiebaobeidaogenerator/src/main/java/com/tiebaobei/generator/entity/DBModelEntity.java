package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.DBModelModel;
import com.tiebaobei.generator.model.Model;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBModelEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBModelModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addIntProperty(DBModelModel.COLUMN_PARENT_ID);
		entity.addStringProperty(DBModelModel.COLUMN_NAME);
		entity.addStringProperty(DBModelModel.COLUMN_EN_FIRST_CHAR);
		entity.addIntProperty(DBModelModel.COLUMN_WEIGHT);
		entity.addStringProperty(DBModelModel.COLUMN_HOT);
	}
}
