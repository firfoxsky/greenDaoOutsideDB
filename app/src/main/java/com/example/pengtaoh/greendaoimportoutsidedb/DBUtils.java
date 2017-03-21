package com.example.pengtaoh.greendaoimportoutsidedb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import com.cehome.tiebaobei.dao.DaoMaster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pengtaoh on 2016/11/30.
 */
public class DBUtils {


	/**
	 * apk安装路径
	 */
	@SuppressLint("NewApi")
	public static final String APK_INSTALL_PATH = MainApp.getIns().getDataDirs();

	/**
	 * apk目录下的数据库路径
	 */
	public static final String APK_DB_PATH = APK_INSTALL_PATH +
		File.separator + "databases/";


	/**
	 * 将raw目录下的db，拷贝到apk安装路径的数据库目录下
	 *
	 * @param context        上下文
	 * @param copyRawDbResId 将要拷贝的raw资源ID
	 * @param apkDbPath      APK数据库路径
	 * @param dbName         数据库文件名
	 * @param refresh        是否覆盖之前的db文件
	 * @return 拷贝是否成功
	 * @throws IOException
	 */
	public static boolean copyRawDBToApkDb(Context context, int copyRawDbResId, String apkDbPath, String dbName, boolean refresh)
		throws IOException {
		boolean b = false;

		File f = new File(apkDbPath);
		if (!f.exists()) {
			f.mkdirs();
		}

		File dbFile = new File(apkDbPath, dbName);
		b = isDbFileExists(dbFile, refresh);
		Log.e("db", "db   " + dbFile.getName());

		InputStream inputStream = context.getResources().openRawResource(copyRawDbResId);
		if (!b) {
			dbFile.setWritable(Boolean.TRUE);
			FileOutputStream os = new FileOutputStream(dbFile.getAbsolutePath());//得到数据库文件的写入流
			byte[] buffer = new byte[1024];
			int count = 0;
			while ((count = inputStream.read(buffer)) > 0) {
				os.write(buffer, 0, count);
			}
			os.flush();
			os.close();
			inputStream.close();

			//d對copy到手機內存中的db文件設置版本；
			SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dbFile, null);
			db.setVersion(DaoMaster.SCHEMA_VERSION);
			db.close();
		}
		return !b;
	}

	/**
	 * 检查DB文件是否存在
	 *
	 * @param f       文件名
	 * @param refresh 是否覆盖之前的db文件
	 * @return
	 */
	private static boolean isDbFileExists(File f, boolean refresh) throws IOException {
		boolean b = false;
		if (f.exists()) {
			if (refresh) {
				f.delete();
				f.createNewFile();
				b = false;
			} else {
				b = true;
			}
		} else
			f.createNewFile();
		return b;
	}


	public void outputDBFile(Context context) {
		try {
			// 拷贝res/raw/xxxxdb.zip 到
			// /data/data/com.xinhang.mobileclient/databases/ 目录下面
			Log.e("db", "开始拷贝");

			outputApkDb();
			Log.e("db", "开始结束");
			Toast.makeText(context, "output success", Toast.LENGTH_SHORT).show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void outputApkDb()
		throws IOException {

		String path = MainApp.getIns().getExternalCacheDir().getAbsolutePath();
		File resFile = new File(APK_DB_PATH, "localdata.db");
		Log.e("db", resFile.exists() + "db   " + resFile.getName());
		File targetFile = new File(path, "target.db");
		if (targetFile.exists()) targetFile.delete();
		targetFile.createNewFile();
		InputStream inputStream = new FileInputStream(resFile);
		resFile.setWritable(Boolean.TRUE);
		FileOutputStream os = new FileOutputStream(targetFile.getAbsolutePath());//得到数据库文件的写入流
		byte[] buffer = new byte[1024];
		int count = 0;
		while ((count = inputStream.read(buffer)) > 0) {
			os.write(buffer, 0, count);
		}
		os.flush();
		os.close();
		inputStream.close();
	}

}
