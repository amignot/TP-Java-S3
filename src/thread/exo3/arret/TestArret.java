package thread.exo3.arret;

public class TestArret {

	public static void main(String[] args) throws InterruptedException {
		
		final Task task = new Task();
		new Thread(task).start();
		try {
			Thread.sleep(2000);
			task.setStopped(true);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("\n"+Thread.currentThread()+" est arr�t�.");
		
	}

}

/*
 * Il faut synchoniser les m�thodes setStopped et isStopped car dans le cas contraire, 
 * la valeur du booleen stopped restera inchang�e lors de l'�xecution du thread.
 * 
 * Si les points s'affichent toutes les 10 000ms alors, il n'y aura qu'1 ou 0 point d'affich�s.
 */
 