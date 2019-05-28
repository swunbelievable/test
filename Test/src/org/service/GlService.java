package org.service;

import java.util.List;

import org.model.Glb;

public interface GlService {
	public List findAll(int pageNow, int pageSize);		//��ʾ���й�����Ϣ
	public int findGlSize();							//��ѯһ�������������¼
	
	/* ���񣺲鿴ĳ���������ϸ��Ϣ */
	public Glb find(String glh);							//���ݹ���Ų�ѯĳ������Ϣ
	
	/* ����ɾ��ĳ������Ϣ */
	public void delete(String glh);						//���ݹ����ɾ������
	
	/* �����޸�ĳ������Ϣ */
	public void update(Glb gl);							//�޸Ĺ�����Ϣ
	
	/* ���񣺹�����Ϣ¼�� */
	public void save(Glb gl);							//�������
}
