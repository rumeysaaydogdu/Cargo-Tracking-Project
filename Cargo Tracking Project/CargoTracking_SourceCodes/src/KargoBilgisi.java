import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class KargoBilgisi extends JFrame {

	private JPanel contentPane;
	private JTextField text_kargoidsorgula;
	private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	 Object[] kolonlar ={"Müþteri Numarasý", "Kurye Numarasý", "Kargo Ücreti", "Geliþ Tarihi", "Kargo Ebatý", "Kargo Aðýrlýðý", "Sipariþ Adresi", "Ödeme Türü", "Teslim Durumu"};
	 Object[] satirlar = new Object[9];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KargoBilgisi frame = new KargoBilgisi();
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
	public KargoBilgisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1053, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_kargoidsorgula = new JTextField();
		text_kargoidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_kargoidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_kargoidsorgula.setColumns(10);
		text_kargoidsorgula.setBounds(481, 60, 255, 51);
		contentPane.add(text_kargoidsorgula);
		
		JLabel lblKargoNumaras = new JLabel("Kargo Numaras\u0131:");
		lblKargoNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblKargoNumaras.setBounds(237, 63, 200, 44);
		contentPane.add(lblKargoNumaras);
		
    	JButton btnNewButton = new JButton("Görüntüle");
    	btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
    	btnNewButton.setBackground(new Color(255, 102, 51));
    	btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
modelim.setRowCount(0);
				
				String id2 = text_kargoidsorgula.getText();
				int id3 = Integer.parseInt(id2);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from kargo where KargoID= "+ id3 + "";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar[0] = myRs.getString("MusteriID");
								satirlar[1] = myRs.getString("KuryeID");
								satirlar[2] = myRs.getString("KargoUcret");
								satirlar[3] = myRs.getString("GelisTarihi");
								satirlar[4] = myRs.getString("KargoEbat");
								satirlar[5] = myRs.getString("KargoAgirlik");
								satirlar[6] = myRs.getString("SiparisAdres");
								satirlar[7] = myRs.getString("OdemeTuru");
								satirlar[8] = myRs.getString("TeslimDurumu");
								modelim.addRow(satirlar);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			
				
			
				
				}
		}); 
		btnNewButton.setBounds(626, 133, 110, 44);
		contentPane.add(btnNewButton); 
		
		JScrollPane scrollPane = new JScrollPane(); 
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(59, 208, 957, 208);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		table.setModel(modelim);
		table.setBounds(45, 117, 148, 74);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(935, 426, 94, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("renk1.gif")));
		lblNewLabel.setBounds(0, -29, 1037, 497);
		contentPane.add(lblNewLabel);
		
		
		//contentPane.add(table);
	}
}