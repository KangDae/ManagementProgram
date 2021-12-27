package comstudy21.saram.model;

public class SaramDao {

	// ���� Ŀ�ø�
	// ���յ� ���߰� ������ ������
	// SOLID 5��Ģ
	// �ӽ÷� �迭�� �����ϵ��� ������ �� DB���� or FileIO�� ó��
	private static final int MAX = 100;
	private static final SaramVo[] saramArr = new SaramVo[MAX];
	private static int top = 0;
	private static int sequenceNo = 1;
	static {
		saramArr[top++] = new SaramVo(sequenceNo++, "Kim", "010-1111-1111", "eownsl111@gmail.com");
		saramArr[top++] = new SaramVo(sequenceNo++, "LEE", "010-1111-1111", "eownsl112@gmail.com");
		saramArr[top++] = new SaramVo(sequenceNo++, "HOO", "010-1111-1111", "eownsl113@gmail.com");
	}

	// ��ü ���
	public SaramVo[] selectAll() {
		// saramArr�� ���� ����
		SaramVo[] newArr = new SaramVo[top];
		for (int i = 0; i < newArr.length; i++) {
			// ���θ��簴ü�� ���� �÷����
			SaramVo newSaram = new SaramVo();
			newSaram.setNo(saramArr[i].getNo());
			newSaram.setName(saramArr[i].getName());
			newSaram.setPhone(saramArr[i].getPhone());
			newSaram.setEmail(saramArr[i].getEmail());
			newArr[i] = newSaram;
		}
		return newArr;
		
		
	}

	// �󼼺���
	public SaramVo selectOne(SaramVo vo) {
		// 1.�˻��ϱ�
		// 2.���� �䰡�� �����ϸ� �����ؼ� ����
		for (int i = 0; i < top; i++) {
			if (vo.getName().equals(saramArr[i].getName())) {
				SaramVo newSaram = new SaramVo();
				newSaram.setNo(saramArr[i].getNo());
				newSaram.setName(saramArr[i].getName());
				newSaram.setPhone(saramArr[i].getPhone());
				newSaram.setEmail(saramArr[i].getEmail());
				return newSaram;
			}
		}

		return null;

	}

	public SaramVo selectByNo(int no) {
		// 1.�˻��ϱ�
		// 2.���� �䰡�� �����ϸ� �����ؼ� ����
		for (int i = 0; i < top; i++) {
			if (no == saramArr[i].getNo()) {
				SaramVo newSaram = new SaramVo();
				newSaram.setNo(saramArr[i].getNo());
				newSaram.setName(saramArr[i].getName());
				newSaram.setPhone(saramArr[i].getPhone());
				newSaram.setEmail(saramArr[i].getEmail());
				return newSaram;
			}
		}

		return null;

	}

	// �Է�
	public void insert(SaramVo vo) {

		if (top >= MAX) {
			System.out.println("���̻� �Է��� �Ұ����մϴ�");
			return;
		}
		vo.setNo(sequenceNo++);

		saramArr[top++] = vo;

	}

	// ����
	public void update(SaramVo vo) {
		// �˻��ؼ� ���� ��Ұ� �ִٸ� update, sequenceno�� �˻��ؼ� indexã��
		for (int i = 0; i < top; i++) {
			if (saramArr[i].getNo() == vo.getNo()) {
				
				saramArr[i] = vo;
			}
		}

	}

	// ����
	public void delete(SaramVo vo) {
		// 1.no�� �˻��ϱ�
		// 2 ������Ұ� �ִٸ� ��ĭ�� �����
		// 3.������ ��Ҵ� null�� �����ϰ� top����

		for (int i = 0; i < top; i++) {
			if (saramArr[i].getNo() == vo.getNo()) {
				for(int j = i; j<top-1;j++)
				{
				   saramArr[j] = saramArr[j+1];	
				}
				saramArr[top-1] = null;
				top--;
			}
		}
	}

}
