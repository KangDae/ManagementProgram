package comstudy21.saram.view;

import comstudy21.saram.rc;

public class menuView extends SaramView {

	 int no;
	@Override
	public void display() {
		System.out.println(":::::메뉴:::::");
		

		while (true) {
			try {
				System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
				System.out.print("선택:");
				no = scan.nextInt();

				while (no > 6 || no < 1) {
					System.out.println("범위를 넘었습니다.");
					System.out.println("선택:");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
				continue;
			}
		}
		//no가 정상적으로 입력된다
		//rc의 no에 바인딩 한다.
		rc.no = no;
	}

}
