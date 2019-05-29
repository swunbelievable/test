package org.action;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServletResponse;
import org.model.*;
import org.service.*;
import com.opensymphony.xwork2.*;
public class DlAction extends ActionSupport{
	private Dlb dl;
//	private String type="11111";
	private Xsb xs;
	protected DlService dlService;
	protected XsService xsService;
	protected JsService jsService;
	protected GlService glService;
	//�����û������ execute ����
	public String execute() throws Exception{
		boolean validated=false;				//��֤�ɹ���ʶ
		Map session=ActionContext.getContext().getSession();		//��ûỰ�����������浱ǰ��¼�û�����Ϣ
		Dlb dl1=null;
		//�Ȼ�� Dlb ��������ǵ�һ�η��ʸ�ҳ���û�����϶�Ϊ�գ�������ǵڶ��������ǵ����Σ���ֱ�ӵ�¼��ҳ�������ٴ��ظ���֤���û�����Ϣ
		dl1=(Dlb)session.get("dl");
//		if(dl1!=null){
//			return "studentL";
//		}
		//����û��ǵ�һ�ν��룬�Ự����δ�洢 dl1 �־û����󣬹�Ϊ null
		System.out.println(dl.getType());
		if(dl.getType().equals("ѧ��")){
			System.out.println("1111");
			if(xsService.find(dl.getXh())!=null){
				dl1=dlService.find(dl.getXh(), dl.getKl());
				if(dl1!=null){
					session.put("dl", dl1);			//�� dl1 ����洢�ڻỰ��
					Xsb xs1=xsService.find(dl.getXh());
//					Map request=(Map)ActionContext.getContext().get("request");
//					request.put("xs",xs1);
					session.put("xs", xs1);
					return "studentL";
	    		}
			}
		}else{
			
			
			if(dl.getType().equals("����Ա")){
				System.out.println("�����¼");
				if(glService.find(dl.getXh())!=null){
					System.out.println("���ڴ˹����");
					dl1=dlService.find(dl.getXh(), dl.getKl());
					if(dl1!=null){
							session.put("dl", dl1);			//�� dl1 ����洢�ڻỰ��
							return "mamagerL";
			    	}
				}
			}else{
				if(dl.getType().equals("��ʦ")){
					System.out.println("222");
					if(jsService.find(dl.getXh(), dl.getType())!=null){
							dl1=dlService.find(dl.getXh(), dl.getKl());
							if(dl1!=null){
								session.put("dl", dl1);			//�� dl1 ����洢�ڻỰ��
								Jsb js1=jsService.find(dl.getXh());
								session.put("js", js1);
								return "teacherL";
				    		}
					}
				}
					else{
						if(dl.getType().equals("����")){
							System.out.println("222");
							if(jsService.find(dl.getXh(), dl.getType())!=null){
								System.out.println("111");
									dl1=dlService.find(dl.getXh(), dl.getKl());
									if(dl1!=null){
										System.out.println("333");
										session.put("dl", dl1);			//�� dl1 ����洢�ڻỰ��
										return "eduationalAL";
						    		}
								} 
						}
					}
				}
				
			}
		return ERROR;
//		if(dl1==null){
//			dl1=dlService.find(dl.getXh(), dl.getKl());
//			if(dl1!=null){
//				session.put("dl", dl1);			//�� dl1 ����洢�ڻỰ��
//				validated=true;					//��ʶΪ true ��ʾ��֤�ɹ�ͨ��
//    		}
//		}
//        else{
//        	validated=true;						//���û���֮ǰ�ѵ�¼�����ɹ���֤���ʱ�ʶΪ true ��ʾ����������
//        }
//        if(validated){
//        	//��֤�ɹ������ַ��� "success"
//        	return SUCCESS;
//        }
//        else{
//            //��֤ʧ�ܷ����ַ��� "error"
//        	return ERROR;
//        }
	}
	
	public Dlb getDl(){
		return dl;
	}
	public void setDl(Dlb dl){
		this.dl = dl;
	}
	
	public DlService getDlService(){
		return dlService;
	}
	public void setDlService(DlService dlService){
		this.dlService = dlService;
	}

	public Xsb getXs() {
		return xs;
	}

	public void setXs(Xsb xs) {
		this.xs = xs;
	}

	public XsService getXsService() {
		return xsService;
	}

	public void setXsService(XsService xsService) {
		this.xsService = xsService;
	}

	public JsService getJsService() {
		return jsService;
	}

	public void setJsService(JsService jsService) {
		this.jsService = jsService;
	}

	public GlService getGlService() {
		return glService;
	}

	public void setGlService(GlService glService) {
		this.glService = glService;
	}

//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
	
}
