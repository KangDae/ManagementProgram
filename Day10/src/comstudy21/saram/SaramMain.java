package comstudy21.saram;

import comstudy21.saram.model.SaramDao;
import comstudy21.saram.model.SaramVo;

public class SaramMain {
	public static SaramDao dao = new SaramDao();
	public static ViewCoantainer vc =new ViewCoantainer();
	
	
	
	public static void main(String[] args) {
		
		System.out.println("===========사람 정보 관리 프로그램============");
       rc.samramController.action();
		
	}
	
	
	
	
	
	
	
	public static void test_Delete(String[] args) {
		dao.delete(new SaramVo(1,null,null,null));
		
		test_selectAll();
	}
	
	
	
	
	
	public static void test_update(String[] args) {
		SaramVo vo= dao.selectByNo(3);
		vo.setName("hou");
		vo.setPhone("010-1234-5678");
		vo.setEmail("eownsl999@naver.com");
		dao.update(vo);
		
		SaramVo saram =  dao.selectOne(new SaramVo(0,"hou",null,null));
		System.out.println(saram);
	}
	
	
	public static void test_selectbyno(String[] args) {
		
		SaramVo saram = dao.selectByNo(1);
		System.out.println(saram);
		
	}
	
	public static void test_selectOne(String[] args) {

		SaramVo vo= new SaramVo(0,"LEE",null,null);
		SaramVo saram = dao.selectOne(vo);
		System.out.println(saram);
	}
	
	public static void test_selectAll() {
		
		 SaramVo[] saramArr = dao.selectAll();
	      for(SaramVo saram : saramArr) {
	         System.out.println(saram);
	      }

	}

}
