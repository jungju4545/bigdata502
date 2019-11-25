/**
 * ���μ��� : �ܼ��� ����Ǵ� ���α׷�(�޸𸮿� ����� ���α׷�) Ex)ũ���� �����Ű�� MP3 ������ ��� ������ ���μ����� 2��
 * Thread : ���μ��� ������ �۾����� ������ �ϳ��� ���μ������� �ϳ��� thread�� �����Ѵ�. ���α׷��� �� thread������ �����
 * �����尡 �ΰ��� ���� ���α׷��� ��Ƽ������ ���μ����� �Ѵ�.
 *
 * thread����� 2���� ��� 1. ������ ���(�ڹٴ� ���� ����� �Ұ���) 2. Runnable �������̽��� �����ϴ� ���(���߻��
 * ����)
 *
 * thread���鶧 �ٽ�
 *  1. Ÿ���� ����� �ִ� ��(Ÿ���̶� run�޼ҵ带 ������ �ִ� Ŭ����)
 *  2. start() ȣ���ϸ� run()�� ���� �ȴ�.
 */

// ������ ����ؼ� �����
// FileDown f = new FileDown();
//f.start();
// run�޼ҵ带 ������ �Ǹ� Ÿ���� ��
class FileDown extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println("����" + i + "% �ٿ� ��");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

//Runnable �����ؼ� �����
//FileDown f= new FileDown(new ImageDown());
//f.start();



class ImageDown implements Runnable {

	@Override
	public void run() {
		down();
	}

	public void down() {
		for (int i = 1; i < 101; i++) {
			System.out.println("�̹���" + i + "%�ٿ� ��");
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
		
		// ImageDown i = new ImageDown();�� �ȵǴ� ����
		// ImageDown�� Ȥ�� Runnable�� start�� ������ ���� �ʴ�.
		
		
		Thread t1 = new Thread(new ImageDown());
		t1.start(); // 
	                                                                                                                                                                                                                                                                                                                                        
	}

}
