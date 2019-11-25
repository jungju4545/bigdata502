
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
		
		
		System.out.println("시작");
		
		try {
			mp3.join(); // 메인쓰레드가 mp3쓰레드 종료될때 까지 기다린다는 의미
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("종료"); // 왜 종료가 먼저뜰까?
		/**
		 * 문맥(상태)교환 :
		 * mp3실행하는것 보다 main 실행하는게 빠르다 . 그래서 mp3를 일단 담아두고 매인 실행 후 mp3실행..
		 * 
		 */

	}

}
