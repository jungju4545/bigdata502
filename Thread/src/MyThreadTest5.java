
class Mp3Download extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Mp3Download :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyThreadTest5 {

	public static void main(String[] args) {
		Mp3Download mp3 = new Mp3Download();
		mp3.start();
		
		
		System.out.println("����");
		
		try {
			mp3.join(); // ���ξ����尡 mp3������ ����ɶ� ���� ��ٸ��ٴ� �ǹ�
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("����"); // �� ���ᰡ �������?
		/**
		 * ����(����)��ȯ :
		 * mp3�����ϴ°� ���� main �����ϴ°� ������ . �׷��� mp3�� �ϴ� ��Ƶΰ� ���� ���� �� mp3����..
		 * 
		 */

	}

}
