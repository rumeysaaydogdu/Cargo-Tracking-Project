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

public class PersonelSube extends JFrame {

	private JPanel w_pane;
	private JTextField text_subeidsorgula;
	private JTextField txt_no;
	private JTable table;
	private JTextField txt_subeadýekle;
	private JTextField txt_subetelekle;
	private JTextField txt_subeadresekle;
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
					PersonelSube frame = new PersonelSube();
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
	public PersonelSube() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 696);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);

		DefaultTableModel modelim4 = new DefaultTableModel();
		
		 Object[] kolonlar4 ={"Þube Telefonu", "Þube Adresi", "Sube Adý"};
		 Object[] satirlar4 = new Object[3];
		
		JLabel lblNewLabel = new JLabel("\u015Eube");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel.setBounds(85, 30, 104, 64);
		w_pane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 121, 979, 473);
		w_pane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_3.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("\u015Eube Ekle", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u015Eube Ad\u0131:");
		lblNewLabel_1_5.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(189, 140, 188, 27);
		panel_3.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("\u015Eube Telefonu:");
		lblNewLabel_1_1_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_3.setBounds(189, 178, 188, 27);
		panel_3.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("\u015Eube Adresi:");
		lblNewLabel_1_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3.setBounds(189, 215, 188, 27);
		panel_3.add(lblNewLabel_1_2_3);
		
		txt_subeadýekle = new JTextField();
		txt_subeadýekle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_subeadýekle.setColumns(10);
		txt_subeadýekle.setBounds(383, 140, 188, 27);
		panel_3.add(txt_subeadýekle);
		
		txt_subetelekle = new JTextField();
		txt_subetelekle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_subetelekle.setColumns(10);
		txt_subetelekle.setBounds(383, 178, 188, 27);
		panel_3.add(txt_subetelekle);
		
		txt_subeadresekle = new JTextField();
		txt_subeadresekle.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_subeadresekle.setColumns(10);
		txt_subeadresekle.setBounds(383, 215, 188, 27);
		panel_3.add(txt_subeadresekle);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnEkle.setBackground(new Color(255, 102, 51));
		btnEkle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				//INSERT INTO sube (SubeAd,SubeTelefon,SubeAdres) VALUES(2,'
				 String sad,stel,sadres,SqlSorgu;
				 sad=txt_subeadýekle.getText();
				 stel=txt_subetelekle.getText();
				 sadres=txt_subeadresekle.getText();
				 SqlSorgu="INSERT INTO sube (SubeAd,SubeTelefon,SubeAdres) VALUES("+
				 "'"+sad+"',"+"'"+stel+"',"+"'"+sadres+"')";
				 //System.out.println(SqlSorgu);
				 baglanti.ekle(SqlSorgu);
				
				 JOptionPane.showMessageDialog(btnEkle, "Ekleme iþlemi iþlemi Tamamlandý!");
				 
			}
		});
		btnEkle.setBounds(639, 243, 110, 44);
		panel_3.add(btnEkle);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setFont(new Font("Cambria Math", Font.BOLD, 15));
		tabbedPane.addTab("\u015Eube G\u00FCncelle", null, panel, null);
		panel.setLayout(null);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnGncelle.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnGncelle.setBackground(new Color(255, 102, 51));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SubeID,SubeTelefon,SubeAdres,SubeAd,sql_sorgu;
			    SubeID=textField_2.getText();
				SubeTelefon=textField_3.getText();
				SubeAdres=textField_4.getText();
				SubeAd=textField_5.getText();
				
				sql_sorgu = "UPDATE sube SET SubeID="+SubeID+",SubeTelefon="+SubeTelefon+",SubeAdres='"+SubeAdres+"',SubeAd='"+SubeAd+"' WHERE SubeID="+SubeID;
				  System.out.println(sql_sorgu);
					baglanti.update(sql_sorgu);	
					
					JOptionPane.showMessageDialog(btnGncelle, "Güncelleme iþlemi iþlemi Tamamlandý!");
					
			}
		});
		btnGncelle.setBounds(641, 236, 110, 44);
		panel.add(btnGncelle);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("\u015Eube Ad\u0131:");
		lblNewLabel_1_5_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(192, 218, 188, 27);
		panel.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("\u015Eube Telefonu:");
		lblNewLabel_1_1_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_1_3_1.setBounds(192, 143, 188, 27);
		panel.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("\u015Eube Adresi:");
		lblNewLabel_1_2_3_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_2_3_1.setBounds(192, 180, 188, 27);
		panel.add(lblNewLabel_1_2_3_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_2.setColumns(10);
		textField_2.setBounds(386, 106, 188, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_3.setColumns(10);
		textField_3.setBounds(386, 143, 188, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_4.setColumns(10);
		textField_4.setBounds(386, 186, 188, 27);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("\u015Eube Numaras\u0131:");
		lblNewLabel_1_5_1_1.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel_1_5_1_1.setBounds(192, 106, 188, 27);
		panel.add(lblNewLabel_1_5_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(153, 102, 204)));
		textField_5.setColumns(10);
		textField_5.setBounds(386, 223, 188, 27);
		panel.add(textField_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("\u015Eube Bilgisi", null, panel_1, null);
		panel_1.setLayout(null);
		
		text_subeidsorgula = new JTextField();
		text_subeidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_subeidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_subeidsorgula.setColumns(10);
		text_subeidsorgula.setBounds(445, 23, 255, 51);
		panel_1.add(text_subeidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("\u015Eube Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(201, 26, 200, 44);
		panel_1.add(lblKargoNumaras);
		
		JButton btnNewButton = new JButton("G\u00F6r\u00FCnt\u00FCle");
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
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.setBounds(521, 97, 110, 44);
		panel_1.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(135, 168, 771, 202);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(255, 102, 51)));
		modelim4.setColumnIdentifiers(kolonlar4);
		table.setModel(modelim4);
		table.setBounds(445, 189, 311, 163);
		scrollPane.setViewportView(table);
		//panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		tabbedPane.addTab("\u015Eube Sil", null, panel_2, null);
		panel_2.setLayout(null);
		
		txt_no = new JTextField();
		txt_no.setBorder(new LineBorder(new Color(153, 102, 204)));
		txt_no.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		txt_no.setColumns(10);
		txt_no.setBounds(496, 127, 255, 51);
		panel_2.add(txt_no);
		
		JLabel lblKargoNumaras_1 = new JLabel("Silinecek \u015Eube Numaras\u0131:");
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
				
				sql_sil = "DELETE FROM sube WHERE SubeID ="+noo;
				
				
				baglanti.sil(sql_sil);
				
				JOptionPane.showMessageDialog(btnNewButton_1, "Silme iþlemi iþlemi Tamamlandý!");
				
			}
		});
		btnNewButton_1.setBounds(549, 232, 110, 44);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(930, 604, 93, 32);
		w_pane.add(btnNewButton_1_1);
	}
}
