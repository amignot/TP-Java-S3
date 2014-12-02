package thread.exo6.notification;

public class ThreadNotifB extends Thread{
	
	private final Compteur compteur;
	
	public ThreadNotifB(Compteur c, String name) {
		this.compteur=c;
		this.setName(name);
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized(this){
				if(!(this.compteur.getL() % 2 == 0)) {
					System.out.println(Thread.currentThread().getName()+' '+this.compteur.getL());
					this.compteur.next();
				}
				this.notifyAll();
			}
		}
	}

}
