package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TCarschedule;

public interface ITCarscheduleDAO {

	public abstract void save(TCarschedule transientInstance);

	public abstract void delete(TCarschedule persistentInstance);

	public abstract TCarschedule findById(java.lang.Integer id);

	public abstract List findByExample(TCarschedule instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TCarschedule merge(TCarschedule detachedInstance);

	public abstract void attachDirty(TCarschedule instance);

	public abstract void attachClean(TCarschedule instance);

}