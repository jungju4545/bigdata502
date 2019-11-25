
// 2번 Runnable 사용하기
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
			System.out.println(i+"%다운 중");
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
    // 매인 쓰레드 스택
	public static void main(String[] args) {
	
		// run을 가지고 있는 클래스를 타겟이라 한다.
		Thread t1 = new Thread(new Download());//new Download() 이게 타겟임
		t1.start();
		System.out.println("다운로드 종료"); 
	}

}
