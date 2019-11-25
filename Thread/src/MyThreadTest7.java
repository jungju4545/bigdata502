
class ThreadB extends Thread{
	int total;
	
	@Override
	public void run() {
		synchronized (this) { //this는 run자기 자신
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"를 더합니다");
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
				System.out.println("tb가 완료될 때 까지 기다립니다");
				tb.wait(); // notify()가 호출될때까지 기다림
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료합니다");
	}

}
