package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.THeadaccount;

public interface ITHeadaccountDAO {

	public abstract void save(THeadaccount transientInstance);

	public abstract void delete(THeadaccount persistentInstance);

	public abstract THeadaccount findById(java.lang.Integer id);

	public abstract List findByExample(THeadaccount instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract THeadaccount merge(THeadaccount detachedInstance);

	public abstract void attachDirty(THeadaccount instance);

	public abstract void attachClean(THeadaccount instance);

}