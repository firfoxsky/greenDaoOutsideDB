package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.DBSortModel;
import com.tiebaobei.generator.model.Sort;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBSortEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBSortModel.class.getSimpleName());
		entity.addIdProperty().notNull();
		entity.addStringProperty(DBSortModel.COLUMN_NAME);
		entity.addIntProperty(DBSortModel.COLUMN_WEIGHT);
	}
}
