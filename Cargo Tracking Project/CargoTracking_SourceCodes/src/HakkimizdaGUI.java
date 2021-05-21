import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class HakkimizdaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtKargoTakipProjesi;
	private JTextField txtRumeysaAydodu;
	private JTextField txtReyhanAygn;
	private JTextField txtHidayetCelep;
	private JTextField txtmeranver;
	private JTextField txtEsranurBetlz;
	private JTextField txtDidemAka;
	private JTextField txtEcemOdaba;
	private JTextField txtBerkayBalc;
	private JTextField txtTubaSeil;
	private JTextField txtDrRabiaKorkmaz;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HakkimizdaGUI frame = new HakkimizdaGUI();
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
	public HakkimizdaGUI() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 524);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Proje Akademisyeni:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblNewLabel.setBounds(30, 27, 185, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblProjeAd = new JLabel("Proje Ad\u0131:");
		lblProjeAd.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblProjeAd.setBounds(30, 86, 185, 33);
		contentPane.add(lblProjeAd);
		
		JLabel lblNewLabel_1_1 = new JLabel("Developer Ekibimiz:");
		lblNewLabel_1_1.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(30, 147, 185, 33);
		contentPane.add(lblNewLabel_1_1);
		
		txtKargoTakipProjesi = new JTextField();
		txtKargoTakipProjesi.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtKargoTakipProjesi.setEditable(false);
		txtKargoTakipProjesi.setText("Kargo Takip Projesi");
		txtKargoTakipProjesi.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtKargoTakipProjesi.setColumns(10);
		txtKargoTakipProjesi.setBounds(266, 86, 246, 31);
		contentPane.add(txtKargoTakipProjesi);
		
		txtRumeysaAydodu = new JTextField();
		txtRumeysaAydodu.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtRumeysaAydodu.setEditable(false);
		txtRumeysaAydodu.setText("Rumeysa AYDO\u011EDU");
		txtRumeysaAydodu.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtRumeysaAydodu.setColumns(10);
		txtRumeysaAydodu.setBounds(266, 159, 246, 31);
		contentPane.add(txtRumeysaAydodu);
		
		txtReyhanAygn = new JTextField();
		txtReyhanAygn.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtReyhanAygn.setEditable(false);
		txtReyhanAygn.setText("Reyhan Berfin AYG\u00DCN");
		txtReyhanAygn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtReyhanAygn.setColumns(10);
		txtReyhanAygn.setBounds(266, 186, 246, 31);
		contentPane.add(txtReyhanAygn);
		
		txtHidayetCelep = new JTextField();
		txtHidayetCelep.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtHidayetCelep.setEditable(false);
		txtHidayetCelep.setText("Hidayet CELEP");
		txtHidayetCelep.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtHidayetCelep.setColumns(10);
		txtHidayetCelep.setBounds(266, 216, 246, 31);
		contentPane.add(txtHidayetCelep);
		
		txtmeranver = new JTextField();
		txtmeranver.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtmeranver.setEditable(false);
		txtmeranver.setText("\u00D6mer \u015EANVER");
		txtmeranver.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtmeranver.setColumns(10);
		txtmeranver.setBounds(266, 245, 246, 31);
		contentPane.add(txtmeranver);
		
		txtEsranurBetlz = new JTextField();
		txtEsranurBetlz.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtEsranurBetlz.setEditable(false);
		txtEsranurBetlz.setText("Esranur Bet\u00FCl \u00D6Z");
		txtEsranurBetlz.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtEsranurBetlz.setColumns(10);
		txtEsranurBetlz.setBounds(266, 275, 246, 31);
		contentPane.add(txtEsranurBetlz);
		
		txtDidemAka = new JTextField();
		txtDidemAka.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtDidemAka.setEditable(false);
		txtDidemAka.setText("Didem AK\u00C7A");
		txtDidemAka.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtDidemAka.setColumns(10);
		txtDidemAka.setBounds(266, 304, 246, 31);
		contentPane.add(txtDidemAka);
		
		txtEcemOdaba = new JTextField();
		txtEcemOdaba.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtEcemOdaba.setEditable(false);
		txtEcemOdaba.setText("Ecem ODABA\u015EI");
		txtEcemOdaba.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtEcemOdaba.setColumns(10);
		txtEcemOdaba.setBounds(266, 333, 246, 31);
		contentPane.add(txtEcemOdaba);
		
		txtBerkayBalc = new JTextField();
		txtBerkayBalc.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtBerkayBalc.setEditable(false);
		txtBerkayBalc.setText("Berkay BALCI");
		txtBerkayBalc.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtBerkayBalc.setColumns(10);
		txtBerkayBalc.setBounds(266, 361, 246, 31);
		contentPane.add(txtBerkayBalc);
		
		txtTubaSeil = new JTextField();
		txtTubaSeil.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtTubaSeil.setEditable(false);
		txtTubaSeil.setText("Tu\u011Fba SE\u00C7\u0130L");
		txtTubaSeil.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtTubaSeil.setColumns(10);
		txtTubaSeil.setBounds(266, 390, 246, 31);
		contentPane.add(txtTubaSeil);
		
		txtDrRabiaKorkmaz = new JTextField();
		txtDrRabiaKorkmaz.setBorder(new LineBorder(new Color(153, 102, 204)));
		txtDrRabiaKorkmaz.setText("Dr. Rabia KORKMAZ TAN");
		txtDrRabiaKorkmaz.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		txtDrRabiaKorkmaz.setEditable(false);
		txtDrRabiaKorkmaz.setColumns(10);
		txtDrRabiaKorkmaz.setBounds(266, 29, 246, 31);
		contentPane.add(txtDrRabiaKorkmaz);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(getClass().getResource("developer.png")));
		lblNewLabel_1.setBounds(10, 218, 233, 230);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("developer2.png")));
		lblNewLabel_2.setBounds(522, 72, 208, 349);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(637, 442, 93, 32);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel(new ImageIcon(getClass().getResource("12.gif")));
		lblNewLabel_3.setBounds(-20, 0, 774, 485);
		contentPane.add(lblNewLabel_3);
	}
}
