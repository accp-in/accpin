package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.in.dao.EmailattachesDao;
import com.in.entity.Emailrecinfo;

public class EmailattachesDaoImpl extends HibernateDaoSupport implements EmailattachesDao {

	//����ʼ�������Ϣ
	@Override
	public void addEmailrecinfo(Emailrecinfo email) {
		super.getHibernateTemplate().save(email);
	}

	//�޸��ʼ�������Ϣ
	@Override
	public void updateEmailrecinfo(Emailrecinfo email) {
		super.getHibernateTemplate().update(email);
	}

	//ɾ���ʼ�������Ϣ
	@Override
	public void deleteEmailrecinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//����ID���Ҷ���
	@Override
	public Emailrecinfo findById(Integer id) {
		Emailrecinfo emailrecinfo = null;
		emailrecinfo = super.getHibernateTemplate().get(Emailrecinfo.class, id);
		return emailrecinfo;
	}

	//��ѯ��������
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Emailrecinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;	
	}

	//��ҳ��ѯ��������ô��ѯ��
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Emailrecinfo> findByList(String name, final int pageNo, final int pageSize,
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
