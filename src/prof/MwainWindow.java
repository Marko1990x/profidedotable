package prof;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MwainWindow {

	private JFrame frmDomaciProfaIde;
	private JTextField fieldName;
	private JTextField fieldLocation;
	private JTextField fieldBroj;
	private JTextField fieldOsecaj;

	public Smart smart = new Smart();
	public Test test = new Test();

	/**
	 * Launch the application.
	 */



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MwainWindow window = new MwainWindow();
					window.frmDomaciProfaIde.setVisible(true);
					window.frmDomaciProfaIde.setResizable(false);
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
	
	class Console {

		final JFrame frame = new JFrame();
		public Console() {
			JTextArea textArea = new JTextArea(24, 80);
			textArea.setBackground(Color.BLACK);
			textArea.setForeground(Color.LIGHT_GRAY);
			textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
			System.setOut(new PrintStream(new OutputStream() {

				@Override
				public void write(int b) throws IOException {
					textArea.append(String.valueOf((char) b));

				}
			}));
			frame.getContentPane().add(textArea);
			frame.getContentPane().add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
		}
		public void init() {
			frame.pack();
			frame.setSize(1200, 400);
			frame.setVisible(true);
			frame.setResizable(false);
		}
		public JFrame geJframe() {
			return frame;
		}

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

		fieldName = new JTextField();
		fieldName.setToolTipText("Unesite ime Profesora");
		fieldName.setBounds(173, 31, 284, 22);
		panel.add(fieldName);
		fieldName.setColumns(10);

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

		fieldLocation = new JTextField();
		fieldLocation.setToolTipText("Unesite gde se profesor nalazi.");
		fieldLocation.setBounds(173, 61, 284, 22);
		panel.add(fieldLocation);
		fieldLocation.setColumns(10);

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

		fieldBroj = new JTextField();
		fieldBroj.setToolTipText("Broj koraka.");
		fieldBroj.setBounds(173, 91, 284, 22);
		panel.add(fieldBroj);
		fieldBroj.setColumns(10);

		JButton btnNewButton_2 = new JButton("Help ?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ovo polje je namenjeno samo za int tip podataka sto znaci samo broj.", "The help me button!", 1);
			}
		});
		btnNewButton_2.setToolTipText("Pokazuje koji tip podataka moze da se unese u ovo polje.");
		btnNewButton_2.setBounds(462, 90, 119, 25);
		panel.add(btnNewButton_2);

		JLabel lblNewLabel_3 = new JLabel("Osecaj");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(42, 122, 84, 21);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_3);

		fieldOsecaj = new JTextField();
		fieldOsecaj.setBounds(173, 121, 284, 22);
		panel.add(fieldOsecaj);
		fieldOsecaj.setColumns(10);

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

		JButton btnNewButton_4 = new JButton("START");
		btnNewButton_4.setBounds(12, 13, 87, 25);
		btnNewButton_4.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {

				smart.loadProf("listaprofesora.txt");

				String name = fieldName.getText();
				String profaNijeDosaoDoTable; // location
				String profaJeTuzanJerNijeDosaoDoTable; //osecaj


				String number = fieldBroj.getText().trim();

				if (Test.isNumber(number) == true) {    //uslov

					String answer = number;
					
					switch (answer) {
					case "1":
						
						JOptionPane.showMessageDialog(null, "Izabrana je prva opcija", "Option 1", 1);
						
						

						break;

					case "2":
						
						JOptionPane.showMessageDialog(null, "Izabrana je druga opcija", "Option 2", 1);

						break;

					case "3":
						
						JOptionPane.showMessageDialog(null, "Izabrana je Treca opcija", "Option 3", 1);

						break;

					case "4":
						
						JOptionPane.showMessageDialog(null, "Izabrana je četvrta opcija", "Option 4", 1);

						break;

					default:
						break;
					}

				}else {
					JOptionPane.showMessageDialog(null, "Nije unet broj u polje pokusajte ponovo.", "Greska pri unosu", 2);
				}


			}
		});
		panel_1.setLayout(null);
		btnNewButton_4.setToolTipText("Pocetak adventure profesora da ode do table.");
		btnNewButton_4.setLayout(new FlowLayout());
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		panel_1.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Unos Objekta");
		btnNewButton_5.setBounds(12, 51, 177, 25);
		btnNewButton_5.setToolTipText("unos objekta u textualnu databasu");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String id = fieldBroj.getText().trim();
				
				String Name = fieldName.getText().trim();
				String Location = fieldLocation.getText().trim();
				String osecaj = fieldOsecaj.getText().trim();
				
				smart.loadProf("listaprofesora.txt");
				
				if (Test.isNumber(id) == true) {
					
					int x = Integer.parseInt(id);

					Objekat objekat = new Objekat(Name, Location, x, osecaj);
					
					boolean provera = smart.dodavanjeProfesora(objekat);
					
					if (provera) {
						JOptionPane.showMessageDialog(null, "Profesor je uspesno unet u listu podataka", "OK", 1);
					}else {
						JOptionPane.showMessageDialog(null, "Profesor nije uspesno unet u listu podataka", "Greska", 1);
					}
					

				} else {
					JOptionPane.showMessageDialog(null, "nije unet broj u polje", "Greska Unesite broj", 2);
				}
				
			}
		});
		panel_1.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Lista Objekata");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Console console = new Console();
				console.init();
				smart.lstprofesora();
			}
		});
		btnNewButton_6.setBounds(12, 89, 177, 25);
		panel_1.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Brisanje objekta Ime");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idX = null;
			//	System.out.println("Unesite ime profesora za brisanje");
				idX = fieldName.getText().trim();
				
				Objekat objekat = new Objekat(idX);
				
				Objekat provera = smart.profBrisanjeIme(objekat);
				if (provera == null) {
					// System.out.println("Zadato ime ne postoji u listi.");
					JOptionPane.showMessageDialog(null, "Ime profesora se ne nalazi u listi", "Greska pri unosu imena ili ime ne posatoji", 1);
				}else {
					JOptionPane.showMessageDialog(null, "Profesor je izbrisan sa liste", "ok", 1);
				}
			}
		});
		btnNewButton_7.setBounds(12, 127, 177, 25);
		panel_1.add(btnNewButton_7);

		JButton button = new JButton("?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Made by Marko Dunovic", "Profa ide do table domaci", 1);
			}
		});
		button.setBounds(111, 13, 78, 25);
		button.setForeground(Color.BLACK);
		panel_1.add(button);
	}

}
