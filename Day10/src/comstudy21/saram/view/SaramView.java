package comstudy21.saram.view;

import java.util.Scanner;
import comstudy21.saram.rc;


public class SaramView {
	public static  Scanner scan = new Scanner(System.in);
	
	public void display()
	{
		if(rc.type == rc.SEARACH) {
		System.out.println(":::::��� �����˻�:::::");	
		
		}
		else {
			System.out.println(":::::::: ��� ���� �󼼺���:::::::");
		}
	}

}
