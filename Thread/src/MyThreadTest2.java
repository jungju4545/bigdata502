
class Add2 extends Thread{
	
	// ���ο� �������� ����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyThreadTest2 {
    // ���� ������ ����
	public static void main(String[] args) {
		Add2 add2 = new Add2();
		System.out.println("���� ������ ����");
		add2.start(); // ���ο� ������ ����
		for (int i = 0; i < 10; i++) {// ������ �״�� for�� ����
			System.out.println("���ξ�����i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// ó������: 23 ����>24����>�ȱ�ٸ��� 25�� ���� 
		 // ����� 24�� 25�� ���ÿ� ����ȴ�.
		                                                                                                                                                                                                                                                                                                                                                                                                      
	}

}
