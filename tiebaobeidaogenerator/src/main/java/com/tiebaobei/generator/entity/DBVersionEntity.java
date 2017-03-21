package com.tiebaobei.generator.entity;

import com.tiebaobei.generator.model.DBVersionModel;
import com.tiebaobei.generator.model.Version;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by lyh on 2016/11/30.
 */
public class DBVersionEntity {

	public void addEntity(Schema schema) {
		Entity entity = schema.addEntity(DBVersionModel.class.getSimpleName());
		entity.addIntProperty(DBVersionModel.COLUMN_DB_VERSION);
		entity.addStringProperty(DBVersionModel.COLUMN_DATA_VERSION);
		entity.addStringProperty(DBVersionModel.COLUMN_LAST_UPDATE_TIME);

	}
}
