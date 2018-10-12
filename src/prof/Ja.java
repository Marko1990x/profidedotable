package prof;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class Ja extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ja frame = new Ja();
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
	public Ja() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1109, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 13, 800, 600);
		Image img2 = new ImageIcon(this.getClass().getResource("/ja.jpeg")).getImage(); 
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel);
		
		JTextArea txtrProfesorJeSada = new JTextArea();
		txtrProfesorJeSada.setWrapStyleWord(true);
		txtrProfesorJeSada.setBounds(839, 36, 209, 65);
		txtrProfesorJeSada.setLineWrap(true);
		txtrProfesorJeSada.setFont(new Font("MS Gothic", Font.BOLD | Font.ITALIC, 20));
		txtrProfesorJeSada.setText("ja sam srecno pored prozora");
		contentPane.add(txtrProfesorJeSada);
	}
}
