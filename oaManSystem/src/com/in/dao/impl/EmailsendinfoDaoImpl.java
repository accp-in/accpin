package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.EmailsendinfoDao;
import com.in.entity.Emailsendinfo;

/**
 * 邮件发送信息表
 * */
public class EmailsendinfoDaoImpl extends HibernateDaoSupport implements EmailsendinfoDao {

	//添加邮件信息
	@Override
	public void addEmailsendinfo(Emailsendinfo emailSend) {
		super.getHibernateTemplate().save(emailSend);
	}

	//修改邮件信息
	@Override
	public void updateEmailsendinfo(Emailsendinfo emailSend) {
		super.getHibernateTemplate().update(emailSend);
	}

	//删除邮件信息
	@Override
	public void deleteEmailsendinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Emailsendinfo findById(Integer id) {
		Emailsendinfo emailsendinfo = null;
		emailsendinfo = super.getHibernateTemplate().get(Emailsendinfo.class, id);
		return emailsendinfo;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Emailsendinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//分页查询（根据那么查询）
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Emailsendinfo> findByList(String name, final int pageNo, final int pageSize,
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
