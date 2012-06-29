package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TStaff;

public interface ITStaffDAO {

	public abstract void save(TStaff transientInstance);

	public abstract void delete(TStaff persistentInstance);

	public abstract TStaff findById(java.lang.Integer id);

	public abstract List findByExample(TStaff instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TStaff merge(TStaff detachedInstance);

	public abstract void attachDirty(TStaff instance);

	public abstract void attachClean(TStaff instance);

}