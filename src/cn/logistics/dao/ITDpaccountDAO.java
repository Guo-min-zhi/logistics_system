package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TDpaccount;

public interface ITDpaccountDAO {

	public abstract void save(TDpaccount transientInstance);

	public abstract void delete(TDpaccount persistentInstance);

	public abstract TDpaccount findById(java.lang.Integer id);

	public abstract List findByExample(TDpaccount instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TDpaccount merge(TDpaccount detachedInstance);

	public abstract void attachDirty(TDpaccount instance);

	public abstract void attachClean(TDpaccount instance);

}