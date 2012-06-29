package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITOrderDAO;
import cn.logistics.pojo.TOrder;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOrder entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TOrder
 * @author MyEclipse Persistence Tools
 */

public class TOrderDAO extends HibernateDaoSupport implements ITOrderDAO {
	private static final Log log = LogFactory.getLog(TOrderDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#save(cn.logistics.pojo.TOrder)
	 */
	public void save(TOrder transientInstance) {
		log.debug("saving TOrder instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#delete(cn.logistics.pojo.TOrder)
	 */
	public void delete(TOrder persistentInstance) {
		log.debug("deleting TOrder instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#findById(java.lang.Integer)
	 */
	public TOrder findById(java.lang.Integer id) {
		log.debug("getting TOrder instance with id: " + id);
		try {
			TOrder instance = (TOrder) getHibernateTemplate().get(
					"cn.logistics.pojo.TOrder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#findByExample(cn.logistics.pojo.TOrder)
	 */
	public List findByExample(TOrder instance) {
		log.debug("finding TOrder instance by example");
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
	 * @see cn.logistics.dao.impl.ITOrderDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TOrder instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TOrder as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TOrder instances");
		try {
			String queryString = "from TOrder";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#merge(cn.logistics.pojo.TOrder)
	 */
	public TOrder merge(TOrder detachedInstance) {
		log.debug("merging TOrder instance");
		try {
			TOrder result = (TOrder) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#attachDirty(cn.logistics.pojo.TOrder)
	 */
	public void attachDirty(TOrder instance) {
		log.debug("attaching dirty TOrder instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderDAO#attachClean(cn.logistics.pojo.TOrder)
	 */
	public void attachClean(TOrder instance) {
		log.debug("attaching clean TOrder instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITOrderDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITOrderDAO) ctx.getBean("TOrderDAO");
	}
}