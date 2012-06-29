package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TOrderstatus;

public interface ITOrderstatusDAO {

	public abstract void save(TOrderstatus transientInstance);

	public abstract void delete(TOrderstatus persistentInstance);

	public abstract TOrderstatus findById(java.lang.Integer id);

	public abstract List findByExample(TOrderstatus instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TOrderstatus merge(TOrderstatus detachedInstance);

	public abstract void attachDirty(TOrderstatus instance);

	public abstract void attachClean(TOrderstatus instance);

}