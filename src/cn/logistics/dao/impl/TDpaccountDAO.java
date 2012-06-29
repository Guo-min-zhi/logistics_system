package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITDpaccountDAO;
import cn.logistics.pojo.TDpaccount;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDpaccount entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TDpaccount
 * @author MyEclipse Persistence Tools
 */

public class TDpaccountDAO extends HibernateDaoSupport implements ITDpaccountDAO {
	private static final Log log = LogFactory.getLog(TDpaccountDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#save(cn.logistics.pojo.TDpaccount)
	 */
	public void save(TDpaccount transientInstance) {
		log.debug("saving TDpaccount instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#delete(cn.logistics.pojo.TDpaccount)
	 */
	public void delete(TDpaccount persistentInstance) {
		log.debug("deleting TDpaccount instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#findById(java.lang.Integer)
	 */
	public TDpaccount findById(java.lang.Integer id) {
		log.debug("getting TDpaccount instance with id: " + id);
		try {
			TDpaccount instance = (TDpaccount) getHibernateTemplate().get(
					"cn.logistics.pojo.TDpaccount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#findByExample(cn.logistics.pojo.TDpaccount)
	 */
	public List findByExample(TDpaccount instance) {
		log.debug("finding TDpaccount instance by example");
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
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TDpaccount instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TDpaccount as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TDpaccount instances");
		try {
			String queryString = "from TDpaccount";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#merge(cn.logistics.pojo.TDpaccount)
	 */
	public TDpaccount merge(TDpaccount detachedInstance) {
		log.debug("merging TDpaccount instance");
		try {
			TDpaccount result = (TDpaccount) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#attachDirty(cn.logistics.pojo.TDpaccount)
	 */
	public void attachDirty(TDpaccount instance) {
		log.debug("attaching dirty TDpaccount instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDpaccountDAO#attachClean(cn.logistics.pojo.TDpaccount)
	 */
	public void attachClean(TDpaccount instance) {
		log.debug("attaching clean TDpaccount instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITDpaccountDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITDpaccountDAO) ctx.getBean("TDpaccountDAO");
	}
}