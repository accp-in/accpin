package com.in.service;

import java.util.List;
import java.util.Map;

import com.in.entity.Addresslist;


/**
 * ͨѶ¼��(��Ա����������Դ������ȡ�û���Ϣ,ֻ�ܸ��˲鿴���˺͹���Ա�鿴ȫ��)
 * */
public interface AddresslistService {
	
	//���ͨѶ¼��Ϣ
	public void addAddresslist(Addresslist address);
		
	//�޸�ͨѶ¼��Ϣ
	public void updateAddresslist(Addresslist address);
		
	//ɾ��ͨѶ¼��Ϣ
	public void deleteAddresslist(Integer id);
		
	//����ID���Ҷ���
	public Addresslist findById(Integer id);
		
	//Map
	public Map<String, Object> allByPage(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
	//��ҳ��ѯ��������ô��ѯ��
	public List<Addresslist> findByList(String name,int pageNo, int pageSize,String hql,String[] paramNames,Object[] values);
		
}
