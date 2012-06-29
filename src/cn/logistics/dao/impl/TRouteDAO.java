package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITRouteDAO;
import cn.logistics.pojo.TRoute;

/**
 * A data access object (DAO) providing persistence and search support for
 * TRoute entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TRoute
 * @author MyEclipse Persistence Tools
 */

public class TRouteDAO extends HibernateDaoSupport implements ITRouteDAO {
	private static final Log log = LogFactory.getLog(TRouteDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#save(cn.logistics.pojo.TRoute)
	 */
	public void save(TRoute transientInstance) {
		log.debug("saving TRoute instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#delete(cn.logistics.pojo.TRoute)
	 */
	public void delete(TRoute persistentInstance) {
		log.debug("deleting TRoute instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#findById(java.lang.Integer)
	 */
	public TRoute findById(java.lang.Integer id) {
		log.debug("getting TRoute instance with id: " + id);
		try {
			TRoute instance = (TRoute) getHibernateTemplate().get(
					"cn.logistics.pojo.TRoute", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#findByExample(cn.logistics.pojo.TRoute)
	 */
	public List findByExample(TRoute instance) {
		log.debug("finding TRoute instance by example");
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
	 * @see cn.logistics.dao.impl.ITRouteDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TRoute instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TRoute as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TRoute instances");
		try {
			String queryString = "from TRoute";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#merge(cn.logistics.pojo.TRoute)
	 */
	public TRoute merge(TRoute detachedInstance) {
		log.debug("merging TRoute instance");
		try {
			TRoute result = (TRoute) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#attachDirty(cn.logistics.pojo.TRoute)
	 */
	public void attachDirty(TRoute instance) {
		log.debug("attaching dirty TRoute instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRouteDAO#attachClean(cn.logistics.pojo.TRoute)
	 */
	public void attachClean(TRoute instance) {
		log.debug("attaching clean TRoute instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITRouteDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITRouteDAO) ctx.getBean("TRouteDAO");
	}
}