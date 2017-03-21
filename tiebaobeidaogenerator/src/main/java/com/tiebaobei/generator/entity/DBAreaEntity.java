package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.Area;
import com.tiebaobei.generator.model.DBAreaModel;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBAreaEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBAreaModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addIntProperty(DBAreaModel.COLUMN_PARENT_ID);
		entity.addStringProperty(DBAreaModel.COLUMN_NAME);
		entity.addStringProperty(DBAreaModel.COLUMN_EN_FIRST_CHAR);
		entity.addIntProperty(DBAreaModel.COLUMN_WEIGHT);

	}
}
