import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class KuryeGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KuryeGUI frame = new KuryeGUI();
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
	public KuryeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kurye Paneli");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel_1.setBounds(45, 21, 279, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(getClass().getResource("motor.gif")));
		lblNewLabel_2.setBounds(10, 93, 479, 454);
		contentPane.add(lblNewLabel_2);
		
		JButton btnMteriBilgisi = new JButton("M\u00FC\u015Fteri Bilgisi");
		btnMteriBilgisi.setBackground(new Color(255, 102, 51));
		btnMteriBilgisi.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		btnMteriBilgisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusteriBilgisi f2 = new MusteriBilgisi();
                f2.setVisible(true);       
			}
		});
		btnMteriBilgisi.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnMteriBilgisi.setBounds(516, 191, 197, 62);
		contentPane.add(btnMteriBilgisi);
		
		JButton btnNewButton_1 = new JButton("Fatura Bilgisi");
		btnNewButton_1.setBackground(new Color(255, 102, 51));
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaturaBilgisi f3 = new FaturaBilgisi();
				f3.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnNewButton_1.setBounds(783, 191, 197, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kargo");
		btnNewButton_2.setBackground(new Color(255, 102, 51));
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 102, 51), 3));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KuryeKargo kk = new KuryeKargo();
                kk.setVisible(true); 
			}
		});
		btnNewButton_2.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnNewButton_2.setBounds(647, 310, 197, 62);
		contentPane.add(btnNewButton_2);
	}

}
