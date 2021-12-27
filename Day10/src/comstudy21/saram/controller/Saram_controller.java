package comstudy21.saram.controller;

import comstudy21.saram.ViewCoantainer;
import comstudy21.saram.rc;
import comstudy21.saram.model.SaramDao;

public class Saram_controller {
	private ViewCoantainer vc = new ViewCoantainer();
	private SaramDao dao = new SaramDao();

	public void action() {
		System.out.println(">>>> SaramController 실행 ...");
		if (rc.no == 0) {
			vc.run(rc.menuView); // 동적 바인딩이 되도록 처리된다
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
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		default:
			System.out.println("해당기능이 없습니다!");
		}
		rc.no = 0;
		action();
	}

}
