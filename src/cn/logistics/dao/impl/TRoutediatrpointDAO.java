package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITRoutediatrpointDAO;
import cn.logistics.pojo.TRoutediatrpoint;

/**
 * A data access object (DAO) providing persistence and search support for
 * TRoutediatrpoint entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TRoutediatrpoint
 * @author MyEclipse Persistence Tools
 */

public class TRoutediatrpointDAO extends HibernateDaoSupport implements ITRoutediatrpointDAO {
	private static final Log log = LogFactory.getLog(TRoutediatrpointDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#save(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public void save(TRoutediatrpoint transientInstance) {
		log.debug("saving TRoutediatrpoint instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#delete(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public void delete(TRoutediatrpoint persistentInstance) {
		log.debug("deleting TRoutediatrpoint instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#findById(java.lang.Integer)
	 */
	public TRoutediatrpoint findById(java.lang.Integer id) {
		log.debug("getting TRoutediatrpoint instance with id: " + id);
		try {
			TRoutediatrpoint instance = (TRoutediatrpoint) getHibernateTemplate()
					.get("cn.logistics.pojo.TRoutediatrpoint", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#findByExample(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public List findByExample(TRoutediatrpoint instance) {
		log.debug("finding TRoutediatrpoint instance by example");
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
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TRoutediatrpoint instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TRoutediatrpoint as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TRoutediatrpoint instances");
		try {
			String queryString = "from TRoutediatrpoint";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#merge(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public TRoutediatrpoint merge(TRoutediatrpoint detachedInstance) {
		log.debug("merging TRoutediatrpoint instance");
		try {
			TRoutediatrpoint result = (TRoutediatrpoint) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#attachDirty(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public void attachDirty(TRoutediatrpoint instance) {
		log.debug("attaching dirty TRoutediatrpoint instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITRoutediatrpointDAO#attachClean(cn.logistics.pojo.TRoutediatrpoint)
	 */
	public void attachClean(TRoutediatrpoint instance) {
		log.debug("attaching clean TRoutediatrpoint instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITRoutediatrpointDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITRoutediatrpointDAO) ctx.getBean("TRoutediatrpointDAO");
	}
}