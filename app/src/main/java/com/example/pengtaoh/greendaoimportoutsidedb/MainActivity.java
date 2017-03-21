package com.example.pengtaoh.greendaoimportoutsidedb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cehome.tiebaobei.dao.Brand;
import com.cehome.tiebaobei.dao.BrandDao;
import com.cehome.tiebaobei.dao.City;
import com.cehome.tiebaobei.dao.CityDao;
import com.cehome.tiebaobei.dao.DaoMaster;
import com.cehome.tiebaobei.dao.DaoSession;
import com.cehome.tiebaobei.dao.School;
import com.cehome.tiebaobei.dao.SchoolDao;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

	Button button, buttonT;

	Button buttonReadCity, buttonReadTarget;

	Button buttonReadInSide, buttonCopyDisk, buttonInit;

	TextView value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		value = (TextView) findViewById(R.id.hello);
		button = (Button) findViewById(R.id.import_city_db);
		buttonT = (Button) findViewById(R.id.import_target_db);
		buttonReadCity = (Button) findViewById(R.id.select_city_db);
		buttonReadTarget = (Button) findViewById(R.id.select_target_db);
		buttonReadInSide = (Button) findViewById(R.id.select_in_db);
		buttonCopyDisk = (Button) findViewById(R.id.select_disk_db);
		buttonInit = (Button) findViewById(R.id.init_data_db);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				copyRawDBCity();//拷贝外部DB文件到指定目录
			}
		});
		buttonT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				copyRawDBTarget();//拷贝外部DB文件到指定目录
			}
		});

		buttonReadCity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				selDBDataCity(); //通过greendao查询外部db文件数据
			}
		});

		buttonReadTarget.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				selDBDataTarget(); //通过greendao查询外部db文件数据
			}
		});

		buttonReadInSide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				selInDBData(); //通过greendao查询外部db文件数据
			}
		});

		buttonCopyDisk.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					DBUtils.outputApkDb();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		buttonInit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				TestInitUtils.createTestDB();
			}
		});

	}

	private void selDBDataCity() {
		value.setText("");
//		DBController.clearOutsideDao();
//		CityDao cityDao = DBController.getDaoSession(Constance.IMPORT_DB).getCityDao();
//		List<City> brandList = cityDao.queryBuilder().list();
//		if (brandList != null && brandList.size() > 0) {
//			for (City item : brandList)
//				value.append(item.getCityName());
//			Toast.makeText(MainActivity.this, "" + brandList.size(), Toast.LENGTH_SHORT).show();
//		}
	}


	private void selDBDataTarget() {
		value.setText("");

//		DBController.clearOutsideDao();
//		SchoolDao brandDao = DBController.getDaoSession(Constance.IMPORT_TARGET).getSchoolDao();
//		List<School> brandList = brandDao.queryBuilder().list();
//		if (brandList != null && brandList.size() > 0) {
//			for (School item : brandList)
//				value.append(item.getName());
//			Toast.makeText(MainActivity.this, "" + brandList.size(), Toast.LENGTH_SHORT).show();
//		}
	}


	private void selInDBData() {
		value.setText("");
		BrandDao brandDao = DBController.getDaoSession().getBrandDao();
		List<Brand> brandList = brandDao.queryBuilder().list();
		if (brandList != null && brandList.size() > 0)
			for (Brand item : brandList)
				value.append(item.getName() + "\n");
		Toast.makeText(MainActivity.this, "" + brandList.size(), Toast.LENGTH_SHORT).show();
	}

	private void copyRawDBCity() {
		try {
			// /data/data/com.xinhang.mobileclient/databases/ 目录下面
			boolean isSuccess = DBUtils.copyRawDBToApkDb(MainActivity.this, R.raw.city,
				DBUtils.APK_DB_PATH, Constance.IMPORT_DB, true);
			if (isSuccess)
				Toast.makeText(MainActivity.this, "import success", Toast.LENGTH_SHORT).show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copyRawDBTarget() {
		try {
			// /data/data/com.xinhang.mobileclient/databases/ 目录下面
			boolean isSuccess = DBUtils.copyRawDBToApkDb(MainActivity.this, R.raw.target,
				DBUtils.APK_DB_PATH, Constance.IMPORT_TARGET, true);
			if (isSuccess)
				Toast.makeText(MainActivity.this, "import success", Toast.LENGTH_SHORT).show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
