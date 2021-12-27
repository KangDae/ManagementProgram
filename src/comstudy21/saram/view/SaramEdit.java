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
			System.out.println("::::: 사람 정보 상세보기 :::::");
			System.out.print("수정할 이름>>");
			String name = scan.next();
			rc.saramvo = new SaramVo(0, name, null, null);
			whilecontrol = true;
		} else {
			System.out.println(":::::수정할 사람 정보 보기:::::");
			System.out.println(rc.saramvo);

			while (whilecontrol) {
				System.out.println("무엇을 수정하시겠습니까?");
				System.out.println("1.성명 2.번호 3.email 4.모든정보 5.돌아가기");

				int selectnum = scan.nextInt();

				switch (selectnum) {
				case 1:
					System.out.print("성명 입력>>");
					updatename = scan.next();
					rc.saramvo.setName(updatename);
					break;

				case 2:
					System.out.print("전화 입력>>");
					Phone = scan.next();
					rc.saramvo.setPhone(Phone);
					break;

				case 3:
					System.out.print("email 입력>>");
					Email = scan.next();
					rc.saramvo.setEmail(Email);
					break;

				case 4:
					System.out.print("성명 입력>>");
					updatename = scan.next();
					rc.saramvo.setName(updatename);
					
					System.out.print("전화 입력>>");
					Phone = scan.next();
					rc.saramvo.setPhone(Phone);
					
					System.out.print("email 입력>>");
					Email = scan.next();
					rc.saramvo.setEmail(Email);
					
					break;

				case 5:
					whilecontrol = false;
					break;

				default:
					System.out.println("잘못입력하셨습니다.");
				}
			}

		}

	}

}
