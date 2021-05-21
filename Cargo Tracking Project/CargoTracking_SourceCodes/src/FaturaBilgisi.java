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
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class FaturaBilgisi extends JFrame {

	private JPanel contentPane;
	private JTextField text_idsorgula;
	private JTable table;
	
	DefaultTableModel modelim1 = new DefaultTableModel();
	
	 Object[] kolonlar1 ={"Sipariþ Adresi", "Toplam Tutar", "Sipariþ Tarihi"};
	 Object[] satirlar1 = new Object[3];
	 private final JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("renk1.gif")));
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaturaBilgisi frame = new FaturaBilgisi();
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
	public FaturaBilgisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_idsorgula = new JTextField();
		text_idsorgula.setBorder(new LineBorder(new Color(153, 102, 204)));
		text_idsorgula.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		text_idsorgula.setColumns(10);
		text_idsorgula.setBounds(341, 71, 255, 51);
		contentPane.add(text_idsorgula);
		
		JLabel lblFaturaNumaras = new JLabel("Fatura Numaras\u0131:");
		lblFaturaNumaras.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblFaturaNumaras.setBounds(119, 79, 200, 44);
		contentPane.add(lblFaturaNumaras);
		
		JButton btnNewButton = new JButton("Görüntüle");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim1.setRowCount(0);
				
				String id2 = text_idsorgula.getText();
				int id3 = Integer.parseInt(id2);  //string text kutusunu int koycaðýmýz için çevirdik.
				ResultSet myRs = null;
				String sql_sorgu = "select * from fatura where FaturaID= "+ id3 + "";
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()) {
						
								satirlar1[0] = myRs.getString("FaturaAdres");
								satirlar1[1] = myRs.getString("ToplamTutar");
								satirlar1[2] = myRs.getString("SiparisTarihi");
							
								modelim1.addRow(satirlar1);
					
					}
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				
				table.setModel(modelim1);
				
			}
			
		});
		btnNewButton.setBounds(488, 137, 108, 51);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(192, 192, 192));
		scrollPane.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		scrollPane.setBounds(58, 216, 610, 183);
		contentPane.add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(607, 410, 95, 40);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.setBorder(null);
		table.setBackground(new Color(192, 192, 192));
		modelim1.setColumnIdentifiers(kolonlar1);
		table.setBounds(27, 95, 117, 94);
		scrollPane.setViewportView(table);
		lblNewLabel.setBounds(0, -32, 734, 493);
		contentPane.add(lblNewLabel);
		
	
		//contentPane.add(table);
		
	}
}
