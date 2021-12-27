package comstudy21.saram.view;

import java.util.Scanner;
import comstudy21.saram.rc;


public class SaramView {
	public static  Scanner scan = new Scanner(System.in);
	
	public void display()
	{
		if(rc.type == rc.SEARACH) {
		System.out.println(":::::사람 정보검색:::::");	
		
		}
		else {
			System.out.println(":::::::: 사람 정보 상세보기:::::::");
		}
	}

}
