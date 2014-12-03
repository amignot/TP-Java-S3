package thread.exo8.eventDispatch;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestLongAction extends JFrame {

	private static final long serialVersionUID = 1L;
	final JButton btnAction;
	
	public TestLongAction(){
			
		btnAction = new JButton("Start");
		btnAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*LongAction action = new LongAction();*/
				/* new Thread(action).start();*/ 
				Thread t = new Thread() {
		            public void run() {
		              new LongAction().run(); 
		            }
		          };
		          t.start();
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
