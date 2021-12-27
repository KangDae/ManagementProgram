package comstudy21.saram.view;

import comstudy21.saram.rc;
import comstudy21.saram.model.SaramVo;

public class SaramEdit extends SaramView {
	@Override
	public void display() {
		String Email = "";
		String Phone = "";
		String updatename = "";
		boolean whilecontrol = true;

		if (rc.type == rc.SEARACH) {
			System.out.println("::::: ��� ���� �󼼺��� :::::");
			System.out.print("������ �̸�>>");
			String name = scan.next();
			rc.saramvo = new SaramVo(0, name, null, null);
			whilecontrol = true;
		} else {
			System.out.println(":::::������ ��� ���� ����:::::");
			System.out.println(rc.saramvo);

			while (whilecontrol) {
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				System.out.println("1.���� 2.��ȣ 3.email 4.������� 5.���ư���");

				int selectnum = scan.nextInt();

				switch (selectnum) {
				case 1:
					System.out.print("���� �Է�>>");
					updatename = scan.next();
					rc.saramvo.setName(updatename);
					break;

				case 2:
					System.out.print("��ȭ �Է�>>");
					Phone = scan.next();
					rc.saramvo.setPhone(Phone);
					break;

				case 3:
					System.out.print("email �Է�>>");
					Email = scan.next();
					rc.saramvo.setEmail(Email);
					break;

				case 4:
					System.out.print("���� �Է�>>");
					updatename = scan.next();
					rc.saramvo.setName(updatename);
					
					System.out.print("��ȭ �Է�>>");
					Phone = scan.next();
					rc.saramvo.setPhone(Phone);
					
					System.out.print("email �Է�>>");
					Email = scan.next();
					rc.saramvo.setEmail(Email);
					
					break;

				case 5:
					whilecontrol = false;
					break;

				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
			}

		}

	}

}
