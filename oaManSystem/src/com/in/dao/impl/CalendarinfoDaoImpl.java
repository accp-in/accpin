package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.CalendarinfoDao;
import com.in.entity.Calendarinfo;

/**
 * �ճ���Ϣ�������ճ̺Ͱ칫�ճ�,�칫�ճ̼�Ϊ��˾�ֹ�������..��¼��Ҳ������ճ̿�ʼʱ��͵���ƥ��,��ʾ����ҳ����)
 * */
public class CalendarinfoDaoImpl extends HibernateDaoSupport implements CalendarinfoDao {

	//��Ӳ�����Ϣ
	@Override
	public void addCalendarinfo(Calendarinfo calendar) {
		super.getHibernateTemplate().save(calendar);
	}

	//�޸Ĳ�����Ϣ
	@Override
	public void updateCalendarinfo(Calendarinfo calendar) {
		super.getHibernateTemplate().update(calendar);
	}

	//ɾ��������Ϣ
	@Override
	public void deleteCalendarinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//����ID���Ҷ���
	@Override
	public Calendarinfo findById(Integer id) {
		Calendarinfo calendarinfo = null;
		calendarinfo = super.getHibernateTemplate().get(Calendarinfo.class, id);
		return calendarinfo;
	}

	//��ѯ��������
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Calendarinfo";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	@Override
	public Map<String, Object> allByPage(String name, int pageNo, int pageSize,
			String hql, String[] paramNames, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	//��ҳ��ѯ��������ô��ѯ��
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Calendarinfo> findByList(String name, final int pageNo, final int pageSize,
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
