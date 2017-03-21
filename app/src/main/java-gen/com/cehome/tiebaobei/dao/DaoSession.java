package com.cehome.tiebaobei.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.cehome.tiebaobei.dao.Model;
import com.cehome.tiebaobei.dao.Brand;
import com.cehome.tiebaobei.dao.Category;
import com.cehome.tiebaobei.dao.Area;
import com.cehome.tiebaobei.dao.CategoryFilter;
import com.cehome.tiebaobei.dao.CategoryBrandModel;
import com.cehome.tiebaobei.dao.Filter;
import com.cehome.tiebaobei.dao.Sort;
import com.cehome.tiebaobei.dao.Version;

import com.cehome.tiebaobei.dao.ModelDao;
import com.cehome.tiebaobei.dao.BrandDao;
import com.cehome.tiebaobei.dao.CategoryDao;
import com.cehome.tiebaobei.dao.AreaDao;
import com.cehome.tiebaobei.dao.CategoryFilterDao;
import com.cehome.tiebaobei.dao.CategoryBrandModelDao;
import com.cehome.tiebaobei.dao.FilterDao;
import com.cehome.tiebaobei.dao.SortDao;
import com.cehome.tiebaobei.dao.VersionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig modelDaoConfig;
    private final DaoConfig brandDaoConfig;
    private final DaoConfig categoryDaoConfig;
    private final DaoConfig areaDaoConfig;
    private final DaoConfig categoryFilterDaoConfig;
    private final DaoConfig categoryBrandModelDaoConfig;
    private final DaoConfig filterDaoConfig;
    private final DaoConfig sortDaoConfig;
    private final DaoConfig versionDaoConfig;

    private final ModelDao modelDao;
    private final BrandDao brandDao;
    private final CategoryDao categoryDao;
    private final AreaDao areaDao;
    private final CategoryFilterDao categoryFilterDao;
    private final CategoryBrandModelDao categoryBrandModelDao;
    private final FilterDao filterDao;
    private final SortDao sortDao;
    private final VersionDao versionDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        modelDaoConfig = daoConfigMap.get(ModelDao.class).clone();
        modelDaoConfig.initIdentityScope(type);

        brandDaoConfig = daoConfigMap.get(BrandDao.class).clone();
        brandDaoConfig.initIdentityScope(type);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        areaDaoConfig = daoConfigMap.get(AreaDao.class).clone();
        areaDaoConfig.initIdentityScope(type);

        categoryFilterDaoConfig = daoConfigMap.get(CategoryFilterDao.class).clone();
        categoryFilterDaoConfig.initIdentityScope(type);

        categoryBrandModelDaoConfig = daoConfigMap.get(CategoryBrandModelDao.class).clone();
        categoryBrandModelDaoConfig.initIdentityScope(type);

        filterDaoConfig = daoConfigMap.get(FilterDao.class).clone();
        filterDaoConfig.initIdentityScope(type);

        sortDaoConfig = daoConfigMap.get(SortDao.class).clone();
        sortDaoConfig.initIdentityScope(type);

        versionDaoConfig = daoConfigMap.get(VersionDao.class).clone();
        versionDaoConfig.initIdentityScope(type);

        modelDao = new ModelDao(modelDaoConfig, this);
        brandDao = new BrandDao(brandDaoConfig, this);
        categoryDao = new CategoryDao(categoryDaoConfig, this);
        areaDao = new AreaDao(areaDaoConfig, this);
        categoryFilterDao = new CategoryFilterDao(categoryFilterDaoConfig, this);
        categoryBrandModelDao = new CategoryBrandModelDao(categoryBrandModelDaoConfig, this);
        filterDao = new FilterDao(filterDaoConfig, this);
        sortDao = new SortDao(sortDaoConfig, this);
        versionDao = new VersionDao(versionDaoConfig, this);

        registerDao(Model.class, modelDao);
        registerDao(Brand.class, brandDao);
        registerDao(Category.class, categoryDao);
        registerDao(Area.class, areaDao);
        registerDao(CategoryFilter.class, categoryFilterDao);
        registerDao(CategoryBrandModel.class, categoryBrandModelDao);
        registerDao(Filter.class, filterDao);
        registerDao(Sort.class, sortDao);
        registerDao(Version.class, versionDao);
    }
    
    public void clear() {
        modelDaoConfig.getIdentityScope().clear();
        brandDaoConfig.getIdentityScope().clear();
        categoryDaoConfig.getIdentityScope().clear();
        areaDaoConfig.getIdentityScope().clear();
        categoryFilterDaoConfig.getIdentityScope().clear();
        categoryBrandModelDaoConfig.getIdentityScope().clear();
        filterDaoConfig.getIdentityScope().clear();
        sortDaoConfig.getIdentityScope().clear();
        versionDaoConfig.getIdentityScope().clear();
    }

    public ModelDao getModelDao() {
        return modelDao;
    }

    public BrandDao getBrandDao() {
        return brandDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public AreaDao getAreaDao() {
        return areaDao;
    }

    public CategoryFilterDao getCategoryFilterDao() {
        return categoryFilterDao;
    }

    public CategoryBrandModelDao getCategoryBrandModelDao() {
        return categoryBrandModelDao;
    }

    public FilterDao getFilterDao() {
        return filterDao;
    }

    public SortDao getSortDao() {
        return sortDao;
    }

    public VersionDao getVersionDao() {
        return versionDao;
    }

}
