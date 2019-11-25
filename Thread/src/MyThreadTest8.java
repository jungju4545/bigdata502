
class SharedBoard{
	private int sum =0;
	synchronized public void add() {
		int n = sum;
		Thread.yield();
		n+=10;
		sum=n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board;

	public StudentThread(String name,SharedBoard board) {
		super();
		this.board = board;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
		}
	}
}

public class MyThreadTest8 {

	public static void main(String[] args) {
		
		SharedBoard board = new SharedBoard();
		
		Thread t1 = new StudentThread("kitea", board);
		Thread t2 = new StudentThread("hyoo", board);
		
		
		t1.start();
		t2.start();

	}

}
