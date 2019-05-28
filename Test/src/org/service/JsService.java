package org.service;

import java.util.List;

import org.model.Jsb;

public interface JsService {
	public List findAll(int pageNow, int pageSize);		//��ʾ���н�ʦ��Ϣ
	public int findJsSize();							//��ѯһ����������ʦ��¼
	
	/* ���񣺲鿴ĳ����ʦ����ϸ��Ϣ */
	public Jsb find(String jsh);							//���ݽ�ʦ�Ų�ѯĳ��ʦ��Ϣ
	
	/* ����ɾ��ĳ��ʦ��Ϣ */
	public void delete(String jsh);						//���ݽ�ʦ��ɾ��ѧ��
	
	/* �����޸�ĳ��ʦ��Ϣ */
	public void update(Jsb js);							//�޸Ľ�ʦ��Ϣ
	
	/* ���񣺽�ʦ��Ϣ¼�� */
	public void save(Jsb js);							//�����ʦ
}
