package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class insertView extends SaramView {
	
	@Override
	public void display() {
	System.out.println("::::: �Է� ��� :::::");
	//����,��ȭ��ȣ,�̸���
    //r.saramvo�� ������ controller�� �̵�
	System.out.print("���� �Է�>>");
	String name = scan.next();
	System.out.print("��ȭ �Է�>>");
	String Phone = scan.next();
	System.out.print("email �Է�>>");
	String Email = scan.next();
	
	
	
	rc.saramvo = new SaramVo(0,name,Phone,Email);
	
	System.out.println("�Է¿Ϸ�");
	}
	
	
	

}
