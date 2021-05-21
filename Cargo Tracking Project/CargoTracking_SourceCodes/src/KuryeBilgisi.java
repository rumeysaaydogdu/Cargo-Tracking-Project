import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class KuryeBilgisi extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField text_kuryeidsorgula;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuryeBilgisi frame = new KuryeBilgisi();
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
	public KuryeBilgisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel kuryemodelim = new DefaultTableModel();
		
		 Object[] kolonlar6 ={"Kurye Ad", "Kurye Soyad", "KuryeCinsiyet","Kurye Puan"};
		 Object[] satirlar6 = new Object[4];
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(62, 226, 613, 176);
		contentPane.add(scrollPane);
		
		table = new JTable();
		kuryemodelim.setColumnIdentifiers(kolonlar6);
		table.setModel(kuryemodelim);
		table.setBounds(180, 228, 264, 189);
		scrollPane.setViewportView(table);  //ben yazdým jtable ve scrollpane baðlandý birbirine
		//contentPane.add(table);  //ben yorum yaptým, gerekli
		
		//  BURDAN YARARLANABÝLÝRSÝNÝZ   https://www.youtube.com/watch?v=I56wFFE_Dbs
		
		text_kuryeidsorgula = new JTextField();
		text_kuryeidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_kuryeidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_kuryeidsorgula.setBounds(346, 83, 255, 51);
		contentPane.add(text_kuryeidsorgula);
		text_kuryeidsorgula.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kurye Numaras\u0131:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblNewLabel.setBounds(118, 91, 200, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Görüntüle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	             kuryemodelim.setRowCount(0);
				
				String kuryeid = text_kuryeidsorgula.getText();
				int kuryeid1 = Integer.parseInt(kuryeid);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from kurye where KuryeID= "+ kuryeid1 + "";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar6[0] = myRs.getString("KuryeAd");
								satirlar6[1] = myRs.getString("KuryeSoyad");
								satirlar6[2] = myRs.getString("Cinsiyet");
								satirlar6[3] = myRs.getString("Puan");
							
								kuryemodelim.addRow(satirlar6);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(kuryemodelim);
				
			}
			}
		);
		btnNewButton.setBounds(478, 144, 110, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
			}
		});
		btnNewButton_1.setBounds(617, 421, 93, 32);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("renk1.gif")));
		lblNewLabel_1.setBounds(0, -33, 744, 494);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
