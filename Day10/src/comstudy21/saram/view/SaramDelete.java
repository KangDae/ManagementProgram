package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class SaramDelete extends SaramView {

	@Override
	public void display() {
		System.out.println(":::::��� ���� ����::::::");
		if (rc.type == rc.SEARACH) {

			System.out.print("������ �̸�>>");
			String name = scan.next();
			rc.saramvo = new SaramVo(0, name, null, null);
		}
	}

}
