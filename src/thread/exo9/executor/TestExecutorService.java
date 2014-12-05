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
		/* Lorsqu'on a 2 t�ches pour un pool de 2 threads,
		 * ils travaillent en parall�le et affichent
		 * la m�me heure.*/
		//On ajoute un troisi�me runnable
		runnables.add(new Task());
		/* Lorsqu'on a 3 t�ches pour un pool de 2 threads, 
		 * on a d'abord les 2 threads qui travaillent en parall�le
		 * et affichent la m�me heure 10 fois.
		 * Une fois ce traitement effectu�, l'un des thread traite
		 * la troisi�me t�che et affiche 10 fois l'heure.*/

		// On cr�e un pool de 2 threads
		ExecutorService execute = Executors.newFixedThreadPool(2);
		
		executeRunnables(execute, runnables);
	}
	
	public static void executeRunnables(final ExecutorService service, List<Runnable> runnables){
        //On ex�cute chaque "t�che" de la liste "runnables"
		for(Runnable r : runnables){

			service.execute(r);
		}
		/* Pour interrompre l'ex�cution des threads,
		 * on utilise la m�thode shutdown() propos�e
		 * par ExecutorService*/
		service.shutdown();
	}
	
	/* L'interface runnable est limit�e car
	 * la m�thode run() ne peut rien retourner et
	 * elle ne permet pas de lancer d'exception.*/
}