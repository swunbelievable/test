package org.dao;

import java.util.*;
import org.model.*;
public interface GlDao {
	/* ������������Ϣ��ѯ */
	public List findAll(int pageNow, int pageSize);		//��ʾ���й�����Ϣ
	public int findGlSize();							//��ѯһ�������������¼
	
	/* �������鿴ĳ���������ϸ��Ϣ */
	public Glb find(String glh);							//���ݹ���Ų�ѯĳ������Ϣ
	
	/* ������ɾ��ĳ������Ϣ */
	public void delete(String glh);						//���ݹ����ɾ������
	
	/* �������޸�ĳ������Ϣ */
	public void update(Glb gl);							//�޸Ĺ���Ա��Ϣ
	
	/* ������������Ϣ¼�� */
	public void save(Glb gl);							//�������
}
