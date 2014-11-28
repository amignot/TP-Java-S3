package thread.exo1.heritage;

public class TestWhoIsThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		final WhoIsThread threadA = new WhoIsThread();
		final WhoIsThread threadB = new WhoIsThread();
		
		threadA.start();
		threadB.start();

	}

}
