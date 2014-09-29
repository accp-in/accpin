package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.MessageinfoDao;
import com.in.entity.Messageinfo;

public class MessageinfoDaoImpl extends HibernateDaoSupport implements MessageinfoDao {

	//添加短信息
	@Override
	public void addMessageinfo(Messageinfo message) {
		super.getHibernateTemplate().save(message);
	}

	//修改短信息
	@Override
	public void updateMessageinfo(Messageinfo message) {
		super.getHibernateTemplate().update(message);
	}

	//删除短信息
	@Override
	public void deleteMessageinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Messageinfo findById(Integer id) {
		Messageinfo messageinfo = null;
		messageinfo = super.getHibernateTemplate().get(Messageinfo.class, id);
		return messageinfo;
	}

	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Messageinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Messageinfo> findByList(String name, final int pageNo, final int pageSize,
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
