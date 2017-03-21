package com.example.pengtaoh.greendaoimportoutsidedb;

import com.cehome.tiebaobei.dao.Area;
import com.cehome.tiebaobei.dao.AreaDao;
import com.cehome.tiebaobei.dao.Brand;
import com.cehome.tiebaobei.dao.BrandDao;
import com.cehome.tiebaobei.dao.Category;
import com.cehome.tiebaobei.dao.CategoryBrandModel;
import com.cehome.tiebaobei.dao.CategoryBrandModelDao;
import com.cehome.tiebaobei.dao.CategoryDao;
import com.cehome.tiebaobei.dao.CategoryFilter;
import com.cehome.tiebaobei.dao.CategoryFilterDao;
import com.cehome.tiebaobei.dao.Filter;
import com.cehome.tiebaobei.dao.FilterDao;
import com.cehome.tiebaobei.dao.Model;
import com.cehome.tiebaobei.dao.ModelDao;
import com.cehome.tiebaobei.dao.Sort;
import com.cehome.tiebaobei.dao.SortDao;
import com.cehome.tiebaobei.dao.Version;
import com.cehome.tiebaobei.dao.VersionDao;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成測試數據
 * <p/>
 * Created by pengtaoh on 2016/12/8.
 */
public class TestInitUtils {


	public static void createTestDB() {
		insertArea();
		insertBrand();
		insertCategory();
		insertModel();

		insertCateBrandModel();
		insertCateFilter();

		insertFilter();
		insertVersion();
		insertSort();
	}

	private static void insertArea() {
		List<Area> areaList = new ArrayList<>();
		AreaDao areaDao = DBController.getDaoSession().getAreaDao();
		for (int i = 0; i < 10; i++) {
			Area area = new Area();
			area.setId(i);
			area.setName("城市" + i);
			if (i < 3) {
				area.setParentId(-1);
				area.setEnFirstChar("C");
			} else if (i > 3 && i < 6) {
				area.setEnFirstChar("H");
				area.setParentId(1);
			} else if (i >= 6) {
				area.setEnFirstChar("Z");
				area.setParentId(2);
			}
			areaList.add(area);
		}
		areaDao.insertInTx(areaList);
	}

	private static void insertBrand() {
		String imageUrl = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=4155302816,1201715785&fm=116&gp=0.jpg";
		BrandDao brandDao = DBController.getDaoSession().getBrandDao();
		List<Brand> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Brand brand = new Brand();
			brand.setId(i);
			brand.setName("品牌" + i);
			if (i < 3) {
				brand.setEnFirstChar("C");
				brand.setHot(Boolean.TRUE.toString());
				brand.setImageURL(imageUrl);
			} else if (i > 3 && i < 6) {
				brand.setEnFirstChar("H");
				brand.setHot(Boolean.FALSE.toString());
			} else if (i >= 6) {
				brand.setEnFirstChar("Z");
				brand.setHot(Boolean.TRUE.toString());
				brand.setImageURL(imageUrl);
			}
			arrayList.add(brand);
		}
		brandDao.insertInTx(arrayList);
	}


	private static void insertCategory() {
		CategoryDao categoryDao = DBController.getDaoSession().getCategoryDao();
		List<Category> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Category category = new Category();
			category.setId(i);
			category.setName("分类 " + i);
			if (i < 3) {
				category.setEnFirstChar("C");
				category.setHot(Boolean.TRUE.toString());
			} else if (i > 3 && i < 6) {
				category.setEnFirstChar("H");
				category.setHot(Boolean.FALSE.toString());
			} else if (i >= 6) {
				category.setEnFirstChar("Z");
				category.setHot(Boolean.TRUE.toString());
			}
			category.setWeight(i);
			arrayList.add(category);
		}
		categoryDao.insertInTx(arrayList);
	}

	private static void insertModel() {
		ModelDao dao = DBController.getDaoSession().getModelDao();
		List<Model> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Model item = new Model();
			item.setName("机型 " + i);
			item.setId(i);
			if (i < 3) {
				item.setName("系列 " + i);
				item.setEnFirstChar("C");
				item.setHot(Boolean.TRUE.toString());
			} else if (i > 3 && i < 6) {
				item.setEnFirstChar("H");
				item.setParentId(2);
				item.setHot(Boolean.FALSE.toString());
			} else if (i >= 6) {
				item.setEnFirstChar("Z");
				item.setParentId(1);
				item.setHot(Boolean.TRUE.toString());
			}
			item.setWeight(i);
//			dao.insert(item);
			arrayList.add(item);
		}
		dao.insertInTx(arrayList);
	}

	private static void insertCateBrandModel() {
		CategoryBrandModelDao dao = DBController.getDaoSession().getCategoryBrandModelDao();
		CategoryBrandModel item = new CategoryBrandModel();
		item.setBrandId(2);
		item.setModelId(2);
		item.setCategoryId(1);
		dao.insert(item);

		CategoryBrandModel item1 = new CategoryBrandModel();
		item1.setBrandId(4);
		item1.setModelId(5);
		item1.setCategoryId(3);
		dao.insert(item1);

		CategoryBrandModel item2 = new CategoryBrandModel();
		item2.setBrandId(3);
		item2.setModelId(6);
		item2.setCategoryId(3);
		dao.insert(item2);

		CategoryBrandModel item3 = new CategoryBrandModel();
		item3.setBrandId(2);
		item3.setModelId(5);
		item3.setCategoryId(8);
		dao.insert(item3);

		CategoryBrandModel item4 = new CategoryBrandModel();
		item4.setBrandId(9);
		item4.setModelId(2);
		item4.setCategoryId(7);
		dao.insert(item4);
	}


	private static void insertCateFilter() {
		CategoryFilterDao dao = DBController.getDaoSession().getCategoryFilterDao();
		List<CategoryFilter> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			CategoryFilter item = new CategoryFilter();
			item.setFilterId(i);
			item.setCategoryId(i);
			arrayList.add(item);
		}
		dao.insertInTx(arrayList);
	}

	private static void insertFilter() {
		FilterDao dao = DBController.getDaoSession().getFilterDao();
		List<Filter> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Filter item;
			if (i < 5) {
				item = new Filter(i, i, "筛选" + i, "true", i);
			} else
				item = new Filter(i, 10 - i, "筛选" + i, "false", i);
			arrayList.add(item);
		}
		dao.insertInTx(arrayList);
	}


	private static void insertVersion() {
		VersionDao dao = DBController.getDaoSession().getVersionDao();
		Version item = new Version(1, "1_1", "" + System.currentTimeMillis());
		dao.insert(item);
	}

	private static void insertSort() {
		SortDao dao = DBController.getDaoSession().getSortDao();
		List<Sort> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Sort item = new Sort(i, "排序字典 " + i, i);
			arrayList.add(item);
		}
		dao.insertInTx(arrayList);
	}
}
