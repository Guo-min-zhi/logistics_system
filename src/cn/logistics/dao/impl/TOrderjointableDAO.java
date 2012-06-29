package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITOrderjointableDAO;
import cn.logistics.pojo.TOrderjointable;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOrderjointable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TOrderjointable
 * @author MyEclipse Persistence Tools
 */

public class TOrderjointableDAO extends HibernateDaoSupport implements ITOrderjointableDAO {
	private static final Log log = LogFactory.getLog(TOrderjointableDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#save(cn.logistics.pojo.TOrderjointable)
	 */
	public void save(TOrderjointable transientInstance) {
		log.debug("saving TOrderjointable instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#delete(cn.logistics.pojo.TOrderjointable)
	 */
	public void delete(TOrderjointable persistentInstance) {
		log.debug("deleting TOrderjointable instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#findById(java.lang.Integer)
	 */
	public TOrderjointable findById(java.lang.Integer id) {
		log.debug("getting TOrderjointable instance with id: " + id);
		try {
			TOrderjointable instance = (TOrderjointable) getHibernateTemplate()
					.get("cn.logistics.pojo.TOrderjointable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#findByExample(cn.logistics.pojo.TOrderjointable)
	 */
	public List findByExample(TOrderjointable instance) {
		log.debug("finding TOrderjointable instance by example");
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
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TOrderjointable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TOrderjointable as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TOrderjointable instances");
		try {
			String queryString = "from TOrderjointable";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#merge(cn.logistics.pojo.TOrderjointable)
	 */
	public TOrderjointable merge(TOrderjointable detachedInstance) {
		log.debug("merging TOrderjointable instance");
		try {
			TOrderjointable result = (TOrderjointable) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#attachDirty(cn.logistics.pojo.TOrderjointable)
	 */
	public void attachDirty(TOrderjointable instance) {
		log.debug("attaching dirty TOrderjointable instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderjointableDAO#attachClean(cn.logistics.pojo.TOrderjointable)
	 */
	public void attachClean(TOrderjointable instance) {
		log.debug("attaching clean TOrderjointable instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITOrderjointableDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITOrderjointableDAO) ctx.getBean("TOrderjointableDAO");
	}
}