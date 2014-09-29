package com.in.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.DepartmentDao;
import com.in.entity.Department;

/**
 * 部门表
 * */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	//添加部门信息
	@Override
	public void addDepartment(Department depat) {
		super.getHibernateTemplate().save(depat);
	}

	//修改部门信息
	@Override
	public void updateDepartment(Department depat) {
		super.getHibernateTemplate().update(depat);
	}

	//删除部门信息
	@Override
	public void deleteDepartment(Integer id) {
		super.getHibernateTemplate().delete(id);
	}

	//根据ID查找对象
	@Override
	public Department findById(Integer id) {
		Department department = null;
		department = super.getHibernateTemplate().get(Department.class, id);
		return department;
	}

	//查询数据行数
	@Override
	public int findAll() {
		int count = 0;
		String hql = "from Department";
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
	public List<Department> findByList(String name, final int pageNo, final int pageSize,
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
