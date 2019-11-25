
class Add {
	int num = 1;

	public void increase() {
		for (int i = 0; i < 10; i++) {
			System.out.println("num : " + num);
			num++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5초
           // >>> 1띄우고 0.5초 대기하고 다시 1증가
		}
	}
}

public class MythreadTest {

	// 메인 쓰레드
	public static void main(String[] args) {
		Add add = new Add();
		 System.out.println("메인쓰레드 1");
		 add.increase();
		 System.out.println("메인쓰레드 2");

	}

}
