package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITJointabledistritableDAO;
import cn.logistics.pojo.TJointabledistritable;

/**
 * A data access object (DAO) providing persistence and search support for
 * TJointabledistritable entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TJointabledistritable
 * @author MyEclipse Persistence Tools
 */

public class TJointabledistritableDAO extends HibernateDaoSupport implements ITJointabledistritableDAO {
	private static final Log log = LogFactory
			.getLog(TJointabledistritableDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#save(cn.logistics.pojo.TJointabledistritable)
	 */
	public void save(TJointabledistritable transientInstance) {
		log.debug("saving TJointabledistritable instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#delete(cn.logistics.pojo.TJointabledistritable)
	 */
	public void delete(TJointabledistritable persistentInstance) {
		log.debug("deleting TJointabledistritable instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#findById(java.lang.Integer)
	 */
	public TJointabledistritable findById(java.lang.Integer id) {
		log.debug("getting TJointabledistritable instance with id: " + id);
		try {
			TJointabledistritable instance = (TJointabledistritable) getHibernateTemplate()
					.get("cn.logistics.pojo.TJointabledistritable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#findByExample(cn.logistics.pojo.TJointabledistritable)
	 */
	public List findByExample(TJointabledistritable instance) {
		log.debug("finding TJointabledistritable instance by example");
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
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TJointabledistritable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TJointabledistritable as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TJointabledistritable instances");
		try {
			String queryString = "from TJointabledistritable";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#merge(cn.logistics.pojo.TJointabledistritable)
	 */
	public TJointabledistritable merge(TJointabledistritable detachedInstance) {
		log.debug("merging TJointabledistritable instance");
		try {
			TJointabledistritable result = (TJointabledistritable) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#attachDirty(cn.logistics.pojo.TJointabledistritable)
	 */
	public void attachDirty(TJointabledistritable instance) {
		log.debug("attaching dirty TJointabledistritable instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITJointabledistritableDAO#attachClean(cn.logistics.pojo.TJointabledistritable)
	 */
	public void attachClean(TJointabledistritable instance) {
		log.debug("attaching clean TJointabledistritable instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITJointabledistritableDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ITJointabledistritableDAO) ctx
				.getBean("TJointabledistritableDAO");
	}
}