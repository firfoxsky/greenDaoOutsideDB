package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.DBFilterModel;
import com.tiebaobei.generator.model.Filter;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBFilterEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBFilterModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addIntProperty(DBFilterModel.COLUMN_PARENT_ID);
		entity.addStringProperty(DBFilterModel.COLUMN_NAME);
		entity.addStringProperty(DBFilterModel.COLUMN_MULTIPLE_CHOICE);
		entity.addIntProperty(DBFilterModel.COLUMN_WEIGHT);

	}
}
