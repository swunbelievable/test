package org.dao;
import java.util.*;
import org.model.*;
public interface JsDao {
	/* ��������ʦ��Ϣ��ѯ */
	public List findAll(int pageNow, int pageSize);		//��ʾ���н�ʦ��Ϣ
	public int findJsSize();							//��ѯһ����������ʦ��¼
	
	/* �������鿴ĳ����ʦ����ϸ��Ϣ */
	public Jsb find(String jsh);							//��ʦ�Ų�ѯĳ��ʦ��Ϣ
	
	/* ������ɾ��ĳ��ʦ��Ϣ */
	public void delete(String jsh);						//���ݽ�ʦ��ɾ����ʦ
	
	/* �������޸�ĳ��ʦ��Ϣ */
	public void update(Jsb js);							//�޸Ľ�ʦ��Ϣ
	
	/* ��������ʦ��Ϣ¼�� */
	public void save(Jsb js);							//�����ʦ
}