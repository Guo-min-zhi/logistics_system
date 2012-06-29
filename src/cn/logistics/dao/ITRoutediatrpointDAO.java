package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TRoutediatrpoint;

public interface ITRoutediatrpointDAO {

	public abstract void save(TRoutediatrpoint transientInstance);

	public abstract void delete(TRoutediatrpoint persistentInstance);

	public abstract TRoutediatrpoint findById(java.lang.Integer id);

	public abstract List findByExample(TRoutediatrpoint instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TRoutediatrpoint merge(TRoutediatrpoint detachedInstance);

	public abstract void attachDirty(TRoutediatrpoint instance);

	public abstract void attachClean(TRoutediatrpoint instance);

}