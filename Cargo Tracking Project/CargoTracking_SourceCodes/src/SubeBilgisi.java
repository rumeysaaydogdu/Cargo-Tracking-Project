import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class SubeBilgisi extends JFrame {

	private JPanel contentPane;
	private JTextField text_subeidsorgula;
	private JTable table;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubeBilgisi frame = new SubeBilgisi();
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
	public SubeBilgisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_subeidsorgula = new JTextField();
		text_subeidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_subeidsorgula.setBounds(334, 71, 255, 51);
		text_subeidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_subeidsorgula.setColumns(10);
		contentPane.add(text_subeidsorgula);
		
		DefaultTableModel modelim4 = new DefaultTableModel();
		
		 Object[] kolonlar4 ={"Þube Telefonu", "Þube Adresi", "Sube Adý"};
		 Object[] satirlar4 = new Object[3];
		
		JLabel lblubeNumaras = new JLabel("\u015Eube Numaras\u0131:");
		lblubeNumaras.setBounds(90, 74, 200, 44);
		lblubeNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		contentPane.add(lblubeNumaras);
		
		JButton btnNewButton = new JButton("Görüntüle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim4.setRowCount(0);
				
				String id4 = text_subeidsorgula.getText();
				int id5 = Integer.parseInt(id4);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from sube where SubeID= "+ id5 + " ";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar4[0] = myRs.getString("SubeTelefon");
								satirlar4[1] = myRs.getString("SubeAdres");
								satirlar4[2] = myRs.getString("SubeAd");
							
								modelim4.addRow(satirlar4);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(modelim4);
				
			}
				
		});
		btnNewButton.setBounds(396, 133, 110, 44);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBackground(new Color(192, 192, 192));
		scrollPane.setBounds(63, 216, 610, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim4.setColumnIdentifiers(kolonlar4);
		table.setModel(modelim4);
		table.setBounds(49, 132, 241, 72);
		scrollPane.setViewportView(table);
		//contentPane.add(table);
		
		btnNewButton_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(614, 421, 93, 32);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("renk1.gif")));
		lblNewLabel.setBounds(0, -28, 734, 499);
		contentPane.add(lblNewLabel);
	}

}
