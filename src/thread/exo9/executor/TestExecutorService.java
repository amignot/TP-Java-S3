package thread.exo9.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
	
	public static void main(String[] args){

		List<Runnable> runnables = new ArrayList<Runnable>();
		
		runnables.add(new Task());
		runnables.add(new Task());
		/* Lorsqu'on a 2 tâches pour un pool de 2 threads,
		 * ils travaillent en parallèle et affichent
		 * la même heure.*/
		//On ajoute un troisième runnable
		runnables.add(new Task());
		/* Lorsqu'on a 3 tâches pour un pool de 2 threads, 
		 * on a d'abord les 2 threads qui travaillent en parallèle
		 * et affichent la même heure 10 fois.
		 * Une fois ce traitement effectué, l'un des thread traite
		 * la troisième tâche et affiche 10 fois l'heure.*/

		// On crée un pool de 2 threads
		ExecutorService execute = Executors.newFixedThreadPool(2);
		
		executeRunnables(execute, runnables);
	}
	
	public static void executeRunnables(final ExecutorService service, List<Runnable> runnables){
        //On exécute chaque "tâche" de la liste "runnables"
		for(Runnable r : runnables){

			service.execute(r);
		}
		/* Pour interrompre l'exécution des threads,
		 * on utilise la méthode shutdown() proposée
		 * par ExecutorService*/
		service.shutdown();
	}
	
	/* L'interface runnable est limitée car
	 * la méthode run() ne peut rien retourner et
	 * elle ne permet pas de lancer d'exception.*/
}