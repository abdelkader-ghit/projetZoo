package interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class MenuAdmZoo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9180139821670017211L;
	private JPanel contentPane;

	Connection cnx = null;
	PreparedStatement prepared = null;
	ResultSet resultat = null;
	private JTextField n;
	private JTextField a;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmZoo frame = new MenuAdmZoo();
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
	public MenuAdmZoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		cnx = ConnexionBD.connexionbd();
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(124, 137, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblge = new JLabel("\u00C2ge");
		lblge.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblge.setBounds(124, 168, 46, 14);
		contentPane.add(lblge);
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter un animal");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(92, 96, 129, 30);
		contentPane.add(lblNewLabel_2);
		
		JComboBox<String> an = new JComboBox<String>();
		an.addItem("Aigle");
		an.addItem("Tigre");
		an.addItem("Dauphin");
		an.addItem("lion"); 
		an.addItem("Perroquet");
		an.addItem("Tortue");
		an.setBounds(181, 196, 86, 20);
		contentPane.add(an);
		
		JLabel lblNewLabel_3 = new JLabel("Animal");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(113, 199, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abdel\\Desktop\\01MTII\\S7\\CPO\\Nouveau dossier\\1616.PNG"));
		lblNewLabel.setBounds(272, -47, 480, 300);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String animal = an.getSelectedItem().toString();
				
				
				if(animal.equals("lion"))
				{
				String sql = "insert into lion (nom,age) values(?,?) ";
				 try {
					prepared = cnx.prepareStatement(sql);
					prepared.setString(1,n.getText().toString());
					prepared.setString(2,a.getText().toString());
					prepared.execute();
					JOptionPane.showMessageDialog(null," animal ajouter ");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
				
				 else if(animal.equals("Aigle")){
						
						
						String sql1 = "insert into aigle (nom,age) values(?,?) ";
						 try {
							prepared = cnx.prepareStatement(sql1);
							prepared.setString(1,n.getText().toString());
							prepared.setString(2,a.getText().toString());
							prepared.execute();
							JOptionPane.showMessageDialog(null," animal ajouter ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				 else if(animal.equals("Tigre")){
						
						
						String sql2 = "insert into tigre (nom,age) values(?,?) ";
						 try {
							prepared = cnx.prepareStatement(sql2);
							prepared.setString(1,n.getText().toString());
							prepared.setString(2,a.getText().toString());
							prepared.execute();
							JOptionPane.showMessageDialog(null," animal ajouter ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				 else if(animal.equals("Dauphin")){
						
						
						String sql3 = "insert into dauphin (nom,age) values(?,?) ";
						 try {
							prepared = cnx.prepareStatement(sql3);
							prepared.setString(1,n.getText().toString());
							prepared.setString(2,a.getText().toString());
							prepared.execute();
							JOptionPane.showMessageDialog(null," animal ajouter ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

				 else if(animal.equals("Tortue")){
						
						
						String sql4 = "insert into tortue (nom,age) values(?,?) ";
						 try {
							prepared = cnx.prepareStatement(sql4);
							prepared.setString(1,n.getText().toString());
							prepared.setString(2,a.getText().toString());
							prepared.execute();
							JOptionPane.showMessageDialog(null," animal ajouter ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				 else if(animal.equals("Perroquet")){
						
						
						String sql4 = "insert into perroquet (nom,age) values(?,?) ";
						 try {
							prepared = cnx.prepareStatement(sql4);
							prepared.setString(1,n.getText().toString());
							prepared.setString(2,a.getText().toString());
							prepared.execute();
							JOptionPane.showMessageDialog(null," animal ajouter ");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
			else
			{
				JOptionPane.showMessageDialog(null, "n'existe pas cet animal ");	
			}
				}
		});
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(138, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		 
		n = new JTextField();
		n.setBounds(180, 134, 71, 17);
		contentPane.add(n);
		n.setColumns(10);
		
		a = new JTextField();
		a.setColumns(10);
		a.setBounds(180, 165, 71, 17);
		contentPane.add(a);

		
		
		}

}
