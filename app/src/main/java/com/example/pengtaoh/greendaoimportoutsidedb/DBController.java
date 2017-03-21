package com.example.pengtaoh.greendaoimportoutsidedb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.cehome.tiebaobei.dao.DaoMaster;
import com.cehome.tiebaobei.dao.DaoSession;

/**
 * Created by pengtaoh on 2016/11/30.
 */
public class DBController {
	private static DaoMaster daoMasterEcmc;

	private static DaoMaster daoMasterOut;

	// 默认DB
	private static DaoSession daoSessionDefault;

	// 拷贝的db
	private static DaoSession daoOutSession;

	/**
	 * 默认数据库名称:localdata
	 */
	public static final String DATABASE_NAME = "localdata.db";

	/**
	 * 拷贝数据库名称:school
	 */

	private static DaoMaster obtainMaster(Context context, String dbName)
	{

		return new DaoMaster(new DaoMaster.DevOpenHelper(context, dbName, null).getWritableDatabase());
	}

	private static DaoMaster getDaoMaster(Context context, String dbName)
	{
		if (dbName == null)
			return null;
		if (daoMasterEcmc == null)
		{
			daoMasterEcmc = obtainMaster(context, dbName);
		}
		return daoMasterEcmc;
	}

	private static DaoMaster getOutSideDaoMaster(Context context, String dbName)
	{
		if (dbName == null)
			return null;
		if (daoMasterOut == null)
		{
			daoMasterOut = obtainMaster(context, dbName);
		}
		return daoMasterOut;
	}

	/**
	 * 取得DaoSession
	 *
	 * @return
	 */
	public static DaoSession getDaoSession(String dbName)
	{

		if (daoOutSession == null)
		{
			daoOutSession = getOutSideDaoMaster(MainApp.getIns(), dbName).newSession();
		}


		return daoOutSession;
	}

	/**
	 * 默认操作localdata数据库
	 */
	public static DaoSession getDaoSession()
	{

		if (daoSessionDefault == null)
		{
			daoSessionDefault = getDaoMaster(MainApp.getIns(), DATABASE_NAME).newSession();
		}
		return daoSessionDefault;
	}

	/**
	 * 链接不同的外部数据库时需要每次都清掉之前的操作
	 */
	public static void clearOutsideDao(){
		if(daoOutSession != null ){
			daoOutSession = null;
		}
		if(daoMasterOut != null){
			daoMasterOut = null;
		}
	}

}
