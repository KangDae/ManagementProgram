package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class SaramListView extends SaramView {
	
	@Override
	public void display() {
		System.out.println(":::::��� ���:::::");
	    for(SaramVo saram: rc.saramArr) {
	    	System.out.println(saram);
	    }
	}

}
