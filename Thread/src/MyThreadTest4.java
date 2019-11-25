/**
 * 프로세스 : 단순히 실행되는 프로그램(메모리에 적재된 프로그램) Ex)크롬을 실행시키고 MP3 음악을 듣고 있으면 프로세스가 2개
 * Thread : 프로세스 내에서 작업중인 조각들 하나의 프로세스에는 하나의 thread가 존재한다. 프로그램은 이 thread위에서 실행됨
 * 쓰레드가 두개를 가진 프로그램을 멀티쓰레드 프로세스라 한다.
 *
 * thread만드는 2가지 방법 1. 쓰레드 상속(자바는 다중 상속이 불가능) 2. Runnable 인터페이스를 구현하는 방법(다중상속
 * 가능)
 *
 * thread만들때 핵심
 *  1. 타켓을 만들어 주는 것(타켓이란 run메소드를 가지고 있는 클래스)
 *  2. start() 호출하면 run()이 실행 된다.
 */

// 쓰레드 상속해서 만들기
// FileDown f = new FileDown();
//f.start();
// run메소드를 가지게 되면 타겟이 됨
class FileDown extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println("파일" + i + "% 다운 중");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

//Runnable 구현해서 만들기
//FileDown f= new FileDown(new ImageDown());
//f.start();



class ImageDown implements Runnable {

	@Override
	public void run() {
		down();
	}

	public void down() {
		for (int i = 1; i < 101; i++) {
			System.out.println("이미지" + i + "%다운 중");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class MyThreadTest4 {

	public static void main(String[] args) {
		
		FileDown filedown = new FileDown();
		filedown.start();
		
		// ImageDown i = new ImageDown();이 안되는 이유
		// ImageDown는 혹은 Runnable은 start를 가지고 있지 않다.
		
		
		Thread t1 = new Thread(new ImageDown());
		t1.start(); // 
	                                                                                                                                                                                                                                                                                                                                        
	}

}
