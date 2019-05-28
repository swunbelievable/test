package org.action;
import java.util.*;
import java.io.*;
import org.model.*;
import org.service.*;
import org.tool.*;
import com.opensymphony.xwork2.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.*;
public class KcAction extends ActionSupport{
	private int pageNow = 1;
	private int pageSize = 8;
	private Kcb kc;
	private KcService kcService;
	/* Action ģ�飺�޸�ĳѧ����Ϣ */
	private List list;						//���רҵ����	
	/* Action ģ�飺ѧ����Ϣ��ѯ */
	public String execute() throws Exception{
		List list=kcService.findAll(pageNow,pageSize);
		Map request=(Map)ActionContext.getContext().get("request");
		Pager page=new Pager(getPageNow(),kcService.findKcSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	
	/* Action ģ�飺�鿴ĳ��ѧ������ϸ��Ϣ */
	public String findKc() throws Exception{
		String kch=kc.getKch();
		Kcb course=kcService.find(kch);
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("kc", course);
		return SUCCESS;
	}
//	public String getImage() throws Exception{
//		HttpServletResponse response=ServletActionContext.getResponse();
//		String kch=kc.getKch();
//		Kcb course=kcService.find(kch);
////		byte[] img=.getZp();
////		response.setContentType("image/jpeg");
////		ServletOutputStream os=response.getOutputStream();
////		if(img!=null&&img.length!=0){
////			for(int i=0; i<img.length; i++){
////				os.write(img[i]);
////			}
////			os.flush();
////		}
//		return NONE;
//	}
	
	/* Action ģ�飺ɾ��ĳѧ����Ϣ */
	public String deleteKc() throws Exception{
		String kch=kc.getKch();
		kcService.delete(kch);
		return SUCCESS;
	}
	
	/* Action ģ�飺�޸�ĳѧ����Ϣ */
	public String updateKcView() throws Exception{					//��ʾ�޸�ҳ��
		String kch=kc.getKch();
		Kcb kcInfo=kcService.find(kch);
//		List zys=zyService.getAll();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("kcInfo", kcInfo);
//		request.put("zys", zys);
		return SUCCESS;
	}
	public String updateKc() throws Exception{						//ִ���޸Ĳ���
		Kcb kc1=kcService.find(kc.getKch());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXf(kc.getXf());
		kc1.setXs(kc.getXs());
		
//		xs1.setXm(xs.getXm());
//		xs1.setXb(xs.getXb());
//		xs1.setZyb(zyService.getOneZy(xs.getZyb().getId()));
//		xs1.setCssj(xs.getCssj());
//		xs1.setZxf(xs.getZxf());
//		xs1.setBz(xs.getBz());
//		if(this.getZpFile()!=null){
//			FileInputStream fis=new FileInputStream(this.getZpFile());
//			byte[] buffer=new byte[fis.available()];
//			fis.read(buffer);
//			xs1.setZp(buffer);
//		}
		Map request=(Map)ActionContext.getContext().get("request");
		kcService.update(kc1);
		return SUCCESS;
	}
	
	/* Action ģ�飺ѧ����Ϣ¼�� */
	public String addKcView() throws Exception{						//��ʾ¼��ҳ��
		return SUCCESS;
	}
	public String addKc() throws Exception{							//ִ��¼�����
		Kcb course=new Kcb();
		String kch=kc.getKch();
		//�γ̺��Ѵ��ڣ������ظ�¼��
		if(kcService.find(kch)!=null){
			return ERROR;
		}
		course.setKch(kc.getKch());
		course.setKcm(kc.getKcm());
		course.setKxxq(kc.getKxxq());
		course.setXf(kc.getXf());
		course.setXs(kc.getXs());
		
		
		
//		stu.setXh(xs.getXh());
//		stu.setXm(xs.getXm());
//		stu.setXb(xs.getXb());
//		stu.setCssj(xs.getCssj());
//		stu.setZxf(xs.getZxf());
//		stu.setBz(xs.getBz());
//		stu.setZyb(zyService.getOneZy(xs.getZyb().getId()));
//		if(this.getZpFile()!=null){
//			FileInputStream fis=new FileInputStream(this.getZpFile());
//			byte[] buffer=new byte[fis.available()];
//			fis.read(buffer);
//			stu.setZp(buffer);
//		}
		kcService.save(course);
		return SUCCESS;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Kcb getKc() {
		return kc;
	}

	public void setKc(Kcb kc) {
		this.kc = kc;
	}

	public KcService getKcService() {
		return kcService;
	}

	public void setKcService(KcService kcService) {
		this.kcService = kcService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
