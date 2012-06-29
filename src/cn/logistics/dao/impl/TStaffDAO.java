package cn.logistics.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.logistics.dao.ITStaffDAO;
import cn.logistics.pojo.TStaff;

/**
 * A data access object (DAO) providing persistence and search support for
 * TStaff entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.logistics.pojo.TStaff
 * @author MyEclipse Persistence Tools
 */

public class TStaffDAO extends HibernateDaoSupport implements ITStaffDAO {
	private static final Log log = LogFactory.getLog(TStaffDAO.class);

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#save(cn.logistics.pojo.TStaff)
	 */
	public void save(TStaff transientInstance) {
		log.debug("saving TStaff instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#delete(cn.logistics.pojo.TStaff)
	 */
	public void delete(TStaff persistentInstance) {
		log.debug("deleting TStaff instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#findById(java.lang.Integer)
	 */
	public TStaff findById(java.lang.Integer id) {
		log.debug("getting TStaff instance with id: " + id);
		try {
			TStaff instance = (TStaff) getHibernateTemplate().get(
					"cn.logistics.pojo.TStaff", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#findByExample(cn.logistics.pojo.TStaff)
	 */
	public List findByExample(TStaff instance) {
		log.debug("finding TStaff instance by example");
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
	 * @see cn.logistics.dao.impl.ITStaffDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TStaff instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TStaff as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all TStaff instances");
		try {
			String queryString = "from TStaff";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#merge(cn.logistics.pojo.TStaff)
	 */
	public TStaff merge(TStaff detachedInstance) {
		log.debug("merging TStaff instance");
		try {
			TStaff result = (TStaff) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#attachDirty(cn.logistics.pojo.TStaff)
	 */
	public void attachDirty(TStaff instance) {
		log.debug("attaching dirty TStaff instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see cn.logistics.dao.impl.ITStaffDAO#attachClean(cn.logistics.pojo.TStaff)
	 */
	public void attachClean(TStaff instance) {
		log.debug("attaching clean TStaff instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ITStaffDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ITStaffDAO) ctx.getBean("TStaffDAO");
	}
}