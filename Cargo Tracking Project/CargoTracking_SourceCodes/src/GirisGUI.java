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
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class GirisGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_musteriNo;
	private JTextField fld_personelNo;
	private JTextField fld_personelSifre;
	private JTextField fld_kuryeNo;
	private JTextField fld_kuryeSifre;
	static String personelNo;
	static String personelSifre;
	static String kuryeNo;
	static String kuryeSifre;
	static String musteriNo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisGUI frame = new GirisGUI();
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
	public GirisGUI() {
		setResizable(false);
		setTitle("Kargo Takip Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1042, 520);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(204, 204, 255));
		w_pane.setBorder(null);
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("tenor.gif")));
		lbl_logo.setBounds(20, 125, 445, 250);
		w_pane.add(lbl_logo);
		
		JLabel lblNewLabel = new JLabel("Kargo Takip Sistemi");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 22, 464, 104);
		w_pane.add(lblNewLabel);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBackground(new Color(255, 255, 255));
		w_tabpane.setBorder(null);
		w_tabpane.setBounds(479, 181, 539, 194);
		w_pane.add(w_tabpane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel.setBackground(new Color(192, 192, 192));
		w_tabpane.addTab("Müþteri", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblMteriNumaras = new JLabel("M\u00FC\u015Fteri Numaras\u0131:");
		lblMteriNumaras.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblMteriNumaras.setBounds(48, 36, 174, 34);
		panel.add(lblMteriNumaras);
		
		fld_musteriNo = new JTextField();
		fld_musteriNo.setBorder(new LineBorder(new Color(153, 102, 204)));
		fld_musteriNo.setBounds(227, 38, 202, 28);
		panel.add(fld_musteriNo);
		fld_musteriNo.setColumns(10);
		
		JButton btn_musteriGiris = new JButton("Giri\u015F Yap");
		btn_musteriGiris.setBackground(new Color(255, 102, 51));
		btn_musteriGiris.setForeground(new Color(0, 0, 0));
		btn_musteriGiris.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btn_musteriGiris.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, new Color(153, 102, 204)));
		btn_musteriGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				musteriNo = fld_musteriNo.getText();
				
				String sql_sorgu= "select count(MusteriID) as GirisGUI from musteri where MusteriID="+musteriNo+"";
				
				ResultSet myRs = baglanti.yap1();
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()){
						if(myRs.getInt("GirisGUI")==1) {
							MusteriGUI musteri = new MusteriGUI();
							musteri.setVisible(true);
							setVisible(false);
						}else {
							btn_musteriGiris.setText("Hatalý giriþ");
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btn_musteriGiris.setBounds(209, 101, 105, 34);
		panel.add(btn_musteriGiris);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_1.setBackground(new Color(192, 192, 192));
		w_tabpane.addTab("Personel", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPersonelNumaras = new JLabel("Personel Numaras\u0131:");
		lblPersonelNumaras.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblPersonelNumaras.setBounds(73, 35, 173, 27);
		panel_1.add(lblPersonelNumaras);
		
		JLabel lblifre = new JLabel("\u015Eifre:");
		lblifre.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblifre.setBounds(73, 77, 63, 27);
		panel_1.add(lblifre);
		
		fld_personelNo = new JTextField();
		fld_personelNo.setBorder(new LineBorder(new Color(153, 102, 204)));
		fld_personelNo.setBounds(256, 37, 161, 19);
		panel_1.add(fld_personelNo);
		fld_personelNo.setColumns(10);
		
		fld_personelSifre = new JTextField();
		fld_personelSifre.setBorder(new LineBorder(new Color(153, 102, 204)));
		fld_personelSifre.setBounds(256, 79, 161, 19);
		panel_1.add(fld_personelSifre);
		fld_personelSifre.setColumns(10);
		
		JButton btn_musteriGiris_1 = new JButton("Giri\u015F Yap");
		btn_musteriGiris_1.setBackground(new Color(255, 102, 51));
		btn_musteriGiris_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btn_musteriGiris_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btn_musteriGiris_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    personelNo= fld_personelNo.getText();
				personelSifre= fld_personelSifre.getText();
				
				
				String sql_sorgu= "select count(PersonelID) as GirisGUI from personel where PersonelID="+personelNo+" and PersonelSifre='"+personelSifre+"'";
				
				ResultSet myRs = baglanti.yap();
				myRs = baglanti.sorgula(sql_sorgu);
				
				try {
					while(myRs.next()){
						if(myRs.getInt("GirisGUI")==1) {
							PersonelGUI personel = new PersonelGUI();
							personel.setVisible(true);
							setVisible(false);
						}else {
							btn_musteriGiris_1.setText("Hatalý giriþ");
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btn_musteriGiris_1.setBounds(211, 109, 105, 34);
		panel_1.add(btn_musteriGiris_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		panel_2.setBackground(new Color(192, 192, 192));
		w_tabpane.addTab("Kurye", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblMteriNumaras_1_1 = new JLabel("Kurye Numaras\u0131:");
		lblMteriNumaras_1_1.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblMteriNumaras_1_1.setBounds(76, 40, 158, 27);
		panel_2.add(lblMteriNumaras_1_1);
		
		JLabel lblMteriNumaras_1_1_1 = new JLabel("\u015Eifre:");
		lblMteriNumaras_1_1_1.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblMteriNumaras_1_1_1.setBounds(76, 78, 60, 27);
		panel_2.add(lblMteriNumaras_1_1_1);
		
		fld_kuryeNo = new JTextField();
		fld_kuryeNo.setBorder(new LineBorder(new Color(153, 102, 204)));
		fld_kuryeNo.setBounds(244, 44, 183, 19);
		panel_2.add(fld_kuryeNo);
		fld_kuryeNo.setColumns(10);
		
		fld_kuryeSifre = new JTextField();
		fld_kuryeSifre.setBorder(new LineBorder(new Color(153, 102, 204)));
		fld_kuryeSifre.setBounds(244, 85, 183, 19);
		panel_2.add(fld_kuryeSifre);
		fld_kuryeSifre.setColumns(10);
		
		JButton btn_musteriGiris_2 = new JButton("Giri\u015F Yap");
		btn_musteriGiris_2.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btn_musteriGiris_2.setBackground(new Color(255, 102, 51));
		btn_musteriGiris_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btn_musteriGiris_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			kuryeNo = fld_kuryeNo.getText();
			kuryeSifre = fld_kuryeSifre.getText();
			 
			String sql_sorgu= "select count(KuryeID) as GirisGUI from kurye where KuryeID="+kuryeNo+" and KuryeSifre='"+kuryeSifre+"'";
			
			ResultSet myRs = baglanti.yap2();
			myRs = baglanti.sorgula(sql_sorgu);
			
			
			try {
				while(myRs.next()){
					if(myRs.getInt("GirisGUI")==1) {
						KuryeGUI kurye = new KuryeGUI();
						kurye.setVisible(true);
						setVisible(false);
					}else {
						btn_musteriGiris_2.setText("Hatalý giriþ");
					}
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				
			
			}
		});
		btn_musteriGiris_2.setBounds(202, 115, 105, 34);
		panel_2.add(btn_musteriGiris_2);
		
		JLabel lblNewLabel_1 = new JLabel("built on Eclipse");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(47, 407, 142, 40);
		w_pane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Hakk\u0131m\u0131zda");
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HakkimizdaGUI hakkimizda = new HakkimizdaGUI();
				hakkimizda.setVisible(true);
			}
		});
		btnNewButton.setBounds(873, 22, 129, 40);
		w_pane.add(btnNewButton);
	}
}
