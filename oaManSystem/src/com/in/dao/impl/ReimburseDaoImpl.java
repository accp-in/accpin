package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.in.dao.ReimburseDao;
import com.in.entity.Reimburse;

public class ReimburseDaoImpl extends HibernateDaoSupport implements ReimburseDao  {

	//添加报销表信息
	@Override
	public void addReimburse(Reimburse reimburse) {
		super.getHibernateTemplate().save(reimburse);
	}

	//修改报销表信息
	@Override
	public void updateReimburse(Reimburse reimburse) {
		super.getHibernateTemplate().update(reimburse);
	}

	//删除报销表信息
	@Override
	public void deleteReimburse(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@SuppressWarnings("unchecked")
	@Override
	public Reimburse findById(Integer id) {
		Reimburse reimburse = null;
		List<Reimburse> list = null;
		String hql = "from Reimburse r where r.reiId=?";
		list = super.getHibernateTemplate().find(hql, new Object[] { id });
		if(list.size() != 0){
			reimburse = list.get(0);
		}
		return reimburse;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from ReimburseDao";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//分页查询（根据那么查询）
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Reimburse> findByList(String name, final int pageNo, final int pageSize,
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
