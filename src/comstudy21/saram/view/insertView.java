package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class insertView extends SaramView {
	
	@Override
	public void display() {
	System.out.println("::::: 입력 기능 :::::");
	//성명,전화번호,이메일
    //r.saramvo에 저장후 controller로 이동
	System.out.print("성명 입력>>");
	String name = scan.next();
	System.out.print("전화 입력>>");
	String Phone = scan.next();
	System.out.print("email 입력>>");
	String Email = scan.next();
	
	
	
	rc.saramvo = new SaramVo(0,name,Phone,Email);
	
	System.out.println("입력완료");
	}
	
	
	

}
