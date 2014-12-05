package thread.exo5.synchronisation;


public class TestSynchronization {
	
	private static class ConcurrentThread extends Thread {
		
		private final Compteur compteur;
		
		public ConcurrentThread(Compteur c, String name) {
			this.compteur=c;
			this.setName(name);
		}
		
		public Compteur getCompteur() {
			return this.compteur;
		}
	
		@Override
		public void run() {
			for(long i=0; i<1000000; i++) {
				System.out.println("Thread = "+this.getName());
				this.compteur.next();
			}
		}
		
	};
	
	public static void main (String[] args) throws InterruptedException{
		
		final Compteur compteur = new Compteur();
		final ConcurrentThread tab[] = {new ConcurrentThread(compteur,"a"), 
										new ConcurrentThread(compteur, "b"),
										new ConcurrentThread(compteur, "c"),
										new ConcurrentThread(compteur, "d"), 
										new ConcurrentThread(compteur, "e"),	
										new ConcurrentThread(compteur, "f"),
										new ConcurrentThread(compteur, "g"),
										new ConcurrentThread(compteur, "h"),
										new ConcurrentThread(compteur, "i"),
										new ConcurrentThread(compteur, "j")};
		for (Thread thread:tab) {
			thread.start();
			thread.join();
		}
		
		System.out.println(compteur.getL());
	}
	

}
