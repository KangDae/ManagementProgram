package comstudy21.saram.controller;

import comstudy21.saram.ViewCoantainer;
import comstudy21.saram.rc;
import comstudy21.saram.model.SaramDao;

public class Saram_controller {
	private ViewCoantainer vc = new ViewCoantainer();
	private SaramDao dao = new SaramDao();

	public void action() {
		System.out.println(">>>> SaramController ���� ...");
		if (rc.no == 0) {
			vc.run(rc.menuView); // ���� ���ε��� �ǵ��� ó���ȴ�
		}

		switch (rc.no) {
		case 1:
			vc.run(rc.insertView);
			dao.insert(rc.saramvo);
			break;
		case 2:
	        rc.saramArr = dao.selectAll();			
			vc.run(rc.saramListView);
			break;
		case 3:
			rc.type = rc.SEARACH;
			vc.run(rc.saramDetail);
			rc.type = rc.DETAIL;
			rc.saramvo =dao.selectOne(rc.saramvo);
			vc.run(rc.saramDetail);
			break;
		case 4:
			rc.type = rc.SEARACH;
			vc.run(rc.saramDetail);
			rc.type = rc.DETAIL;
			rc.saramvo = dao.selectOne(rc.saramvo);
			dao.update(rc.saramvo);	
			vc.run(rc.saramEdit);
			break;
		case 5:
			rc.type = rc.SEARACH;
			vc.run(rc.saramDetail);
			rc.type = rc.DETAIL;		
			rc.saramvo =dao.selectOne(rc.saramvo);
			dao.delete(rc.saramvo);
			vc.run(rc.saramDelete);
			break;
		case 6:
			System.out.println("���α׷� ����");
			System.exit(0);
			break;
		default:
			System.out.println("�ش����� �����ϴ�!");
		}
		rc.no = 0;
		action();
	}

}
