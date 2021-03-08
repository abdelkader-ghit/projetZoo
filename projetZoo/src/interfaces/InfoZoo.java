package interfaces;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoZoo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	Connection cnx = null;
	PreparedStatement prepared = null;
	ResultSet resultat = null;
	private JButton btnNewButton;
	private JScrollPane scrollPane_1;
	private JTable d;
	private JButton btnDauphin;
	private JScrollPane scrollPane_2;
	private JTable t;
	private JButton btnTortue;
	private JScrollPane scrollPane_3;
	private JTable p;
	private JButton btnPerroquet;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoZoo frame = new InfoZoo();
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
	public InfoZoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		cnx = ConnexionBD.connexionbd();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 34, 377, 232);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton(" lion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mjrTable();
				
			}
		});
		btnNewButton.setBounds(170, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(456, 34, 334, 232);
		contentPane.add(scrollPane_1);
		
		d = new JTable();
		scrollPane_1.setViewportView(d);
		
		btnDauphin = new JButton("Dauphin");
		btnDauphin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mjrTabled();
			}
		});
		btnDauphin.setBounds(563, 11, 89, 23);
		contentPane.add(btnDauphin);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(31, 304, 382, 215);
		contentPane.add(scrollPane_2);
		
		t = new JTable();
		scrollPane_2.setViewportView(t);
		
		btnTortue = new JButton("Tortue");
		btnTortue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mjrTablet();
			}
		});
		btnTortue.setBounds(170, 277, 89, 23);
		contentPane.add(btnTortue);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(456, 304, 342, 215);
		contentPane.add(scrollPane_3);
		
		p = new JTable();
		scrollPane_3.setViewportView(p);
		
		btnPerroquet = new JButton("Perroquet");
		btnPerroquet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mjrTablep();
				
			}
		});
		btnPerroquet.setBounds(607, 277, 89, 23);
		contentPane.add(btnPerroquet);
	}

	public void mjrTable(){
		
		String sql = "select*from lion";
		
		try {
			prepared = cnx.prepareStatement(sql);
			resultat = prepared.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(resultat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
public void mjrTablet(){
		
		String sql = "select*from tortue";
		
		try {
			prepared = cnx.prepareStatement(sql);
			resultat = prepared.executeQuery();
			t.setModel(DbUtils.resultSetToTableModel(resultat));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

public void mjrTablep(){
	
	String sql = "select*from perroquet";
	
	try {
		prepared = cnx.prepareStatement(sql);
		resultat = prepared.executeQuery();
		p.setModel(DbUtils.resultSetToTableModel(resultat));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
}

public void mjrTabled(){
	
	String sql = "select*from dauphin";
	
	try {
		prepared = cnx.prepareStatement(sql);
		resultat = prepared.executeQuery();
		d.setModel(DbUtils.resultSetToTableModel(resultat));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
}

}
