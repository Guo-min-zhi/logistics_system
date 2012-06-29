package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITVehicleDAO;
import cn.logistics.pojo.TVehicle;

/**
 * A data access object (DAO) providing persistence and search support for
 * TVehicle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TVehicle
 * @author MyEclipse Persistence Tools
 */

public class TVehicleDAO extends HibernateDaoSupport implements ITVehicleDAO {
	private static final Log log = LogFactory.getLog(TVehicleDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#save(cn.logistics.pojo.TVehicle)
	 */
	public void save(TVehicle transientInstance) {
		log.debug("saving TVehicle instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#delete(cn.logistics.pojo.TVehicle)
	 */
	public void delete(TVehicle persistentInstance) {
		log.debug("deleting TVehicle instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#findById(java.lang.Integer)
	 */
	public TVehicle findById(java.lang.Integer id) {
		log.debug("getting TVehicle instance with id: " + id);
		try {
			TVehicle instance = (TVehicle) getHibernateTemplate().get(
					"cn.logistics.pojo.TVehicle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#findByExample(cn.logistics.pojo.TVehicle)
	 */
	public List findByExample(TVehicle instance) {
		log.debug("finding TVehicle instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TVehicle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TVehicle as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TVehicle instances");
		try {
			String queryString = "from TVehicle";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#merge(cn.logistics.pojo.TVehicle)
	 */
	public TVehicle merge(TVehicle detachedInstance) {
		log.debug("merging TVehicle instance");
		try {
			TVehicle result = (TVehicle) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#attachDirty(cn.logistics.pojo.TVehicle)
	 */
	public void attachDirty(TVehicle instance) {
		log.debug("attaching dirty TVehicle instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITVehicleDAO#attachClean(cn.logistics.pojo.TVehicle)
	 */
	public void attachClean(TVehicle instance) {
		log.debug("attaching clean TVehicle instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITVehicleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITVehicleDAO) ctx.getBean("TVehicleDAO");
	}
}