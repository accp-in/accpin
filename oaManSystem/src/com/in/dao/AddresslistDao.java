package com.in.dao;

import java.util.List;
import java.util.Map;

import com.in.entity.Addresslist;


/**
 * ͨѶ¼��(��Ա����������Դ������ȡ�û���Ϣ,ֻ�ܸ��˲鿴���˺͹���Ա�鿴ȫ��)
 * */
public interface AddresslistDao {
	
	//���ͨѶ¼��Ϣ
	public void addAddresslist(Addresslist address);
		
	//�޸�ͨѶ¼��Ϣ
	public void updateAddresslist(Addresslist address);
		
	//ɾ��ͨѶ¼��Ϣ
	public void deleteAddresslist(Integer id);
		
	//����ID���Ҷ���
	public Addresslist findById(Integer id);
		
	//��ѯ��������
	public int findAll(String title); 
		
	//��ҳ��ѯ��������ô��ѯ��
	public List<Addresslist> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
}
