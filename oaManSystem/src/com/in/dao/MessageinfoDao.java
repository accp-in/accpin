package com.in.dao;

import java.util.List;
import com.in.entity.Messageinfo;


/**
 * ����Ϣ��
 * */
public interface MessageinfoDao {

	//��Ӷ���Ϣ
	public void addMessageinfo(Messageinfo message);
			
	//�޸Ķ���Ϣ
	public void updateMessageinfo(Messageinfo message);
			
	//ɾ������Ϣ
	public void deleteMessageinfo(Integer id);
			
	//����ID���Ҷ���
	public Messageinfo findById(Integer id);
			
	//��ѯ��������
	public int findAll(); 
			
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
	
	//��ҳ��ѯ��������ô��ѯ��
	public List<Messageinfo> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
				
}
