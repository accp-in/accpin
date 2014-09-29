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
 * 日程信息表（个人日程和办公日程,办公日程即为上司分工给下属..登录后也会根据日程开始时间和当天匹配,显示在首页提醒)
 * */
public class CalendarinfoDaoImpl extends HibernateDaoSupport implements CalendarinfoDao {

	//添加部门信息
	@Override
	public void addCalendarinfo(Calendarinfo calendar) {
		super.getHibernateTemplate().save(calendar);
	}

	//修改部门信息
	@Override
	public void updateCalendarinfo(Calendarinfo calendar) {
		super.getHibernateTemplate().update(calendar);
	}

	//删除部门信息
	@Override
	public void deleteCalendarinfo(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Calendarinfo findById(Integer id) {
		Calendarinfo calendarinfo = null;
		calendarinfo = super.getHibernateTemplate().get(Calendarinfo.class, id);
		return calendarinfo;
	}

	//查询数据行数
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

	//分页查询（根据那么查询）
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
