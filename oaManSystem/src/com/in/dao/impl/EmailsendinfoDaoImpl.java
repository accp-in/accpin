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
 * �ʼ�������Ϣ��
 * */
public class EmailsendinfoDaoImpl extends HibernateDaoSupport implements EmailsendinfoDao {

	//����ʼ���Ϣ
	@Override
	public void addEmailsendinfo(Emailsendinfo emailSend) {
		super.getHibernateTemplate().save(emailSend);
	}

	//�޸��ʼ���Ϣ
	@Override
	public void updateEmailsendinfo(Emailsendinfo emailSend) {
		super.getHibernateTemplate().update(emailSend);
	}

	//ɾ���ʼ���Ϣ
	@Override
	public void deleteEmailsendinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//����ID���Ҷ���
	@Override
	public Emailsendinfo findById(Integer id) {
		Emailsendinfo emailsendinfo = null;
		emailsendinfo = super.getHibernateTemplate().get(Emailsendinfo.class, id);
		return emailsendinfo;
	}

	//��ѯ��������
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Emailsendinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//��ҳ��ѯ��������ô��ѯ��
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
