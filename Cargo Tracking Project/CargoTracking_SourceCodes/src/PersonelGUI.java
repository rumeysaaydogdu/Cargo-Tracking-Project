import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class PersonelGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelGUI frame = new PersonelGUI();
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
	public PersonelGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Personel Paneli");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 35));
		lblNewLabel_1.setBounds(127, 45, 253, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("personel.gif")));
		lblNewLabel.setBounds(31, 177, 459, 336);
		contentPane.add(lblNewLabel);
		
		JButton btnPersonel = new JButton("Personel");
		btnPersonel.setBackground(new Color(255, 102, 51));
		btnPersonel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnPersonel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelPersonel p1 = new PersonelPersonel();
                p1.setVisible(true);      
			}
		});
		btnPersonel.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnPersonel.setBounds(539, 177, 197, 62);
		contentPane.add(btnPersonel);
		
		JButton btnKurye = new JButton("Kurye");
		btnKurye.setBackground(new Color(255, 102, 51));
		btnKurye.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnKurye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelKurye pk = new PersonelKurye();
                pk.setVisible(true);      
			}
		});
		btnKurye.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnKurye.setBounds(767, 177, 197, 62);
		contentPane.add(btnKurye);
		
		JButton btnKargo = new JButton("Kargo");
		btnKargo.setBackground(new Color(255, 102, 51));
		btnKargo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnKargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelKargo pk = new PersonelKargo();
                pk.setVisible(true);      
				    
			}
		});
		btnKargo.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnKargo.setBounds(539, 426, 197, 62);
		contentPane.add(btnKargo);
		
		JButton btnFatura = new JButton("Fatura");
		btnFatura.setBackground(new Color(255, 102, 51));
		btnFatura.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnFatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelFatura pf = new PersonelFatura();
                pf.setVisible(true); 
			     
			}
		});
		btnFatura.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnFatura.setBounds(767, 426, 197, 62);
		contentPane.add(btnFatura);
		
		JButton btnMteri = new JButton("M\u00FC\u015Fteri");
		btnMteri.setBackground(new Color(255, 102, 51));
		btnMteri.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnMteri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelMusteri pm = new PersonelMusteri();
                pm.setVisible(true);   
				     
			}
		});
		btnMteri.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnMteri.setBounds(539, 301, 197, 62);
		contentPane.add(btnMteri);
		
		JButton btnube = new JButton("\u015Eube");
		btnube.setBackground(new Color(255, 102, 51));
		btnube.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(204, 204, 255)));
		btnube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonelSube ps = new PersonelSube();
                ps.setVisible(true);   
				    
			}
		});
		btnube.setFont(new Font("Cambria Math", Font.BOLD, 25));
		btnube.setBounds(767, 301, 197, 62);
		contentPane.add(btnube);
	}

}
