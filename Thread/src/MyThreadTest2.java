
class Add2 extends Thread{
	
	// 새로운 쓰레드의 스택
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
    // 매인 쓰레드 스택
	public static void main(String[] args) {
		Add2 add2 = new Add2();
		System.out.println("메인 쓰레드 시작");
		add2.start(); // 새로운 쓰래드 시작
		for (int i = 0; i < 10; i++) {// 메인은 그대로 for문 돌림
			System.out.println("메인쓰레드i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// 처리순서: 23 실행>24실행>안기다리고 25번 실행 
		 // 결과는 24와 25가 동시에 실행된다.
		                                                                                                                                                                                                                                                                                                                                                                                                      
	}

}
