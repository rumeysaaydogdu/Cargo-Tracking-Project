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
import javax.swing.SwingConstants;

public class PersonelMusteri extends JFrame {

	private JPanel w_pane;
	private JTextField text_musteriidsorgula;
	private JTextField txt_no;
	private JTable table;
	private JTextField txt_musteriadý;
	private JTextField txt_musterisoyadý;
	private JTextField txt_musteriemail;
	private JTextField txt_musteritelefonu;
	private JTextField txt_kargotakipno;
	private JTextField txt_musteriadresi;
	private JTextField txt_musteriTC;
	private JTextField textField_11;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelMusteri frame = new PersonelMusteri();
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
	public PersonelMusteri() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		DefaultTableModel musterimodelim = new DefaultTableModel();
		
		 Object[] kolonlar7 ={"Müþteri TC", "Müþteri Ad", "Müþteri Soyad", "Müþteri Email","Müþteri Telefon", "Kargo Takip No","Müþteri Adres"};
		 Object[] satirlar7 = new Object[7];
		
		JLabel lblNewLabel = new JLabel("M\u00FC\u015Fteri");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel.setBounds(71, 30, 150, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_3.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("M\u00FC\u015Fteri Ekle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("M\u00FC\u015Fteri Ad\u0131:");
		lblNewLabel_1_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(190, 79, 188, 27);
		panel_3.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("M\u00FC\u015Fteri Soyad\u0131:");
		lblNewLabel_1_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(190, 116, 188, 27);
		panel_3.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("M\u00FC\u015Fteri Email:");
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(190, 154, 188, 27);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("M\u00FC\u015Fteri Telefon:");
		lblNewLabel_1_2_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(190, 191, 188, 27);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Kargo Takip No:");
		lblNewLabel_1_4_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(190, 228, 188, 27);
		panel_3.add(lblNewLabel_1_4_1);
		
		txt_musteriadý = new JTextField();
		txt_musteriadý.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteriadý.setColumns(10);
		txt_musteriadý.setBounds(384, 79, 188, 27);
		panel_3.add(txt_musteriadý);
		
		txt_musterisoyadý = new JTextField();
		txt_musterisoyadý.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musterisoyadý.setColumns(10);
		txt_musterisoyadý.setBounds(384, 116, 188, 27);
		panel_3.add(txt_musterisoyadý);
		
		txt_musteriemail = new JTextField();
		txt_musteriemail.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteriemail.setColumns(10);
		txt_musteriemail.setBounds(384, 153, 188, 27);
		panel_3.add(txt_musteriemail);
		
		txt_musteritelefonu = new JTextField();
		txt_musteritelefonu.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteritelefonu.setColumns(10);
		txt_musteritelefonu.setBounds(384, 191, 188, 27);
		panel_3.add(txt_musteritelefonu);
		
		txt_kargotakipno = new JTextField();
		txt_kargotakipno.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kargotakipno.setColumns(10);
		txt_kargotakipno.setBounds(384, 228, 188, 27);
		panel_3.add(txt_kargotakipno);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnEkle.setBackground(new Color(255, 102, 51));
		btnEkle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//INSERT INTO musteri (MusteriTC,MusteriAd,MusteriSoyad,MusteriEmail,MusteriTelefon,KargoID, SipariAdres) VALUES(3,'
				 String mAd,mSoyad,mEmail,mAdres,mkargotakip,SqlSorgu;
				 int mTC,mTelefon;
				 mTC= txt_musteriTC.getCaretPosition();
				 mAd= txt_musteriadý.getText();
				 mSoyad=txt_musterisoyadý.getText();
				 mEmail=txt_musteriemail.getText();
				 mTelefon=txt_musteritelefonu.getCaretPosition();
				 mkargotakip= txt_kargotakipno.getText();
				 mAdres=txt_musteriadresi.getText();
				 SqlSorgu="INSERT INTO musteri (MusteriTC,MusteriAd,MusteriSoyad,MusteriEmail,MusteriTelefon,KargoTakipNo,SiparisAdres) VALUES("+
				 mTC+","+"'"+mAd+"',"+"'"+mSoyad+"',"+"'"+mEmail+"',"+mTelefon+",'"+mkargotakip+"','"+mAdres+"')";
				 //System.out.println(SqlSorgu);
				 baglanti.ekle(SqlSorgu);
				 
				 JOptionPane.showMessageDialog(btnEkle, "Ekleme iþlemi iþlemi Tamamlandý!");
				 
			}
		});
		btnEkle.setBounds(660, 246, 110, 44);
		panel_3.add(btnEkle);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("M\u00FC\u015Fteri Adresi:");
		lblNewLabel_1_2_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1.setBounds(190, 264, 188, 27);
		panel_3.add(lblNewLabel_1_2_3_1);
		
		txt_musteriadresi = new JTextField();
		txt_musteriadresi.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteriadresi.setColumns(10);
		txt_musteriadresi.setBounds(384, 264, 188, 27);
		panel_3.add(txt_musteriadresi);
		
		JLabel lblNewLabel_1_2_3_1_2 = new JLabel("M\u00FC\u015Fteri TC:");
		lblNewLabel_1_2_3_1_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1_2.setBounds(190, 45, 188, 27);
		panel_3.add(lblNewLabel_1_2_3_1_2);
		
		txt_musteriTC = new JTextField();
		txt_musteriTC.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteriTC.setColumns(10);
		txt_musteriTC.setBounds(384, 45, 188, 27);
		panel_3.add(txt_musteriTC);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("M\u00FC\u015Fteri G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBackground(new Color(255, 102, 51));
		btnGncelle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnGncelle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String MusteriID,MusteriAd,MusteriSoyad,MusteriEmail,SiparisAdres,MusteriTelefon,MusteriTC,KargoID,sql_sorgu;
				MusteriID=textField_3.getText();
				MusteriAd=textField_4.getText();
				MusteriSoyad=textField_5.getText();
				MusteriEmail=textField_6.getText();
				SiparisAdres=textField_7.getText();
				MusteriTelefon=textField_8.getText();
				MusteriTC=textField_9.getText();
				KargoID=textField_11.getText();
				
				sql_sorgu = "UPDATE musteri SET MusteriID="+MusteriID+",MusteriAd='"+MusteriAd+"',MusteriSoyad='"+MusteriSoyad+"',MusteriEmail='"+MusteriEmail+"',SiparisAdres='"+SiparisAdres+"',MusteriTelefon="+MusteriTelefon+",MusteriTC="+MusteriTC+",KargoID="+KargoID+" WHERE MusteriID="+MusteriID;
				  System.out.println(sql_sorgu);
					baglanti.update(sql_sorgu);	
					
					JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý!");
					
			}
		});
		btnGncelle.setBounds(659, 285, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblNewLabel_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(182, 46, 188, 27);
		panel.add(lblNewLabel_1_1_1);
		
		textField_11 = new JTextField();
		textField_11.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_11.setColumns(10);
		textField_11.setBounds(380, 307, 188, 27);
		panel.add(textField_11);
		
		JLabel lblNewLabel_1_2_3_2 = new JLabel("M\u00FC\u015Fteri Ad\u0131:");
		lblNewLabel_1_2_3_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_2.setBounds(182, 83, 188, 27);
		panel.add(lblNewLabel_1_2_3_2);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("M\u00FC\u015Fteri Soyad\u0131:");
		lblNewLabel_1_3_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3_1_1.setBounds(182, 117, 188, 27);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("M\u00FC\u015Fteri Email:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(182, 155, 188, 27);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("M\u00FC\u015Fteri Telefon:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(182, 230, 188, 27);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Kargo Takip No:");
		lblNewLabel_1_4_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4_1_1.setBounds(182, 307, 188, 27);
		panel.add(lblNewLabel_1_4_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_3.setColumns(10);
		textField_3.setBounds(380, 51, 188, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_4.setColumns(10);
		textField_4.setBounds(380, 88, 188, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_5.setColumns(10);
		textField_5.setBounds(380, 122, 188, 27);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_6.setColumns(10);
		textField_6.setBounds(380, 155, 188, 27);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_7.setColumns(10);
		textField_7.setBounds(380, 192, 188, 27);
		panel.add(textField_7);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("M\u00FC\u015Fteri Adresi:");
		lblNewLabel_1_2_3_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1_1.setBounds(182, 191, 188, 27);
		panel.add(lblNewLabel_1_2_3_1_1);
		
		textField_8 = new JTextField();
		textField_8.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_8.setColumns(10);
		textField_8.setBounds(380, 230, 188, 27);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_2_3_1_2_1 = new JLabel("M\u00FC\u015Fteri TC:");
		lblNewLabel_1_2_3_1_2_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1_2_1.setBounds(182, 271, 188, 27);
		panel.add(lblNewLabel_1_2_3_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_9.setColumns(10);
		textField_9.setBounds(380, 271, 188, 27);
		panel.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("M\u00FC\u015Fteri Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_musteriidsorgula = new JTextField();
		text_musteriidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_musteriidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_musteriidsorgula.setColumns(10);
		text_musteriidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_musteriidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(194, 26, 221, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 musterimodelim.setRowCount(0);
					
					String musteriid = text_musteriidsorgula.getText();
					int id7 = Integer.parseInt(musteriid);  //string text kutusunu int koycaðýmýz için çevirdik.
					ResultSet myRs = null;
					String sql_sorgu = "select * from musteri where MusteriID= "+ id7 + " ";
					myRs = baglanti.sorgula(sql_sorgu);
					
					try {
						while(myRs.next()) {
							
									satirlar7[0] = myRs.getString("MusteriTC");
									satirlar7[1] = myRs.getString("MusteriAd");
									satirlar7[2] = myRs.getString("MusteriSoyad");
									satirlar7[3] = myRs.getString("MusteriEmail");
									satirlar7[4] = myRs.getString("MusteriTelefon");
									satirlar7[5] = myRs.getString("KargoTakipNo");
									satirlar7[6] = myRs.getString("SiparisAdres");
								
									musterimodelim.addRow(satirlar7);
						
						}
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
					
					table.setModel(musterimodelim);
					
				
				
			}
		});
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(32, 168, 911, 251);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(255, 102, 51)));
		table.setBackground(new Color(255, 255, 255));
		musterimodelim.setColumnIdentifiers(kolonlar7);
		table.setModel(musterimodelim);
		table.setBounds(445, 189, 311, 163);
		scrollPane.setViewportView(table);
		//panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("M\u00FC\u015Fteri Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		txt_no = new JTextField();
		txt_no.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_no.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		txt_no.setColumns(10);
		txt_no.setBounds(496, 127, 255, 51);
		panel_2.add(txt_no);
		
		JLabel lblKargoNumaras_1 = new JLabel("Silinecek M\u00FC\u015Fteri Numaras\u0131:");
		lblKargoNumaras_1.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras_1.setBounds(135, 123, 322, 59);
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
				
				sql_sil = "DELETE FROM musteri WHERE MusteriID ="+noo;
				
				
				baglanti.sil(sql_sil);
				
				JOptionPane.showMessageDialog(btnNewButton_1, "Silme iþlemi iþlemi Tamamlandý!");
				
			}
		});
		btnNewButton_1.setBounds(569, 223, 110, 44);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(926, 604, 93, 32);
		w_pane.add(btnNewButton_1_1);
	}
}
