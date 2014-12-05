package thread.exo9.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallableExecutor {

	public static void main(String[] args) {
		
		
		//On crée un pool de thread pour exécuter notre tâche
		ExecutorService execute = Executors.newSingleThreadExecutor();
		//On exécute notre tâche grâce à la méthode submit() d'ExecutorService
		//Cette méthode renvoie un objet de type Future
		Future<Integer> resultat = execute.submit( new CallableTask());
		
		//On a donc récupéré notre résultat dans la variable resultat
		try {
			System.out.println("RŽsultat de la t‰che callable : " + resultat.get());
		} catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		execute.shutdown();
		

	}

}
