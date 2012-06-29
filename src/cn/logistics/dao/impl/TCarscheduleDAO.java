package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITCarscheduleDAO;
import cn.logistics.pojo.TCarschedule;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCarschedule entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TCarschedule
 * @author MyEclipse Persistence Tools
 */

public class TCarscheduleDAO extends HibernateDaoSupport implements ITCarscheduleDAO {
	private static final Log log = LogFactory.getLog(TCarscheduleDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#save(cn.logistics.pojo.TCarschedule)
	 */
	public void save(TCarschedule transientInstance) {
		log.debug("saving TCarschedule instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#delete(cn.logistics.pojo.TCarschedule)
	 */
	public void delete(TCarschedule persistentInstance) {
		log.debug("deleting TCarschedule instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#findById(java.lang.Integer)
	 */
	public TCarschedule findById(java.lang.Integer id) {
		log.debug("getting TCarschedule instance with id: " + id);
		try {
			TCarschedule instance = (TCarschedule) getHibernateTemplate().get(
					"cn.logistics.pojo.TCarschedule", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#findByExample(cn.logistics.pojo.TCarschedule)
	 */
	public List findByExample(TCarschedule instance) {
		log.debug("finding TCarschedule instance by example");
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
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TCarschedule instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCarschedule as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TCarschedule instances");
		try {
			String queryString = "from TCarschedule";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#merge(cn.logistics.pojo.TCarschedule)
	 */
	public TCarschedule merge(TCarschedule detachedInstance) {
		log.debug("merging TCarschedule instance");
		try {
			TCarschedule result = (TCarschedule) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#attachDirty(cn.logistics.pojo.TCarschedule)
	 */
	public void attachDirty(TCarschedule instance) {
		log.debug("attaching dirty TCarschedule instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITCarscheduleDAO#attachClean(cn.logistics.pojo.TCarschedule)
	 */
	public void attachClean(TCarschedule instance) {
		log.debug("attaching clean TCarschedule instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITCarscheduleDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITCarscheduleDAO) ctx.getBean("TCarscheduleDAO");
	}
}