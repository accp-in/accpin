package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.in.dao.DutyDao;
import com.in.entity.Duty;

/**
 * 职务表
 * */
public class DutyDaoImpl extends HibernateDaoSupport implements DutyDao {

	//添加职务信息
	@Override
	public void addDuty(Duty duty) {
		super.getHibernateTemplate().save(duty);
	}

	//修改职务信息
	@Override
	public void updateDuty(Duty duty) {
		super.getHibernateTemplate().update(duty);
	}

	//删除职务信息
	@Override
	public void deleteDuty(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Duty findById(Integer id) {
		Duty duty = null;
		duty = super.getHibernateTemplate().get(Duty.class, id);
		return duty;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Duty";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//分页查询（根据那么查询）
	@Override
	public Map<String, Object> allByPage(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Duty> findByList(String name, final int pageNo, final int pageSize,
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
