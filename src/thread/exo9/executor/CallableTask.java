package thread.exo9.executor;


import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

	int cpt;
	
	public CallableTask() {
		this.cpt=0;
	}
	
	@Override
	public Integer call() throws Exception {
		for(int i=0; i<10; i++) {
			try {
				cpt += 1; 
				Thread.sleep(1000L);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		return cpt;
	}
	/*
	 * On rŽcupre le rŽsultat de cette mŽthode
	 * gr‰ce ˆ la mŽthode get() de l'interface Future
	 * voir classe TestCallableExecutor
	 */

}
