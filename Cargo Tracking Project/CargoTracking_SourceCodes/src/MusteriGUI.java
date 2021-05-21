import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class MusteriGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusteriGUI frame = new MusteriGUI();
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
	public MusteriGUI() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(25, 29, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00FC\u015Fteri Paneli");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 35));
		lblNewLabel_1.setBounds(110, 66, 242, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("müsteri.jpg")));
		lblNewLabel_2.setBounds(35, 148, 446, 387);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Kurye Bilgisi");
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KuryeBilgisi buton = new KuryeBilgisi();
                buton.setVisible(true);  
			}
		});
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnNewButton.setBounds(543, 228, 197, 62);
		contentPane.add(btnNewButton);
		
		JButton btnubeBilgisi = new JButton("\u015Eube Bilgisi");
		btnubeBilgisi.setBackground(new Color(255, 102, 51));
		btnubeBilgisi.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnubeBilgisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubeBilgisi f2 = new SubeBilgisi();
				f2.setVisible(true);
			}
		});
		btnubeBilgisi.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnubeBilgisi.setBounds(771, 228, 197, 62);
		contentPane.add(btnubeBilgisi);
		
		JButton btnKargoBilgisi = new JButton("Kargo Bilgisi");
		btnKargoBilgisi.setBackground(new Color(255, 102, 51));
		btnKargoBilgisi.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnKargoBilgisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KargoBilgisi f1 = new KargoBilgisi();
				f1.setVisible(true);
			}
		});
		btnKargoBilgisi.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnKargoBilgisi.setBounds(543, 359, 197, 62);
		contentPane.add(btnKargoBilgisi);
		
		JButton btnFaturaBilgisi = new JButton("Fatura Bilgisi");
		btnFaturaBilgisi.setBackground(new Color(255, 102, 51));
		btnFaturaBilgisi.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnFaturaBilgisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaturaBilgisi f2 = new FaturaBilgisi();
				f2.setVisible(true);
			}
		});
		btnFaturaBilgisi.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnFaturaBilgisi.setBounds(771, 359, 197, 62);
		contentPane.add(btnFaturaBilgisi);
	}

}
