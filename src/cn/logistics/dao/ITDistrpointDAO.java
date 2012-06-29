package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TDistrpoint;

public interface ITDistrpointDAO {

	public abstract void save(TDistrpoint transientInstance);

	public abstract void delete(TDistrpoint persistentInstance);

	public abstract TDistrpoint findById(java.lang.Integer id);

	public abstract List findByExample(TDistrpoint instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TDistrpoint merge(TDistrpoint detachedInstance);

	public abstract void attachDirty(TDistrpoint instance);

	public abstract void attachClean(TDistrpoint instance);

}