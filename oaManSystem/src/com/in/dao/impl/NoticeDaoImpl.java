package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.NoticeDao;
import com.in.entity.Notice;

public class NoticeDaoImpl extends HibernateDaoSupport implements NoticeDao {

	//添加公告信息
	@Override
	public void addNotice(Notice notice) {
		super.getHibernateTemplate().save(notice);
	}

	//修改公告信息
	@Override
	public void updateNotice(Notice notice) {
		super.getHibernateTemplate().update(notice);
	}

	//删除公告信息
	@Override
	public void deleteNotice(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Notice findById(Integer id) {
		Notice notice = null;
		notice = super.getHibernateTemplate().get(Notice.class, id);
		return notice;
	}

	@Override
	public int findAll() {
		return getHibernateTemplate().find("from Notice").size();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Notice> findByList(String name, final int pageNo, final int pageSize,
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
