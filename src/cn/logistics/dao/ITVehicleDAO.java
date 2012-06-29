package cn.logistics.dao;

import java.util.List;

import cn.logistics.pojo.TVehicle;

public interface ITVehicleDAO {

	public abstract void save(TVehicle transientInstance);

	public abstract void delete(TVehicle persistentInstance);

	public abstract TVehicle findById(java.lang.Integer id);

	public abstract List findByExample(TVehicle instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract TVehicle merge(TVehicle detachedInstance);

	public abstract void attachDirty(TVehicle instance);

	public abstract void attachClean(TVehicle instance);

}