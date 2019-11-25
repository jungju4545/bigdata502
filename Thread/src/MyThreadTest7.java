
class ThreadB extends Thread{
	int total;
	
	@Override
	public void run() {
		synchronized (this) { //this�� run�ڱ� �ڽ�
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"�� ���մϴ�");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}notify();
		}
		
	}
}

public class MyThreadTest7 {

	public static void main(String[] args) {
		Thread tb = new ThreadB();
		tb.start();
		
		synchronized (tb) {
			try {
				System.out.println("tb�� �Ϸ�� �� ���� ��ٸ��ϴ�");
				tb.wait(); // notify()�� ȣ��ɶ����� ��ٸ�
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("�����մϴ�");
	}

}
