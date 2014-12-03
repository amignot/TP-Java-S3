package thread.exo6.notification;

public class ThreadNotifA extends Thread{
	
	private final Compteur compteur;
	
	public ThreadNotifA(Compteur c, String name) {
		this.compteur=c;
		this.setName(name);
	}
	
	@Override
	public void run() {
		while(this.compteur.getL() != 100) {
			synchronized(this.compteur){
				if(this.compteur.getL() % 2 == 0) {
					System.out.println(Thread.currentThread().getName()+' '+this.compteur.getL());
					this.compteur.next();
				}
			}
		}
	}

}
