import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class KuryeKargo extends JFrame {

	private JPanel w_pane;
	private JTextField text_korgoidsorgula;
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
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuryeKargo frame = new KuryeKargo();
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
	public KuryeKargo() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		DefaultTableModel kuryekagomodelim = new DefaultTableModel();
		
		 Object[] kolonlar13 ={"Müþteri Numarasý", "Kurye Numarasý", "Kargo Ücreti", "Kargo Ebatý", "Kargo Aðýrlýðý", "Ödeme Türü", "Geliþ Tarihi","Sipariþ Adresi","Teslim Durumu"};
		 Object[] satirlar13 = new Object[9];
		
		
		JLabel lblNewLabel = new JLabel("Kargo");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel.setBounds(71, 30, 109, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		tabbedPane.addTab("Kargo G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kargo Numaras\u0131:");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1.setBounds(182, 35, 188, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Geli\u015F Tarihi:");
		lblNewLabel_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(182, 189, 188, 27);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ebat:");
		lblNewLabel_1_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(182, 227, 188, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("A\u011F\u0131rl\u0131k:");
		lblNewLabel_1_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(182, 265, 188, 27);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u00DCcret:");
		lblNewLabel_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(182, 151, 188, 27);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Adres:");
		lblNewLabel_1_2_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(182, 303, 188, 27);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u00D6deme T\u00FCr\u00FC:");
		lblNewLabel_1_4.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(182, 341, 188, 27);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Teslim Durumu:");
		lblNewLabel_1_1_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(182, 376, 188, 27);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblNewLabel_1_2_2.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_2.setBounds(182, 78, 188, 27);
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
			public void actionPerformed(ActionEvent e) {
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
				TeslimDurumu=textField_11.getText();
				
				sql_sorgu = "UPDATE kargo SET KargoID= "+KargoID+",MusteriID="+MusteriID+",KuryeID="+KuryeID+",KargoUcret="+KargoUcret+",GelisTarihi='"+GelisTarihi+"',KargoEbat='"+KargoEbat+"',KargoAgirlik="+KargoAgirlik+",SiparisAdres='"+SiparisAdres+"',OdemeTuru='"+OdemeTuru+"',TeslimDurumu='"+TeslimDurumu+"' WHERE KargoID="+KargoID;
				      System.out.println(sql_sorgu);
				baglanti.update(sql_sorgu);
				
				JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý");
			}
		});
		btnGncelle.setBounds(661, 359, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_6 = new JLabel("Kurye Numaras\u0131:");
		lblNewLabel_1_6.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(182, 116, 188, 27);
		panel.add(lblNewLabel_1_6);
		
		textField_11 = new JTextField();
		textField_11.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_11.setColumns(10);
		textField_11.setBounds(380, 376, 188, 27);
		panel.add(textField_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		tabbedPane.addTab("Kargo Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_korgoidsorgula = new JTextField();
		text_korgoidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_korgoidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_korgoidsorgula.setColumns(10);
		text_korgoidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_korgoidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("Kargo Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(201, 26, 200, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kuryekagomodelim.setRowCount(0);
				
				
				
				String id = text_korgoidsorgula.getText();
				int id1 = Integer.parseInt(id);
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from kargo where KargoID= " + id1 + " ";
				
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar13[0] = myRs.getString("MusteriID");
								satirlar13[1] = myRs.getString("KuryeID");
								satirlar13[2] = myRs.getString("KargoUcret");
								satirlar13[3] = myRs.getString("KargoEbat");
								satirlar13[4] = myRs.getString("KargoAgirlik");
								satirlar13[5] = myRs.getString("OdemeTuru");
								satirlar13[6] = myRs.getString("GelisTarihi");
								satirlar13[7] = myRs.getString("SiparisAdres");
								satirlar13[8] = myRs.getString("TeslimDurumu");
								kuryekagomodelim.addRow(satirlar13);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(kuryekagomodelim);
			}
		});
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(32, 168, 911, 251);
		panel_1.add(scrollPane);
		
		table = new JTable();
		kuryekagomodelim.setColumnIdentifiers(kolonlar13);
		table.setModel(kuryekagomodelim);
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
		lblKargoNumaras_1.setBounds(148, 128, 322, 59);
		panel_2.add(lblKargoNumaras_1);
		
		JButton ButtonSil = new JButton("Sil"); //silme by RUM
		ButtonSil.setBackground(new Color(153, 102, 204));
		ButtonSil.setBorder(null);
		ButtonSil.setFont(new Font("Cambria Math", Font.BOLD, 20));
		ButtonSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no, sql_sil;
				
			    no = txt_no.getText();
			    int noo = Integer.parseInt(no);
				
				sql_sil = "DELETE FROM kargo WHERE KargoID ="+noo;
				
				
				baglanti.sil(sql_sil);
				
				JOptionPane.showMessageDialog(ButtonSil, "Silinme iþlemi Tamamlandý");
				
			}
		}); //silme by RUM
		ButtonSil.setBounds(568, 217, 110, 44);
		panel_2.add(ButtonSil);
		
		JButton btnNewButton_1_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(930, 611, 93, 32);
		w_pane.add(btnNewButton_1_1);
	}
}
