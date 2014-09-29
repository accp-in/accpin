package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.LeaveDao;
import com.in.entity.Leave;

public class LeaveDaoImpl extends HibernateDaoSupport implements LeaveDao {

	//添加请假信息
	@Override
	public void addLeave(Leave levave) {
		super.getHibernateTemplate().save(levave);
	}

	//修改请假信息
	@Override
	public void updateLeave(Leave levave) {
		super.getHibernateTemplate().update(levave);
	}

	//删除请假信息
	@Override
	public void deleteLeave(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Leave findById(Integer id) {
		Leave leave = null;
		leave = super.getHibernateTemplate().get(Leave.class, id);
		return leave;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Leave";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//分页查询（根据那么查询）
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Leave> findByList(String name, final int pageNo, final int pageSize,
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
