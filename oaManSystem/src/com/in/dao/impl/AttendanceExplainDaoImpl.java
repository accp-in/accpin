package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.AttendanceExplainDao;
import com.in.entity.AttendanceExplain;

/**
 * 未考勤解释说明表
 * */
public class AttendanceExplainDaoImpl extends HibernateDaoSupport  implements AttendanceExplainDao {

	//添加考勤表信息
	@Override
	public void addAttendanceExplain(AttendanceExplain attendance) {
		super.getHibernateTemplate().save(attendance);
	}

	//修改考勤表信息
	@Override
	public void updateAttendanceExplain(AttendanceExplain attendance) {
		super.getHibernateTemplate().update(attendance);
	}

	//删除考勤表信息
	@Override
	public void deleteAttendanceExplain(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public AttendanceExplain findById(Integer id) {
		AttendanceExplain explain = null;
		explain = super.getHibernateTemplate().get(AttendanceExplain.class, id);
		return explain;
	}

	//根据ID查找对象
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
	public List<AttendanceExplain> findByList(String name, final int pageNo, final int pageSize,
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
