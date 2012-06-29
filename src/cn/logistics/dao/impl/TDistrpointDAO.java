package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITDistrpointDAO;
import cn.logistics.pojo.TDistrpoint;

/**
 * A data access object (DAO) providing persistence and search support for
 * TDistrpoint entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TDistrpoint
 * @author MyEclipse Persistence Tools
 */

public class TDistrpointDAO extends HibernateDaoSupport implements ITDistrpointDAO {
	private static final Log log = LogFactory.getLog(TDistrpointDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#save(cn.logistics.pojo.TDistrpoint)
	 */
	public void save(TDistrpoint transientInstance) {
		log.debug("saving TDistrpoint instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#delete(cn.logistics.pojo.TDistrpoint)
	 */
	public void delete(TDistrpoint persistentInstance) {
		log.debug("deleting TDistrpoint instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#findById(java.lang.Integer)
	 */
	public TDistrpoint findById(java.lang.Integer id) {
		log.debug("getting TDistrpoint instance with id: " + id);
		try {
			TDistrpoint instance = (TDistrpoint) getHibernateTemplate().get(
					"cn.logistics.pojo.TDistrpoint", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#findByExample(cn.logistics.pojo.TDistrpoint)
	 */
	public List findByExample(TDistrpoint instance) {
		log.debug("finding TDistrpoint instance by example");
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
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TDistrpoint instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TDistrpoint as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TDistrpoint instances");
		try {
			String queryString = "from TDistrpoint";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#merge(cn.logistics.pojo.TDistrpoint)
	 */
	public TDistrpoint merge(TDistrpoint detachedInstance) {
		log.debug("merging TDistrpoint instance");
		try {
			TDistrpoint result = (TDistrpoint) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#attachDirty(cn.logistics.pojo.TDistrpoint)
	 */
	public void attachDirty(TDistrpoint instance) {
		log.debug("attaching dirty TDistrpoint instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITDistrpointDAO#attachClean(cn.logistics.pojo.TDistrpoint)
	 */
	public void attachClean(TDistrpoint instance) {
		log.debug("attaching clean TDistrpoint instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITDistrpointDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITDistrpointDAO) ctx.getBean("TDistrpointDAO");
	}
}