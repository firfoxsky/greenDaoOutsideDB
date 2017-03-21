package com.tiebaobei.generator;

import com.tiebaobei.generator.constants.DbContants;
import com.tiebaobei.generator.entity.AreaEntity;
import com.tiebaobei.generator.entity.BrandEntity;
import com.tiebaobei.generator.entity.CateBrandModelEntity;
import com.tiebaobei.generator.entity.CateFilterEntity;
import com.tiebaobei.generator.entity.CategoryEntity;
import com.tiebaobei.generator.entity.DBAreaEntity;
import com.tiebaobei.generator.entity.DBBrandEntity;
import com.tiebaobei.generator.entity.DBCateBrandModelEntity;
import com.tiebaobei.generator.entity.DBCateFilterEntity;
import com.tiebaobei.generator.entity.DBCategoryEntity;
import com.tiebaobei.generator.entity.DBFilterEntity;
import com.tiebaobei.generator.entity.DBModelEntity;
import com.tiebaobei.generator.entity.DBSortEntity;
import com.tiebaobei.generator.entity.DBVersionEntity;
import com.tiebaobei.generator.entity.FilterEntity;
import com.tiebaobei.generator.entity.ModelEntity;
import com.tiebaobei.generator.entity.SortEntity;
import com.tiebaobei.generator.entity.VersionEntity;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;

public class TieBaoBeiDaoGenerator {


	public static void main(String[] args) throws Exception {
		String path = DbContants.DATABASE_PATH;
		if (args.length >= 1) {
			path = args[0];
		}
		Schema schema = new Schema(DbContants.DATABASE_VERSION, DbContants.DATABASE_DEFAULT_JAVA_PACKAGE);
		addAllSchema(schema);
		new DaoGenerator().generateAll(schema, path);
	}

	private static void addAllSchema(Schema schema) {
		new DBModelEntity().addEntity(schema);
		new DBBrandEntity().addEntity(schema);
		new DBCategoryEntity().addEntity(schema);
		new DBAreaEntity().addEntity(schema);
		new DBCateFilterEntity().addEntity(schema);
		new DBCateBrandModelEntity().addEntity(schema);
		new DBFilterEntity().addEntity(schema);
		new DBSortEntity().addEntity(schema);
		new DBVersionEntity().addEntity(schema);
	}
}
