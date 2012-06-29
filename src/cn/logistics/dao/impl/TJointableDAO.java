package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITJointableDAO;
import cn.logistics.pojo.TJointable;

/**
 * A data access object (DAO) providing persistence and search support for
 * TJointable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TJointable
 * @author MyEclipse Persistence Tools
 */

public class TJointableDAO extends HibernateDaoSupport implements ITJointableDAO {
	private static final Log log = LogFactory.getLog(TJointableDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#save(cn.logistics.pojo.TJointable)
	 */
	public void save(TJointable transientInstance) {
		log.debug("saving TJointable instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#delete(cn.logistics.pojo.TJointable)
	 */
	public void delete(TJointable persistentInstance) {
		log.debug("deleting TJointable instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#findById(java.lang.Integer)
	 */
	public TJointable findById(java.lang.Integer id) {
		log.debug("getting TJointable instance with id: " + id);
		try {
			TJointable instance = (TJointable) getHibernateTemplate().get(
					"cn.logistics.pojo.TJointable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#findByExample(cn.logistics.pojo.TJointable)
	 */
	public List findByExample(TJointable instance) {
		log.debug("finding TJointable instance by example");
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
	 * @see cn.logistics.dao.impl.ITJointableDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TJointable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TJointable as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TJointable instances");
		try {
			String queryString = "from TJointable";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#merge(cn.logistics.pojo.TJointable)
	 */
	public TJointable merge(TJointable detachedInstance) {
		log.debug("merging TJointable instance");
		try {
			TJointable result = (TJointable) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#attachDirty(cn.logistics.pojo.TJointable)
	 */
	public void attachDirty(TJointable instance) {
		log.debug("attaching dirty TJointable instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointableDAO#attachClean(cn.logistics.pojo.TJointable)
	 */
	public void attachClean(TJointable instance) {
		log.debug("attaching clean TJointable instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITJointableDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITJointableDAO) ctx.getBean("TJointableDAO");
	}
}