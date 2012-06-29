package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TJointable;

public interface ITJointableDAO {

	public abstract void save(TJointable transientInstance);

	public abstract void delete(TJointable persistentInstance);

	public abstract TJointable findById(java.lang.Integer id);

	public abstract List findByExample(TJointable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TJointable merge(TJointable detachedInstance);

	public abstract void attachDirty(TJointable instance);

	public abstract void attachClean(TJointable instance);

}