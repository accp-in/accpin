package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.in.dao.PlaninfoDao;
import com.in.entity.Planinfo;

public class PlaninfoDaoImpl extends HibernateDaoSupport implements PlaninfoDao {

	//添加部门信息
	@Override
	public void addPlaninfo(Planinfo plan) {
		super.getHibernateTemplate().save(plan);
	}

	//修改部门信息
	@Override
	public void updatePlaninfo(Planinfo plan) {
		super.getHibernateTemplate().update(plan);
	}

	//删除部门信息
	@Override
	public void deletePlaninfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Planinfo findById(Integer id) {
		Planinfo planinfo = null;
		planinfo = super.getHibernateTemplate().get(Planinfo.class, id);
		return planinfo;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Planinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//分页查询（根据那么查询）
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Planinfo> findByList(String name, final int pageNo, final int pageSize,
			final String hql, final String[] paramNames, final Object[] values) {
		return super.getHibernateTemplate().executeFind(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(hql);
				if (paramNames != null && paramNames.length > 0) {
					for (int i = 0; i < paramNames.length; i++) {
						query.setParameter(paramNames[i], values[i]);
					}
				}
				query.setFirstResult((pageNo - 1) * pageSize);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
	}
}
