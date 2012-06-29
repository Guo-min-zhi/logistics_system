package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITOrderstatusDAO;
import cn.logistics.pojo.TOrderstatus;

/**
 * A data access object (DAO) providing persistence and search support for
 * TOrderstatus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TOrderstatus
 * @author MyEclipse Persistence Tools
 */

public class TOrderstatusDAO extends HibernateDaoSupport implements ITOrderstatusDAO {
	private static final Log log = LogFactory.getLog(TOrderstatusDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#save(cn.logistics.pojo.TOrderstatus)
	 */
	public void save(TOrderstatus transientInstance) {
		log.debug("saving TOrderstatus instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#delete(cn.logistics.pojo.TOrderstatus)
	 */
	public void delete(TOrderstatus persistentInstance) {
		log.debug("deleting TOrderstatus instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#findById(java.lang.Integer)
	 */
	public TOrderstatus findById(java.lang.Integer id) {
		log.debug("getting TOrderstatus instance with id: " + id);
		try {
			TOrderstatus instance = (TOrderstatus) getHibernateTemplate().get(
					"cn.logistics.pojo.TOrderstatus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#findByExample(cn.logistics.pojo.TOrderstatus)
	 */
	public List findByExample(TOrderstatus instance) {
		log.debug("finding TOrderstatus instance by example");
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
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TOrderstatus instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TOrderstatus as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TOrderstatus instances");
		try {
			String queryString = "from TOrderstatus";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#merge(cn.logistics.pojo.TOrderstatus)
	 */
	public TOrderstatus merge(TOrderstatus detachedInstance) {
		log.debug("merging TOrderstatus instance");
		try {
			TOrderstatus result = (TOrderstatus) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#attachDirty(cn.logistics.pojo.TOrderstatus)
	 */
	public void attachDirty(TOrderstatus instance) {
		log.debug("attaching dirty TOrderstatus instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITOrderstatusDAO#attachClean(cn.logistics.pojo.TOrderstatus)
	 */
	public void attachClean(TOrderstatus instance) {
		log.debug("attaching clean TOrderstatus instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITOrderstatusDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITOrderstatusDAO) ctx.getBean("TOrderstatusDAO");
	}
}