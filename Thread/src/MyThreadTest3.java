
// 2�� Runnable ����ϱ�
class MutiDownload{
	
}

class Download extends MutiDownload
implements Runnable{
	
	@Override
	public void run() {
		down();
	}
	
	public void down() {
		for (int i = 1; i < 101; i++) {
			System.out.println(i+"%�ٿ� ��");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
public class MyThreadTest3 {
    // ���� ������ ����
	public static void main(String[] args) {
	
		// run�� ������ �ִ� Ŭ������ Ÿ���̶� �Ѵ�.
		Thread t1 = new Thread(new Download());//new Download() �̰� Ÿ����
		t1.start();
		System.out.println("�ٿ�ε� ����"); 
	}

}
