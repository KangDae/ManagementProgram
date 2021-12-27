package comstudy21.saram;

import comstudy21.saram.controller.Saram_controller;
import comstudy21.saram.model.SaramVo;
import comstudy21.saram.view.SaramDelete;
import comstudy21.saram.view.SaramDetail;
import comstudy21.saram.view.SaramEdit;
import comstudy21.saram.view.SaramListView;
import comstudy21.saram.view.SaramView;
import comstudy21.saram.view.insertView;
import comstudy21.saram.view.menuView;

public class rc {
	public static int no;
	public static SaramVo saramvo;
	public static SaramVo[] saramArr;
	
	public static final int SEARACH = 0, DETAIL=1;
	public static int type = 0;

	
	public static final SaramView menuView = new menuView();
	public static final SaramView insertView = new insertView();
	public static final SaramView saramDelete = new SaramDelete();
	public static final SaramView saramDetail = new SaramDetail();
	public static final SaramView saramEdit = new SaramEdit();
	public static final SaramView saramListView = new SaramListView();

	public static final Saram_controller samramController = new Saram_controller();

}