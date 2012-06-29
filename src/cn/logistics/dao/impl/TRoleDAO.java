package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITRoleDAO;
import cn.logistics.pojo.TRole;

/**
 * A data access object (DAO) providing persistence and search support for TRole
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.logistics.pojo.TRole
 * @author MyEclipse Persistence Tools
 */

public class TRoleDAO extends HibernateDaoSupport implements ITRoleDAO {
	private static final Log log = LogFactory.getLog(TRoleDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#save(cn.logistics.pojo.TRole)
	 */
	public void save(TRole transientInstance) {
		log.debug("saving TRole instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#delete(cn.logistics.pojo.TRole)
	 */
	public void delete(TRole persistentInstance) {
		log.debug("deleting TRole instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#findById(java.lang.Integer)
	 */
	public TRole findById(java.lang.Integer id) {
		log.debug("getting TRole instance with id: " + id);
		try {
			TRole instance = (TRole) getHibernateTemplate().get(
					"cn.logistics.pojo.TRole", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#findByExample(cn.logistics.pojo.TRole)
	 */
	public List findByExample(TRole instance) {
		log.debug("finding TRole instance by example");
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
	 * @see cn.logistics.dao.impl.ITRoleDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TRole instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TRole as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TRole instances");
		try {
			String queryString = "from TRole";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#merge(cn.logistics.pojo.TRole)
	 */
	public TRole merge(TRole detachedInstance) {
		log.debug("merging TRole instance");
		try {
			TRole result = (TRole) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#attachDirty(cn.logistics.pojo.TRole)
	 */
	public void attachDirty(TRole instance) {
		log.debug("attaching dirty TRole instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoleDAO#attachClean(cn.logistics.pojo.TRole)
	 */
	public void attachClean(TRole instance) {
		log.debug("attaching clean TRole instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITRoleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITRoleDAO) ctx.getBean("TRoleDAO");
	}
}