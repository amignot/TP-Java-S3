package thread.exo8.eventDispatch;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestLongAction extends JFrame {

	private static final long serialVersionUID = 1L;
	final JButton btnAction;
	
	public TestLongAction(){
			
		btnAction = new JButton("Start");
		btnAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LongAction action = new LongAction();
				new Thread(action).start();
			}
		});

		final Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2,1));
		contentPane.add(btnAction);
		setTitle("Test de LongAction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
			new TestLongAction();		
	} 

}

/*
 * Lorsque la fenêtre est retaillée, elle ne s'adapte pas au changement de taille.
 * 
 * Pour y remédier on peut changer le contenu de actionPerformed et mettre : (pour lancer dans un thread 
 * l'affichage de la fenêtre et dans l'autre l'exécution de LongAction)
 * 
 * Thread t = new Thread() {
		            public void run() {
		              new LongAction().run(); 
		            }
		          };
		          t.start();
 *
 * ou on peut utiliser la méthode invokeLater();
 */
