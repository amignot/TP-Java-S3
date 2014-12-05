package thread.exo9.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallableExecutor {

	public static void main(String[] args) {
		
		
		//On cr�e un pool de thread pour ex�cuter notre t�che
		ExecutorService execute = Executors.newSingleThreadExecutor();
		//On ex�cute notre t�che gr�ce � la m�thode submit() d'ExecutorService
		//Cette m�thode renvoie un objet de type Future
		Future<Integer> resultat = execute.submit( new CallableTask());
		
		//On a donc r�cup�r� notre r�sultat dans la variable resultat
		try {
			System.out.println("R�sultat de la t�che callable : " + resultat.get());
		} catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		execute.shutdown();
		

	}

}
