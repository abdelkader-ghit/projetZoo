package interfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Utilisateur extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2902691056289896662L;
	private JFrame frame;
	private JTextField nn;
	private JScrollPane scrollPane;
	private JPasswordField mm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Utilisateur window = new Utilisateur();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Utilisateur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(88, 69, 2, 2);
		frame.getContentPane().add(scrollPane);
		
		nn = new JTextField();
		nn.setBounds(173, 163, 100, 20);
		frame.getContentPane().add(nn);
		nn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(137, 0, 160, 130);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abdel\\Desktop\\01MTII\\S7\\CPO\\Nouveau dossier\\1312.PNG"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(56, 166, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe ");
		lblMotDePasse.setBounds(56, 197, 86, 14);
		frame.getContentPane().add(lblMotDePasse);
		
		JButton btnNewButton = new JButton("se connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nom = nn.getText().toString();
				
				String motdepasse=mm.getText().toString();
				//
			
				if(nom.equals("abdelkader")&& motdepasse.equals("123456789"))
				{
					JOptionPane.showMessageDialog(null, "connexion Réussite");
					Menu menu = new Menu();
					menu.setVisible(true);
					
				}else
				{
					JOptionPane.showMessageDialog(null, "connexion echuée");	
				}
				}
			
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(173, 228, 100, 20);
		frame.getContentPane().add(btnNewButton);
		
		mm = new JPasswordField();
		mm.setBounds(173, 194, 100, 20);
		frame.getContentPane().add(mm);
	}
}
