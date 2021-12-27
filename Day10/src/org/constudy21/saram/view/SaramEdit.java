package org.constudy21.saram.view;

import org.constudy21.model.SaramVo;
import org.constudy21.saram.R;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
	
		
		
		if (R.type == R.SEARCH) {
			System.out.println("::::: 사람 정보 수정 :::::");
			System.out.print("수정하고 싶은 사람 번호 입력>> ");
			int no = scan.nextInt();
			R.saramVo = new SaramVo(no, null, null, null);
			// controller로 이동
		} else {
			System.out.println("::::: 사람 정보 상세보기 :::::");
			System.out.println(R.saramVo);
		}
	

	}		
}

