package org.constudy21.saram.view;

import org.constudy21.model.SaramVo;
import org.constudy21.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
	
		
		
		if (R.type == R.SEARCH) {
			System.out.println("::::: ��� ���� ���� :::::");
			System.out.print("�����ϰ� ���� ��� ��ȣ �Է�>> ");
			int no = scan.nextInt();
			R.saramVo = new SaramVo(no, null, null, null);
			// controller�� �̵�
		} else {
			System.out.println("::::: ��� ���� �󼼺��� :::::");
			System.out.println(R.saramVo);
		}
	

	}		
}

