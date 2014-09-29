package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.in.dao.AttendanceDao;
import com.in.entity.Attendance;

/**
 * ���ڱ�
 * */
public class AttendanceDaoImpl extends HibernateDaoSupport implements AttendanceDao {

	//��ӿ��ڱ���Ϣ
	@Override
	public void addAttendance(Attendance dance) {
		super.getHibernateTemplate().save(dance);
	}

	//�޸Ŀ��ڱ���Ϣ
	@Override
	public void updateAttendance(Attendance dance) {
		super.getHibernateTemplate().update(dance);
	}

	//ɾ�����ڱ���Ϣ
	@Override
	public void deleteAttendance(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//����ID���Ҷ���
	@Override
	public Attendance findById(Integer id) {
		Attendance attendance = null;
		attendance = super.getHibernateTemplate().get(Attendance.class, id);
		return attendance;
	}

	//��ѯ��������
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Leave";
		count = super.getHibernateTemplate().find(hql).size();
		return count;
	}

	//��ҳ��ѯ��������ô��ѯ��
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Attendance> findByList(String name, final int pageNo, final int pageSize,
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
