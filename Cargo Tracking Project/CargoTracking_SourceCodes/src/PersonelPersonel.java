import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class PersonelPersonel extends JFrame {

	private JPanel w_pane;
	private JTextField text_personelidsorgula;
	private JTextField txt_no;
	private JTable table;
	private JTextField txt_personeladEkle;
	private JTextField txt_personelsoyadEkle;
	private JTextField txt_personelsifreEkle;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelPersonel frame = new PersonelPersonel();
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
	public PersonelPersonel() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		DefaultTableModel personelbilgisimodelim = new DefaultTableModel();
		
		 Object[] kolonlar8 ={"Personel Adý", "Personel Soyadý" };
		 Object[] satirlar8 = new Object[2];
		
		JLabel lblNewLabel = new JLabel("Personel");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel.setBounds(62, 29, 165, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_3.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Personel Ekle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("Personel Ad\u0131:");
		lblNewLabel_1_5.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(189, 140, 188, 27);
		panel_3.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Personel Soyad\u0131:");
		lblNewLabel_1_1_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(189, 178, 188, 27);
		panel_3.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Personel \u015Eifresi:");
		lblNewLabel_1_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(189, 215, 188, 27);
		panel_3.add(lblNewLabel_1_2_3);
		
		txt_personeladEkle = new JTextField();
		txt_personeladEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_personeladEkle.setColumns(10);
		txt_personeladEkle.setBounds(383, 140, 188, 27);
		panel_3.add(txt_personeladEkle);
		
		txt_personelsoyadEkle = new JTextField();
		txt_personelsoyadEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_personelsoyadEkle.setColumns(10);
		txt_personelsoyadEkle.setBounds(383, 178, 188, 27);
		panel_3.add(txt_personelsoyadEkle);
		
		txt_personelsifreEkle = new JTextField();
		txt_personelsifreEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_personelsifreEkle.setColumns(10);
		txt_personelsifreEkle.setBounds(383, 215, 188, 27);
		panel_3.add(txt_personelsifreEkle);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnEkle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnEkle.setBackground(new Color(255, 102, 51));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				//INSERT INTO  (ToplamTutar,FaturaAdres,SiparisTarihi VALUES(3,'
				 String personelAdý,personelSoyadý,personelSifre,SqlSorgu;
				 
				 personelAdý= txt_personeladEkle.getText();
				 personelSoyadý= txt_personelsoyadEkle.getText();
				 personelSifre =txt_personelsifreEkle.getText();
				 
				 SqlSorgu="INSERT INTO personel (PersonelAd,PersonelSoyad,PersonelSifre) VALUES("+
				 "'"+personelAdý+"',"+"'"+personelSoyadý+"','"+personelSifre+"')";
				 //System.out.println(SqlSorgu);
				 baglanti.ekle(SqlSorgu);
				 
				 JOptionPane.showMessageDialog(btnEkle, "Ekleme iþlemi iþlemi Tamamlandý!");
				 
			}
		});
		btnEkle.setBounds(637, 225, 110, 44);
		panel_3.add(btnEkle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Personel G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnGncelle.setBackground(new Color(255, 102, 51));
		btnGncelle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PersonelID,PersonelAd,PersonelSoyad,PersonelSifre,sql_sorgu;
			    PersonelID=textField_2.getText();
				PersonelAd=textField_3.getText();
				PersonelSoyad=textField_4.getText();
				PersonelSifre=textField_5.getText();
				
				sql_sorgu = "UPDATE personel SET PersonelID="+PersonelID+",PersonelAd='"+PersonelAd+"',PersonelSoyad='"+PersonelSoyad+"',PersonelSifre='"+PersonelSifre+"' WHERE PersonelID="+PersonelID;
				  System.out.println(sql_sorgu);
					baglanti.update(sql_sorgu);	
					
					JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý!");
					
			}
		});
		btnGncelle.setBounds(652, 201, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Personel Ad\u0131:");
		lblNewLabel_1_5_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(192, 143, 188, 27);
		panel.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Personel Soyad\u0131:");
		lblNewLabel_1_1_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_3_1.setBounds(192, 181, 188, 27);
		panel.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Personel \u015Eifresi:");
		lblNewLabel_1_2_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1.setBounds(192, 218, 188, 27);
		panel.add(lblNewLabel_1_2_3_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_2.setColumns(10);
		textField_2.setBounds(386, 111, 188, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_3.setColumns(10);
		textField_3.setBounds(386, 148, 188, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_4.setColumns(10);
		textField_4.setBounds(386, 186, 188, 27);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Personel Numaras\u0131:");
		lblNewLabel_1_5_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5_1_1.setBounds(192, 106, 188, 27);
		panel.add(lblNewLabel_1_5_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_5.setColumns(10);
		textField_5.setBounds(386, 219, 188, 27);
		panel.add(textField_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Personel Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_personelidsorgula = new JTextField();
		text_personelidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_personelidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_personelidsorgula.setColumns(10);
		text_personelidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_personelidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("Personel Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(192, 26, 234, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personelbilgisimodelim.setRowCount(0);
				
				String id2 = text_personelidsorgula.getText();
				int id3 = Integer.parseInt(id2);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from personel where PersonelID= "+ id3 + "";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar8[0] = myRs.getString("PersonelAd");
								satirlar8[1] = myRs.getString("PersonelSoyad");
						
							
								personelbilgisimodelim.addRow(satirlar8);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(personelbilgisimodelim);
				
			}
			}
		);
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 102, 51));
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(135, 168, 771, 202);
		panel_1.add(scrollPane);
		
		table = new JTable();
		personelbilgisimodelim.setColumnIdentifiers(kolonlar8);
		table.setModel(personelbilgisimodelim);
		table.setBounds(445, 189, 311, 163);
		scrollPane.setViewportView(table);
		//panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Personel Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		txt_no = new JTextField();
		txt_no.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_no.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		txt_no.setColumns(10);
		txt_no.setBounds(496, 127, 255, 51);
		panel_2.add(txt_no);
		
		JLabel lblKargoNumaras_1 = new JLabel("Silinecek Personel Numaras\u0131:");
		lblKargoNumaras_1.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras_1.setBounds(128, 123, 340, 59);
		panel_2.add(lblKargoNumaras_1);
		
		JButton btnNewButton_1 = new JButton("Sil");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(153, 102, 204));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no, sql_sil;
				
			    no = txt_no.getText();
			    int noo = Integer.parseInt(no);
				
				sql_sil = "DELETE FROM personel WHERE PersonelID ="+noo;
				
				
				baglanti.sil(sql_sil);
				
				JOptionPane.showMessageDialog(btnNewButton_1, "Silme iþlemi iþlemi Tamamlandý!");
				
			}
		});
		btnNewButton_1.setBounds(549, 232, 110, 44);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		             dispose();
			}
			
		});
		btnNewButton_1_1.setBounds(920, 604, 93, 32);
		w_pane.add(btnNewButton_1_1);
	}
}
