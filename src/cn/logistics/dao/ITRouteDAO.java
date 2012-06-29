package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TRoute;

public interface ITRouteDAO {

	public abstract void save(TRoute transientInstance);

	public abstract void delete(TRoute persistentInstance);

	public abstract TRoute findById(java.lang.Integer id);

	public abstract List findByExample(TRoute instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TRoute merge(TRoute detachedInstance);

	public abstract void attachDirty(TRoute instance);

	public abstract void attachClean(TRoute instance);

}