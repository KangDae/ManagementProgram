package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class SaramDetail extends SaramView {

	
	@Override
	public void display() {
		if(rc.type == rc.SEARACH)
		{
		System.out.println("::::: 사람 정보 상세보기 :::::");
		System.out.print("검색할 이름>>");
		String name = scan.next();
		rc.saramvo = new SaramVo(0,name,null,null);
		}
		else {
			System.out.println(":::::사람 정보 상게 보기:::::");
			System.out.println(rc.saramvo);
		}
	}

}
