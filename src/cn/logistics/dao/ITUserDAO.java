package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TUser;

public interface ITUserDAO {

	public abstract void save(TUser transientInstance);

	public abstract void delete(TUser persistentInstance);

	public abstract TUser findById(java.lang.Integer id);

	public abstract List findByExample(TUser instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TUser merge(TUser detachedInstance);

	public abstract void attachDirty(TUser instance);

	public abstract void attachClean(TUser instance);

}