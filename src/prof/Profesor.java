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

public class Profesor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profesor frame = new Profesor();
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
	public Profesor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 774, 645);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/prof.jpeg")).getImage(); 
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(12, 13, 445, 579);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrProfesorJeSada = new JTextArea();
		txtrProfesorJeSada.setLineWrap(true);
		txtrProfesorJeSada.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		txtrProfesorJeSada.setText("Profesor je sada srecno pored tabele.");
		txtrProfesorJeSada.setBounds(469, 13, 275, 71);
		contentPane.add(txtrProfesorJeSada);
	}
}
