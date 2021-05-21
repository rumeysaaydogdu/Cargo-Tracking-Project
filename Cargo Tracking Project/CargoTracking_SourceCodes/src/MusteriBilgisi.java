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
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class MusteriBilgisi extends JFrame {

	private JPanel contentPane;
	private JTextField text_musteriidsorgula;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusteriBilgisi frame = new MusteriBilgisi();
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
	public MusteriBilgisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel musterimodelim = new DefaultTableModel();
		
		 Object[] kolonlar7 ={"Müþteri TC", "Müþteri Ad", "Müþteri Soyad", "Müþteri Email","Müþteri Telefon", "Kargo Takip No","Müþteri Adres"};
		 Object[] satirlar7 = new Object[7];
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(63, 226, 613, 176);
		contentPane.add(scrollPane);
		
		text_musteriidsorgula = new JTextField();
		text_musteriidsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_musteriidsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_musteriidsorgula.setColumns(10);
		text_musteriidsorgula.setBounds(347, 83, 255, 51);
		contentPane.add(text_musteriidsorgula);
		
		JLabel lblMteriNumaras = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblMteriNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblMteriNumaras.setBounds(103, 86, 217, 44);
		contentPane.add(lblMteriNumaras);
		
		JButton btnNewButton = new JButton("Görüntüle");
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
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
		btnNewButton.setBounds(413, 157, 110, 44);
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
		btnNewButton_1.setBounds(618, 421, 93, 32);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		musterimodelim.setColumnIdentifiers(kolonlar7);
		table.setModel(musterimodelim);
		table.setBounds(33, 107, 121, 85);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("renk1.gif")));
		lblNewLabel.setBounds(-12, -28, 746, 489);
		contentPane.add(lblNewLabel);
		//contentPane.add(table);
	}

}
