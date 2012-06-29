package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TRole;

public interface ITRoleDAO {

	public abstract void save(TRole transientInstance);

	public abstract void delete(TRole persistentInstance);

	public abstract TRole findById(java.lang.Integer id);

	public abstract List findByExample(TRole instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TRole merge(TRole detachedInstance);

	public abstract void attachDirty(TRole instance);

	public abstract void attachClean(TRole instance);

}