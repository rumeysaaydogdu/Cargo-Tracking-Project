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
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class PersonelKurye extends JFrame {

	private JPanel w_pane;
	private JTextField text_kuryeidsorgula;
	private JTextField txt_no;
	private JTable table;
	private JTextField textField_3;
	private JTextField txt_kuryeAdEkle;
	private JTextField txt_kuryeSoyadEkle;
	private JTextField txt_kuryeCinsiyetEkle;
	private JTextField txt_isebaslamatarihEkle;
	private JTextField txt_kuryepuanEkle;
	private JTextField txt_kuryeSifreEkle;
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
					PersonelKurye frame = new PersonelKurye();
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
	public PersonelKurye() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		DefaultTableModel personelkuryemodelim = new DefaultTableModel();
		
		 Object[] kolonlar9 ={"Kurye Ad", "Kurye Soyad", "Kurye Cinsiyet", "Ýþe Baþlama Tarihi","Kurye Puan"};
		 Object[] satirlar9 = new Object[5];
		
		JLabel lblNewLabel = new JLabel("Kurye");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel.setBounds(71, 30, 167, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_3.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kurye Ekle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Kurye Ad\u0131:");
		lblNewLabel_1_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(190, 79, 188, 27);
		panel_3.add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Kurye Soyad\u0131:");
		lblNewLabel_1_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(190, 116, 188, 27);
		panel_3.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Kurye Cinsiyeti");
		lblNewLabel_1_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(190, 154, 188, 27);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("\u0130\u015Fe Ba\u015Flama Tarihi:");
		lblNewLabel_1_2_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(190, 191, 188, 27);
		panel_3.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Kurye Puan\u0131:");
		lblNewLabel_1_4_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(190, 228, 188, 27);
		panel_3.add(lblNewLabel_1_4_1);
		
		txt_kuryeAdEkle = new JTextField();
		txt_kuryeAdEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryeAdEkle.setColumns(10);
		txt_kuryeAdEkle.setBounds(384, 79, 188, 27);
		panel_3.add(txt_kuryeAdEkle);
		
		txt_kuryeSoyadEkle = new JTextField();
		txt_kuryeSoyadEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryeSoyadEkle.setColumns(10);
		txt_kuryeSoyadEkle.setBounds(384, 116, 188, 27);
		panel_3.add(txt_kuryeSoyadEkle);
		
		txt_kuryeCinsiyetEkle = new JTextField();
		txt_kuryeCinsiyetEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryeCinsiyetEkle.setColumns(10);
		txt_kuryeCinsiyetEkle.setBounds(384, 153, 188, 27);
		panel_3.add(txt_kuryeCinsiyetEkle);
		
		txt_isebaslamatarihEkle = new JTextField();
		txt_isebaslamatarihEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_isebaslamatarihEkle.setColumns(10);
		txt_isebaslamatarihEkle.setBounds(384, 191, 188, 27);
		panel_3.add(txt_isebaslamatarihEkle);
		
		txt_kuryepuanEkle = new JTextField();
		txt_kuryepuanEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryepuanEkle.setText("0");
		txt_kuryepuanEkle.setColumns(10);
		txt_kuryepuanEkle.setBounds(384, 228, 188, 27);
		panel_3.add(txt_kuryepuanEkle);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnEkle.setBackground(new Color(255, 102, 51));
		btnEkle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT INTO kurye (KuryeAd,KuryeSoyad,Cinsiyet,IseBaslamaTarihi,Puan,KuryeSifre) VALUES(3,'
				 String kuryeAdý,kuryeSoyadý,kuryecinsiyeti,isebaslama,kuryesifre,SqlSorgu;
				 int kuryepuaný;
				 kuryeAdý= txt_kuryeAdEkle.getText();
				 kuryeSoyadý= txt_kuryeSoyadEkle.getText();
				 kuryecinsiyeti=txt_kuryeCinsiyetEkle.getText();
				 isebaslama=txt_isebaslamatarihEkle.getText();
				 kuryepuaný= txt_kuryepuanEkle.getCaretPosition();
				 kuryesifre =txt_kuryeSifreEkle.getText();
				 SqlSorgu="INSERT INTO kurye (KuryeAd,KuryeSoyad,Cinsiyet,IseBaslamaTarihi,Puan,KuryeSifre) VALUES("+
				 "'"+kuryeAdý+"',"+"'"+kuryeSoyadý+"',"+"'"+kuryecinsiyeti+"',"+"'"+isebaslama+"',"+kuryepuaný+",'"+kuryesifre+"')";
				 //System.out.println(SqlSorgu);
				 baglanti.ekle(SqlSorgu); 
				 
				 JOptionPane.showMessageDialog(btnEkle, "Ekleme iþlemi iþlemi Tamamlandý!");
				 
			}
		});
		btnEkle.setBounds(643, 271, 110, 44);
		panel_3.add(btnEkle);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Kurye \u015Eifresi:");
		lblNewLabel_1_2_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1.setBounds(190, 264, 188, 27);
		panel_3.add(lblNewLabel_1_2_3_1);
		
		txt_kuryeSifreEkle = new JTextField();
		txt_kuryeSifreEkle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_kuryeSifreEkle.setColumns(10);
		txt_kuryeSifreEkle.setBounds(384, 264, 188, 27);
		panel_3.add(txt_kuryeSifreEkle);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kurye G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kurye Numaras\u0131:");
		lblNewLabel_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(174, 78, 188, 27);
		panel.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_3.setColumns(10);
		textField_3.setBounds(380, 78, 188, 27);
		panel.add(textField_3);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBackground(new Color(255, 102, 51));
		btnGncelle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnGncelle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String KuryeID,Puan,IseBaslamaTarihi,Cinsiyet,KuryeSifre,KuryeAd,KuryeSoyad,sql_sorgu;
				KuryeID=textField_3.getText();
				Puan=textField_4.getText();
				IseBaslamaTarihi=textField_5.getText();
				Cinsiyet=textField_6.getText();
				KuryeSifre=textField_7.getText();
				KuryeAd=textField_8.getText();
				KuryeSoyad=textField_9.getText();
				sql_sorgu = "UPDATE kurye SET KuryeID="+KuryeID+",Puan="+Puan+",IseBaslamaTarihi='"+IseBaslamaTarihi+"',Cinsiyet='"+Cinsiyet+"',KuryeSifre='"+KuryeSifre+"',KuryeAd='"+KuryeAd+"',KuryeSoyad='"+KuryeSoyad+"' WHERE KuryeID="+KuryeID;
				  System.out.println(sql_sorgu);
					baglanti.update(sql_sorgu);	
					
					JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý!");
					
			}
		});
		btnGncelle.setBounds(659, 285, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_2_3_2 = new JLabel("Kurye Ad\u0131:");
		lblNewLabel_1_2_3_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_2.setBounds(174, 266, 188, 27);
		panel.add(lblNewLabel_1_2_3_2);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Kurye Soyad\u0131:");
		lblNewLabel_1_3_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3_1_1.setBounds(174, 302, 188, 27);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Kurye Cinsiyeti:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(174, 191, 188, 27);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("\u0130\u015Fe Ba\u015Flama Tarihi:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(174, 154, 188, 27);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Kurye Puan\u0131:");
		lblNewLabel_1_4_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4_1_1.setBounds(174, 116, 188, 27);
		panel.add(lblNewLabel_1_4_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_4.setColumns(10);
		textField_4.setBounds(380, 117, 188, 27);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_5.setColumns(10);
		textField_5.setBounds(380, 154, 188, 27);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_6.setColumns(10);
		textField_6.setBounds(380, 191, 188, 27);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_7.setColumns(10);
		textField_7.setBounds(380, 229, 188, 27);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_8.setColumns(10);
		textField_8.setBounds(380, 266, 188, 27);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("Kurye \u015Eifresi:");
		lblNewLabel_1_2_3_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1_1.setBounds(174, 228, 188, 27);
		panel.add(lblNewLabel_1_2_3_1_1);
		
		textField_9 = new JTextField();
		textField_9.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_9.setColumns(10);
		textField_9.setBounds(380, 302, 188, 27);
		panel.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kurye Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_kuryeidsorgula = new JTextField();
		text_kuryeidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_kuryeidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_kuryeidsorgula.setColumns(10);
		text_kuryeidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_kuryeidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("Kurye Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(201, 26, 200, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personelkuryemodelim.setRowCount(0);
				
				
				
				String kuryeid = text_kuryeidsorgula.getText();
				int kuryeid1 = Integer.parseInt(kuryeid);
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from kurye where KuryeID= " + kuryeid1 + " ";
				
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar9[0] = myRs.getString("KuryeAd");
								satirlar9[1] = myRs.getString("KuryeSoyad");
								satirlar9[2] = myRs.getString("Cinsiyet");
								satirlar9[3] = myRs.getString("IseBaslamaTarihi");
								satirlar9[4] = myRs.getString("Puan");
								personelkuryemodelim.addRow(satirlar9);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(personelkuryemodelim);
				
				}
			
		});
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(32, 168, 911, 251);
		panel_1.add(scrollPane);
		
		table = new JTable();
		personelkuryemodelim.setColumnIdentifiers(kolonlar9);
		table.setModel(personelkuryemodelim);
		table.setBounds(445, 189, 311, 163);
		scrollPane.setViewportView(table);
		//panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kurye Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		txt_no = new JTextField();
		txt_no.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_no.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		txt_no.setColumns(10);
		txt_no.setBounds(496, 127, 255, 51);
		panel_2.add(txt_no);
		
		JLabel lblKargoNumaras_1 = new JLabel("Silinecek Kurye Numaras\u0131:");
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
				
				sql_sil = "DELETE FROM kurye WHERE KuryeID ="+noo;
				
				
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
		btnNewButton_1_1.setBounds(925, 621, 99, 35);
		w_pane.add(btnNewButton_1_1);
	}
}
