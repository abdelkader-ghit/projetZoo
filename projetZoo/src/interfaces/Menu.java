package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ajouterAnimal = new JButton("ajouter animal");
		ajouterAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			MenuAdmZoo obj = new MenuAdmZoo();
			obj.setVisible(true);
			}
		});
		ajouterAnimal.setForeground(Color.GREEN);
		ajouterAnimal.setBounds(43, 205, 126, 30);
		contentPane.add(ajouterAnimal);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abdel\\Desktop\\01MTII\\S7\\CPO\\Nouveau dossier\\1312.PNG"));
		lblNewLabel.setBounds(136, 11, 180, 140);
		contentPane.add(lblNewLabel);
		
		JButton btnAfficherDesInfos = new JButton("afficher des infos");
		btnAfficherDesInfos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoZoo obj = new InfoZoo();
				obj.setVisible(true);
			}
		});
		btnAfficherDesInfos.setForeground(Color.GREEN);
		btnAfficherDesInfos.setBounds(272, 209, 126, 30);
		contentPane.add(btnAfficherDesInfos);
	}
}
