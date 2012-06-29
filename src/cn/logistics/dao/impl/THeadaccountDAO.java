package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITHeadaccountDAO;
import cn.logistics.pojo.THeadaccount;

/**
 * A data access object (DAO) providing persistence and search support for
 * THeadaccount entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.THeadaccount
 * @author MyEclipse Persistence Tools
 */

public class THeadaccountDAO extends HibernateDaoSupport implements ITHeadaccountDAO {
	private static final Log log = LogFactory.getLog(THeadaccountDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#save(cn.logistics.pojo.THeadaccount)
	 */
	public void save(THeadaccount transientInstance) {
		log.debug("saving THeadaccount instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#delete(cn.logistics.pojo.THeadaccount)
	 */
	public void delete(THeadaccount persistentInstance) {
		log.debug("deleting THeadaccount instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#findById(java.lang.Integer)
	 */
	public THeadaccount findById(java.lang.Integer id) {
		log.debug("getting THeadaccount instance with id: " + id);
		try {
			THeadaccount instance = (THeadaccount) getHibernateTemplate().get(
					"cn.logistics.pojo.THeadaccount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#findByExample(cn.logistics.pojo.THeadaccount)
	 */
	public List findByExample(THeadaccount instance) {
		log.debug("finding THeadaccount instance by example");
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
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding THeadaccount instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from THeadaccount as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all THeadaccount instances");
		try {
			String queryString = "from THeadaccount";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#merge(cn.logistics.pojo.THeadaccount)
	 */
	public THeadaccount merge(THeadaccount detachedInstance) {
		log.debug("merging THeadaccount instance");
		try {
			THeadaccount result = (THeadaccount) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#attachDirty(cn.logistics.pojo.THeadaccount)
	 */
	public void attachDirty(THeadaccount instance) {
		log.debug("attaching dirty THeadaccount instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITHeadaccountDAO#attachClean(cn.logistics.pojo.THeadaccount)
	 */
	public void attachClean(THeadaccount instance) {
		log.debug("attaching clean THeadaccount instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITHeadaccountDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITHeadaccountDAO) ctx.getBean("THeadaccountDAO");
	}
}