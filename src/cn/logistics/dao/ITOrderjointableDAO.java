package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TOrderjointable;

public interface ITOrderjointableDAO {

	public abstract void save(TOrderjointable transientInstance);

	public abstract void delete(TOrderjointable persistentInstance);

	public abstract TOrderjointable findById(java.lang.Integer id);

	public abstract List findByExample(TOrderjointable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TOrderjointable merge(TOrderjointable detachedInstance);

	public abstract void attachDirty(TOrderjointable instance);

	public abstract void attachClean(TOrderjointable instance);

}