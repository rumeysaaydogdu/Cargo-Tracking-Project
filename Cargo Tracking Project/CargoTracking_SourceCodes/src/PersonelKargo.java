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
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class PersonelKargo extends JFrame {

	private JPanel w_pane;
	private JTextField text_kargoidsorgula;
	private JTextField txt_no;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txt_kuryeNoEkle;
	private JTextField txt_gelisTarihEkle;
	private JTextField txt_ebatEkle;
	private JTextField txt_agirlikEkle;
	private JTextField txt_ucretEkle;
	private JTextField txt_adresEkle;
	private JTextField txt_odemeEkle;
	private JTextField txt_teslimdurumEkle;
	private JTextField txt_musteriNoEkle;
	private JTextField textField_20;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelKargo frame = new PersonelKargo();
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
	public PersonelKargo() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		DefaultTableModel personelkargomodelim = new DefaultTableModel();
		
		 Object[] kolonlar10 ={"Müþteri Numarasý", "Kurye Numarasý", "Kargo Ücreti","Kargo Ebatý", "Kargo Aðýrlý", "Ödeme Türü","Geliþ Tarihi ", "Sipariþ Adresi", "Teslim Durumu"};
		 Object[] satirlar10 = new Object[9];
		
		
		JLabel lblNewLabel = new JLabel("Kargo");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 40));
		lblNewLabel.setBounds(71, 30, 109, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_3.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kargo Ekle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("Kurye Numaras\u0131:");
		lblNewLabel_1_5.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(188, 39, 188, 27);
		panel_3.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Geli\u015F Tarihi:");
		lblNewLabel_1_1_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(188, 77, 188, 27);
		panel_3.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Ebat:");
		lblNewLabel_1_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(188, 114, 188, 27);
		panel_3.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("A\u011F\u0131rl\u0131k:");
		lblNewLabel_1_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(188, 151, 188, 27);
		panel_3.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\u00DCcret:");
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(188, 189, 188, 27);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Adres:");
		lblNewLabel_1_2_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(188, 226, 188, 27);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("\u00D6deme T\u00FCr\u00FC:");
		lblNewLabel_1_4_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(188, 263, 188, 27);
		panel_3.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Teslim Durumu:");
		lblNewLabel_1_1_2_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_2_1.setBounds(188, 301, 188, 27);
		panel_3.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblNewLabel_1_2_2_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_2_1.setBounds(188, 338, 188, 27);
		panel_3.add(lblNewLabel_1_2_2_1);
		
		txt_kuryeNoEkle = new JTextField();
		txt_kuryeNoEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryeNoEkle.setColumns(10);
		txt_kuryeNoEkle.setBounds(382, 39, 188, 27);
		panel_3.add(txt_kuryeNoEkle);
		
		txt_gelisTarihEkle = new JTextField();
		txt_gelisTarihEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_gelisTarihEkle.setColumns(10);
		txt_gelisTarihEkle.setBounds(382, 77, 188, 27);
		panel_3.add(txt_gelisTarihEkle);
		
		txt_ebatEkle = new JTextField();
		txt_ebatEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_ebatEkle.setColumns(10);
		txt_ebatEkle.setBounds(382, 114, 188, 27);
		panel_3.add(txt_ebatEkle);
		
		txt_agirlikEkle = new JTextField();
		txt_agirlikEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_agirlikEkle.setColumns(10);
		txt_agirlikEkle.setBounds(382, 151, 188, 27);
		panel_3.add(txt_agirlikEkle);
		
		txt_ucretEkle = new JTextField();
		txt_ucretEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_ucretEkle.setColumns(10);
		txt_ucretEkle.setBounds(382, 188, 188, 27);
		panel_3.add(txt_ucretEkle);
		
		txt_adresEkle = new JTextField();
		txt_adresEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_adresEkle.setColumns(10);
		txt_adresEkle.setBounds(382, 226, 188, 27);
		panel_3.add(txt_adresEkle);
		
		txt_odemeEkle = new JTextField();
		txt_odemeEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_odemeEkle.setColumns(10);
		txt_odemeEkle.setBounds(382, 263, 188, 27);
		panel_3.add(txt_odemeEkle);
		
		txt_teslimdurumEkle = new JTextField();
		txt_teslimdurumEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_teslimdurumEkle.setColumns(10);
		txt_teslimdurumEkle.setBounds(382, 301, 188, 27);
		panel_3.add(txt_teslimdurumEkle);
		
		txt_musteriNoEkle = new JTextField();
		txt_musteriNoEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_musteriNoEkle.setColumns(10);
		txt_musteriNoEkle.setBounds(382, 338, 188, 27);
		panel_3.add(txt_musteriNoEkle);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnEkle.setBackground(new Color(255, 102, 51));
		btnEkle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//INSERT INTO kargo (KuryeID,GelisTarihi,KargoEbat,KargoAgirlik,KargoUcret,SiparisAdres,OdemeTuru,TeslimDurumu,MusteriID) VALUES(,'
				 String gelisTarihi,adresi,odemeTuru,teslimDurumu,ebat,SqlSorgu;
				 int kuryeNumarasi,agirlik,ucret,musteriNo;
				 kuryeNumarasi= txt_kuryeNoEkle.getCaretPosition();
				 gelisTarihi= txt_gelisTarihEkle.getText();
				 ebat=txt_ebatEkle.getText();
				 agirlik=txt_agirlikEkle.getCaretPosition();
			     ucret=txt_ucretEkle.getCaretPosition();
				 adresi= txt_adresEkle.getText();
				 odemeTuru=txt_odemeEkle.getText();
				 teslimDurumu=txt_teslimdurumEkle.getText();
				 musteriNo=txt_musteriNoEkle.getCaretPosition();
				 SqlSorgu="INSERT INTO kargo (KuryeID,GelisTarihi,KargoEbat,KargoAgirlik,KargoUcret,SiparisAdres,OdemeTuru,TeslimDurumu,MusteriID) VALUES("+
				 +kuryeNumarasi+","+"'"+gelisTarihi+"',"+"'"+ebat+"'"+","+agirlik+","+ucret+",'"+adresi+"',"+"'"+odemeTuru+"',"+"'"+teslimDurumu+"',"+musteriNo+")";
				 //System.out.println(SqlSorgu);
				 baglanti.ekle(SqlSorgu);  
				 
				 JOptionPane.showMessageDialog(btnEkle, "Ekleme iþlemi iþlemi Tamamlandý!");
			}
		});
		btnEkle.setBounds(661, 321, 110, 44);
		panel_3.add(btnEkle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kargo G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kargo Numaras\u0131:");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1.setBounds(186, 40, 188, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Geli\u015F Tarihi:");
		lblNewLabel_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(186, 191, 188, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ebat:");
		lblNewLabel_1_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(186, 229, 188, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("A\u011F\u0131rl\u0131k:");
		lblNewLabel_1_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(186, 267, 188, 27);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u00DCcret:");
		lblNewLabel_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(186, 153, 188, 27);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Adres:");
		lblNewLabel_1_2_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(186, 302, 188, 27);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u00D6deme T\u00FCr\u00FC:");
		lblNewLabel_1_4.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(186, 339, 188, 27);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Teslim Durumu:");
		lblNewLabel_1_1_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(186, 372, 188, 27);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblNewLabel_1_2_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(186, 77, 188, 27);
		panel.add(lblNewLabel_1_2_2);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_2.setBounds(380, 40, 188, 27);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_3.setColumns(10);
		textField_3.setBounds(380, 78, 188, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_4.setColumns(10);
		textField_4.setBounds(380, 115, 188, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_5.setColumns(10);
		textField_5.setBounds(380, 152, 188, 27);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_6.setColumns(10);
		textField_6.setBounds(380, 189, 188, 27);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_7.setColumns(10);
		textField_7.setBounds(380, 227, 188, 27);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_8.setColumns(10);
		textField_8.setBounds(380, 264, 188, 27);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_9.setColumns(10);
		textField_9.setBounds(380, 302, 188, 27);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_10.setColumns(10);
		textField_10.setBounds(380, 339, 188, 27);
		panel.add(textField_10);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnGncelle.setBackground(new Color(255, 102, 51));
		btnGncelle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				String KargoID,MusteriID,KuryeID,KargoUcret,GelisTarihi,KargoEbat,KargoAgirlik,SiparisAdres,OdemeTuru,TeslimDurumu,sql_sorgu;
			KargoID=textField_2.getText();
			MusteriID=textField_3.getText();
			KuryeID=textField_4.getText();
			KargoUcret=textField_5.getText();
			GelisTarihi=textField_6.getText();
			KargoEbat=textField_7.getText();
			KargoAgirlik=textField_8.getText();
			SiparisAdres=textField_9.getText();
			OdemeTuru=textField_10.getText();
			TeslimDurumu=textField_20.getText();
			
			sql_sorgu = "UPDATE kargo SET KargoID= "+KargoID+",MusteriID="+MusteriID+",KuryeID="+KuryeID+",KargoUcret="+KargoUcret+",GelisTarihi='"+GelisTarihi+"',KargoEbat='"+KargoEbat+"',KargoAgirlik="+KargoAgirlik+",SiparisAdres='"+SiparisAdres+"',OdemeTuru='"+OdemeTuru+"',TeslimDurumu='"+TeslimDurumu+"' WHERE KargoID="+KargoID;
			      System.out.println(sql_sorgu);
			baglanti.update(sql_sorgu);
			
			JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý!");
			
			}
		});   
		btnGncelle.setBounds(660, 359, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_6 = new JLabel("Kurye Numaras\u0131:");
		lblNewLabel_1_6.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(186, 115, 188, 27);
		panel.add(lblNewLabel_1_6);
		
		textField_20 = new JTextField();
		textField_20.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_20.setColumns(10);
		textField_20.setBounds(380, 376, 188, 27);
		panel.add(textField_20);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kargo Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_kargoidsorgula = new JTextField();
		text_kargoidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_kargoidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_kargoidsorgula.setColumns(10);
		text_kargoidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_kargoidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("Kargo Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(201, 26, 200, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personelkargomodelim.setRowCount(0);
				
				String id2 = text_kargoidsorgula.getText();
				int id3 = Integer.parseInt(id2);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from kargo where KargoID= "+ id3 + "";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar10[0] = myRs.getString("MusteriID");
								satirlar10[1] = myRs.getString("KuryeID");
								satirlar10[2] = myRs.getString("KargoUcret");
								satirlar10[3] = myRs.getString("KargoEbat");
								satirlar10[4] = myRs.getString("KargoAgirlik");
								satirlar10[5] = myRs.getString("OdemeTuru");
								satirlar10[6] = myRs.getString("GelisTarihi");
								satirlar10[7] = myRs.getString("SiparisAdres");
								satirlar10[8] = myRs.getString("TeslimDurumu");
							
								personelkargomodelim.addRow(satirlar10);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(personelkargomodelim);
			}
		});
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(32, 168, 911, 251);
		panel_1.add(scrollPane);
		
		table = new JTable();
		personelkargomodelim.setColumnIdentifiers(kolonlar10);
		table.setModel(personelkargomodelim);
		table.setBounds(445, 189, 311, 163);
		scrollPane.setViewportView(table);
		//panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kargo Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		txt_no = new JTextField();
		txt_no.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_no.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		txt_no.setColumns(10);
		txt_no.setBounds(496, 127, 255, 51);
		panel_2.add(txt_no);
		
		JLabel lblKargoNumaras_1 = new JLabel("Silinecek Kargo Numaras\u0131:");
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
				
				sql_sil = "DELETE FROM kargo WHERE KargoID ="+noo;
				
				
				baglanti.sil(sql_sil);
				
				JOptionPane.showMessageDialog(btnNewButton_1, "Silme iþlemi iþlemi Tamamlandý!");
				
			}
		});
		btnNewButton_1.setBounds(549, 232, 110, 44);
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
		btnNewButton_1_1.setBounds(933, 616, 85, 40);
		w_pane.add(btnNewButton_1_1);
	}
}
