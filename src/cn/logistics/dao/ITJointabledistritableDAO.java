package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TJointabledistritable;

public interface ITJointabledistritableDAO {

	public abstract void save(TJointabledistritable transientInstance);

	public abstract void delete(TJointabledistritable persistentInstance);

	public abstract TJointabledistritable findById(java.lang.Integer id);

	public abstract List findByExample(TJointabledistritable instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TJointabledistritable merge(
			TJointabledistritable detachedInstance);

	public abstract void attachDirty(TJointabledistritable instance);

	public abstract void attachClean(TJointabledistritable instance);

}