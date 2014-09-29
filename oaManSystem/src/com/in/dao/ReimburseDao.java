package com.in.dao;

import java.util.List;
import com.in.entity.Reimburse;

/**
 * ������
 * */
public interface ReimburseDao {

	//��ӱ�������Ϣ
	public void addReimburse(Reimburse reimburse);
						
	//�޸ı�������Ϣ
	public void updateReimburse(Reimburse reimburse);
						
	//ɾ����������Ϣ
	public void deleteReimburse(Integer id);
					
	//����ID���Ҷ���
	public Reimburse findById(Integer id);
						
	//��ѯ��������
	public int findAll(); 
						
	//Map
	//public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
						
	//��ҳ��ѯ��������ô��ѯ��
	public List<Reimburse> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
						
}
