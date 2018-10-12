package prof;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MwainWindow {

	private JFrame frmDomaciProfaIde;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MwainWindow window = new MwainWindow();
					window.frmDomaciProfaIde.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MwainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDomaciProfaIde = new JFrame();
		frmDomaciProfaIde.setFont(new Font("MS Gothic", Font.BOLD, 14));
		frmDomaciProfaIde.setTitle("Domaci profa ide do table");
		frmDomaciProfaIde.getContentPane().setBackground(new Color(152, 251, 152));
		frmDomaciProfaIde.setBounds(100, 100, 1055, 692);
		frmDomaciProfaIde.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDomaciProfaIde.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Unos podataka za objekat profa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 606, 184);
		frmDomaciProfaIde.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(57, 31, 53, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Unesite ime Profesora");
		textField.setBounds(173, 31, 284, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Help ?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Ovo polje je namenjeno za String tip podataka ili praktično bilo šta.", "The help me button!", 1);
			}
		});
		btnNewButton.setToolTipText("Pokazuje koji tip podataka moze da se unese u ovo polje.");
		btnNewButton.setBounds(462, 30, 119, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Location");
		lblNewLabel_1.setBounds(47, 62, 74, 21);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Unesite gde se profesor nalazi.");
		textField_1.setBounds(173, 61, 284, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Help ?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ovo polje je namenjeno za String tip podataka ili praktično bilo šta.", "The help me button!", 1);
			}
		});
		btnNewButton_1.setToolTipText("Pokazuje koji tip podataka moze da se unese u ovo polje.");
		btnNewButton_1.setBounds(462, 60, 119, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Broj");
		lblNewLabel_2.setBounds(66, 92, 36, 21);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Broj koraka.");
		textField_2.setBounds(173, 91, 284, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Help ?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ovo polje je namenjeno samo za int tip podataka sto znaci samo broj.", "The help me button!", 1);
			}
		});
		btnNewButton_2.setToolTipText("Pokazuje koji tip podataka moze da se unese u ovo polje.");
		btnNewButton_2.setBounds(462, 90, 119, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fellings");
		lblNewLabel_3.setBounds(42, 122, 84, 21);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(173, 121, 284, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Help ?");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ovo polje je namenjeno za String tip podataka ili praktično bilo šta.", "The help me button!", 1);
			}
		});
		btnNewButton_3.setToolTipText("Pokazuje koji tip podataka moze da se unese u ovo polje.");
		btnNewButton_3.setBounds(462, 120, 119, 25);
		panel.add(btnNewButton_3);
		
		JLabel label = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/b.jpg")).getImage(); 
		label.setIcon(new ImageIcon(img2));
		label.setBounds(12, 210, 1037, 420);
		frmDomaciProfaIde.getContentPane().add(label);
		
		JLabel label2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/cogs.gif")).getImage(); 
		label2.setIcon(new ImageIcon(img3));
		label2.setBounds(843, 13, 190, 184);
		frmDomaciProfaIde.getContentPane().add(label2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(630, 23, 201, 173);
		frmDomaciProfaIde.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setLayout(new FlowLayout());
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(12, 13, 87, 25);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(12, 51, 87, 25);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(12, 89, 87, 25);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(12, 127, 87, 25);
		panel_1.add(btnNewButton_7);
		
		JButton button = new JButton("New button");
		button.setForeground(Color.BLACK);
		button.setBounds(111, 13, 87, 25);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(111, 51, 87, 25);
		panel_1.add(button_1);
	}

}
