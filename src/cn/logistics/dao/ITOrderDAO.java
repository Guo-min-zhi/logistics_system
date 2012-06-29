package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TOrder;

public interface ITOrderDAO {

	public abstract void save(TOrder transientInstance);

	public abstract void delete(TOrder persistentInstance);

	public abstract TOrder findById(java.lang.Integer id);

	public abstract List findByExample(TOrder instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TOrder merge(TOrder detachedInstance);

	public abstract void attachDirty(TOrder instance);

	public abstract void attachClean(TOrder instance);

}