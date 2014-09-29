package com.in.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.in.dao.AddresslistDao;
import com.in.entity.Addresslist;


public class AddresslistDaoImpl extends HibernateDaoSupport implements AddresslistDao  {

	@Override
	public void addAddresslist(Addresslist address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAddresslist(Addresslist address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAddresslist(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Addresslist findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAll(String title) {
		String hql = "";
		if(title != null){
			hql = "from Addresslist where addDuty like '%"+title+"%'";
		}else{
			hql="from Addresslist";
		}
		return super.getHibernateTemplate().find(hql).size();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Addresslist> findByList(String name, final int pageNo, final int pageSize,
			final String hql, final String[] paramNames, final Object[] values) {
		return super.getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				System.out.println(hql);
				System.out.println(paramNames);
				Query query = session.createQuery(hql);
				if(paramNames != null && paramNames.length > 0){
					for(int i = 0;i<paramNames.length;i++){
						query.setParameter(paramNames[i], values[i]);
					}
				}
				query.setFirstResult((pageNo-1)*pageSize);
				query.setMaxResults(pageSize);
				return query.list();
				
			}
		});
		
	}

}
