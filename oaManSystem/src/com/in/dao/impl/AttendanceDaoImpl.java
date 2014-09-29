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
 * 考勤表
 * */
public class AttendanceDaoImpl extends HibernateDaoSupport implements AttendanceDao {

	//添加考勤表信息
	@Override
	public void addAttendance(Attendance dance) {
		super.getHibernateTemplate().save(dance);
	}

	//修改考勤表信息
	@Override
	public void updateAttendance(Attendance dance) {
		super.getHibernateTemplate().update(dance);
	}

	//删除考勤表信息
	@Override
	public void deleteAttendance(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Attendance findById(Integer id) {
		Attendance attendance = null;
		attendance = super.getHibernateTemplate().get(Attendance.class, id);
		return attendance;
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
