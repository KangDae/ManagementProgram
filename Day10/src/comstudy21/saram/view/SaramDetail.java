package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class SaramDetail extends SaramView {

	
	@Override
	public void display() {
		if(rc.type == rc.SEARACH)
		{
		System.out.println("::::: ��� ���� �󼼺��� :::::");
		System.out.print("�˻��� �̸�>>");
		String name = scan.next();
		rc.saramvo = new SaramVo(0,name,null,null);
		}
		else {
			System.out.println(":::::��� ���� ��� ����:::::");
			System.out.println(rc.saramvo);
		}
	}

}
