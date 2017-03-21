package com.example.pengtaoh.greendaoimportoutsidedb;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by pengtaoh on 2016/11/30.
 */
public class MainApp extends Application {

	/**
	 * 单例对象
	 */
	private static MainApp instance;

	private static PackageInfo packInfo;

	@Override
	public void onCreate()
	{
		super.onCreate();
		instance = this;
	}

	public static MainApp getIns()
	{
		return instance;
	}

	/**
	 * 获取apk包名路径
	 */
	public String getDataDirs()
	{
		if (packInfo == null)
			getAppInfo();
		return packInfo != null && packInfo.applicationInfo != null ? packInfo.applicationInfo.dataDir : "";
	}

	private void getAppInfo()
	{
		// 获取packageManager的实例
		PackageManager packageManager = getPackageManager();
		// getPackageName()是你当前类的包名，0代表是获取版本信息
		try
		{
			packInfo = packageManager.getPackageInfo(getPackageName(), 0);
		}
		catch (PackageManager.NameNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
