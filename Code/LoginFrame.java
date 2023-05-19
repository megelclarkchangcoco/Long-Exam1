package Portfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginFrame extends JFrame {
	private JPanel contentPane;
	private ImageIcon BGManila = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\ManilaCampus.png")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT)); 
	private ImageIcon BGLaguna = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Nulaguna.png")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
	private ImageIcon BGFairview = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Fairview.jpg")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
	private ImageIcon BGMOA = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Moa.jpg")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
	private ImageIcon BGBaliwag = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Dasmariniascampus.png")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
	private ImageIcon BGLipa = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Dasmariniascampus.png")
					.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
	private ImageIcon emailIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Email.PNG").getImage()
					.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon lockIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\PasswordLogin.PNG")
					.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon userIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\FirstName.PNG").getImage()
					.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon emailAddIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Email.PNG").getImage()
					.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon IDIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\ID.PNG").getImage()
					.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon NUHeadIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\NUIS.jpeg")
					.getImage().getScaledInstance(293, 100, Image.SCALE_DEFAULT));
	private ImageIcon easyToUseIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\EasytoUse.PNG").getImage()
					.getScaledInstance(45, 45, Image.SCALE_DEFAULT));
	private ImageIcon flexibleIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Flexible.PNG")
					.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
	private ImageIcon collabIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\Collab.PNG").getImage()
					.getScaledInstance(45, 45, Image.SCALE_DEFAULT));
	private ImageIcon microsoftIcon = new ImageIcon(
			new ImageIcon("").getImage()
					.getScaledInstance(75, 18, Image.SCALE_DEFAULT));
	private ImageIcon appLogo = new ImageIcon(
			"C:\\Users\\Windows 10\\eclipse-workspace\\OOPadvanceProject\\src\\Nuis\\NUbranchPicture\\NUlogo.PNG");
	private JTextField emailField;
	private JPasswordField passwordField;
	private String[] univBranches = { "National University - Manila", "NU Laguna", "NU Fairview", "NU MOA",
			"NU Baliwag", "NU Dasmarinas", "NU Lipa", "NU Clark" };
	private JTextField IDField;
	private JTextField FirstNameLastField;
	private JTextField EmailAddField;
	private JLabel registerText;
	private JPanel loginPanel;
	private JPanel registerPanel;
	private JPasswordField passwordField_2;
	private JLabel NUBackground;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setLocationRelativeTo(null);
		setIconImage(appLogo.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel BackgroundPanel = new JPanel();
		contentPane.add(BackgroundPanel, "name_31272617859700");
		BackgroundPanel.setLayout(null);

		JPanel LoginRegister = new JPanel();
		LoginRegister.setBounds(685, 77, 416, 511);
		BackgroundPanel.add(LoginRegister);
		LoginRegister.setLayout(new CardLayout(0, 0));

		CardLayout cl = (CardLayout) LoginRegister.getLayout();

		loginPanel = new JPanel();
		loginPanel.setBackground(new Color(0, 147, 255));
		LoginRegister.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);

		JPanel emailPanel = new JPanel();
		emailPanel.setLayout(null);
		emailPanel.setBackground(Color.WHITE);
		emailPanel.setBounds(48, 236, 320, 40);
		loginPanel.add(emailPanel);

		emailField = new JTextField();
		emailField.setText("Username / Email");
		emailField.setForeground(new Color(96, 96, 96));
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emailField.setColumns(10);
		emailField.setBorder(null);
		emailField.setBounds(35, 6, 275, 29);
		emailField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (emailField.getText().equals("")) {
					emailField.setForeground(new Color(96, 96, 96));
					emailField.setText("Username / Email");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (emailField.getText().equals("Username / Email")) {
					emailField.setForeground(Color.BLACK);
					emailField.setText("");
				}
			}
		});
		emailPanel.add(emailField);

		JLabel iconOfUser = new JLabel("");
		iconOfUser.setBounds(7, 0, 34, 40);
		iconOfUser.setIcon(userIcon);
		emailPanel.add(iconOfUser);

		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(null);
		passwordPanel.setBackground(Color.WHITE);
		passwordPanel.setBounds(48, 287, 320, 40);
		loginPanel.add(passwordPanel);

		passwordField = new JPasswordField();
		passwordField.setText("Password");
		passwordField.setForeground(new Color(96, 96, 96));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setEchoChar((char) 0);
		passwordField.setBorder(null);
		passwordField.setBounds(35, 6, 275, 29);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().equals("")) {
					passwordField.setForeground(new Color(96, 96, 96));
					passwordField.setText("Password");
					passwordField.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Password")) {
					passwordField.setEchoChar('●');
					passwordField.setForeground(Color.BLACK);
					passwordField.setText("");
				}
			}

		});
		passwordPanel.add(passwordField);

		JLabel iconOfLock = new JLabel("");
		iconOfLock.setIcon(lockIcon);
		iconOfLock.setBounds(7, 0, 34, 40);
		passwordPanel.add(iconOfLock);

		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = emailField.getText();
				String password = new String(passwordField.getPassword());
				
				if(username.equals("Miguel") && password.equals("123")) {
					MyPortfolioFrame frame1 = new MyPortfolioFrame();
					frame1.setVisible(true);
					dispose();
				}else if(username.equals("nocum") && password.equals("123")) {
//					nocum frame2 = new nocum();
//					frame2.setVisible(true);
//					dispose();
				
				}else {
					JOptionPane.showConfirmDialog(null, "Incorrect Username or Incorrect Password", "Do you want Try Again?", JOptionPane.YES_NO_OPTION);
				}
				

			}
		});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		loginButton.setBorder(null);
		loginButton.setBackground(new Color(240, 173, 78));
		loginButton.setForeground(Color.white);
		loginButton.setBounds(48, 338, 63, 23);
		loginButton.setBorderPainted(false);
		loginPanel.add(loginButton);

		JPanel universitiesList = new JPanel();
		universitiesList.setBorder(null);
		universitiesList.setBackground(Color.WHITE);
		universitiesList.setBounds(48, 185, 320, 40);
		loginPanel.add(universitiesList);
		universitiesList.setLayout(null);

		JComboBox NUBranches = new JComboBox(univBranches);
		NUBranches.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String selectedBranch = NUBranches.getSelectedItem().toString();
					switch (selectedBranch) {
					case "National University - Manila":
						NUBackground.setIcon(BGManila);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Laguna":
						NUBackground.setIcon(BGLaguna);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Fairview":
						NUBackground.setIcon(BGFairview);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU MOA":
						NUBackground.setIcon(BGMOA);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Baliwag":
						NUBackground.setIcon(BGBaliwag);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Dasmarinas":
						NUBackground.setIcon(BGManila);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Lipa":
						NUBackground.setIcon(BGLipa);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					case "NU Clark":
						NUBackground.setIcon(BGManila);
						NUBackground.setBounds(0, 0, 1264, 681);
						break;
					default:
						NUBackground.setIcon(null);
						break;
					}
					NUBackground.setBounds(0, 0, 1264, 681);
				}
			}
		});
		NUBranches.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NUBranches.setBorder(null);
		NUBranches.setBounds(31, 0, 289, 40);
		universitiesList.add(NUBranches);

		JLabel emailIconLabel = new JLabel("");
		emailIconLabel.setBounds(7, 0, 33, 40);
		emailIconLabel.setIcon(emailIcon);
		universitiesList.add(emailIconLabel);

		JButton loginFormButton = new JButton("LOGIN");
		loginFormButton.setOpaque(false);
		loginFormButton.setContentAreaFilled(false);
		loginFormButton.setBorderPainted(false);
		loginFormButton.setForeground(Color.ORANGE);
		loginFormButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginFormButton.setBounds(30, 144, 86, 22);
		loginPanel.add(loginFormButton);

		JButton registerFormButton = new JButton("REGISTER");
		registerFormButton.setOpaque(false);
		registerFormButton.setContentAreaFilled(false);
		registerFormButton.setBorderPainted(false);
		registerFormButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == registerFormButton) {
					cl.show(LoginRegister, "registerPanel");
					emailField.setText("Username / Email");
					passwordField.setEchoChar((char) 0);
					passwordField.setText("Password");
				}
			}
		});
		registerFormButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		registerFormButton.setBounds(96, 144, 110, 22);
		loginPanel.add(registerFormButton);

		JLabel Headline = new JLabel("Education that works.");
		Headline.setForeground(new Color(255, 250, 250));
		Headline.setFont(new Font("Arial Black", Font.BOLD, 16));
		Headline.setBounds(48, 22, 223, 57);
		loginPanel.add(Headline);

		JLabel Caption1 = new JLabel("Login with your");
		Caption1.setForeground(new Color(255, 250, 250));
		Caption1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Caption1.setBounds(48, 66, 108, 24);
		loginPanel.add(Caption1);

		JLabel officeIcon = new JLabel("");
		officeIcon.setIcon(microsoftIcon);
		officeIcon.setBounds(150, 54, 158, 46);
		loginPanel.add(officeIcon);

		JLabel Caption3 = new JLabel("benefit from the services we offer.");
		Caption3.setForeground(new Color(255, 250, 250));
		Caption3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Caption3.setBounds(48, 90, 223, 24);
		loginPanel.add(Caption3);

		JLabel lblAccountToUse = new JLabel("account to use and");
		lblAccountToUse.setForeground(new Color(255, 250, 250));
		lblAccountToUse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountToUse.setBounds(233, 65, 137, 24);
		loginPanel.add(lblAccountToUse);

		JLabel footer1 = new JLabel("All modules, contents and services included in this system is intended");
		footer1.setForeground(Color.WHITE);
		footer1.setFont(new Font("Arial", Font.PLAIN, 10));
		footer1.setBounds(47, 383, 334, 29);
		loginPanel.add(footer1);

		JLabel footer2 = new JLabel("for Nationalians' use only. You may not, except with our express");
		footer2.setForeground(Color.WHITE);
		footer2.setFont(new Font("Arial", Font.PLAIN, 10));
		footer2.setBounds(62, 397, 334, 29);
		loginPanel.add(footer2);

		JLabel footer3 = new JLabel("written permission, distribute or commercially exploit its contents");
		footer3.setForeground(Color.WHITE);
		footer3.setFont(new Font("Arial", Font.PLAIN, 10));
		footer3.setBounds(60, 412, 334, 29);
		loginPanel.add(footer3);

		JLabel footer4 = new JLabel("Nor may you transmit it or store it in any other website or other form");
		footer4.setForeground(Color.WHITE);
		footer4.setFont(new Font("Arial", Font.PLAIN, 10));
		footer4.setBounds(54, 428, 334, 29);
		loginPanel.add(footer4);

		JLabel footer5 = new JLabel("of electronic retrieval system. National University © 2023.");
		footer5.setForeground(Color.WHITE);
		footer5.setFont(new Font("Arial", Font.PLAIN, 10));
		footer5.setBounds(72, 442, 334, 29);
		loginPanel.add(footer5);

		JLabel lineDivider = new JLabel("_______________________________________________");
		lineDivider.setForeground(Color.WHITE);
		lineDivider.setBounds(47, 372, 334, 14);
		loginPanel.add(lineDivider);

		JLabel lblNewLabel_1_1 = new JLabel("_______");
		lblNewLabel_1_1.setForeground(Color.ORANGE);
		lblNewLabel_1_1.setBounds(49, 158, 86, 14);
		loginPanel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("___________");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(116, 158, 86, 14);
		loginPanel.add(lblNewLabel_2);

		registerPanel = new JPanel();
		registerPanel.setBackground(new Color(0, 147, 255));
		LoginRegister.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);

		JPanel IDNumberPanelReg = new JPanel();
		IDNumberPanelReg.setLayout(null);
		IDNumberPanelReg.setBackground(Color.WHITE);
		IDNumberPanelReg.setBounds(48, 228, 320, 40);
		registerPanel.add(IDNumberPanelReg);

		IDField = new JTextField();
		IDField.setText("ID Number");
		IDField.setForeground(new Color(96, 96, 96));
		IDField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		IDField.setColumns(10);
		IDField.setBorder(null);
		IDField.setBounds(35, 6, 275, 29);
		IDNumberPanelReg.add(IDField);
		IDField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (IDField.getText().equals("")) {
					IDField.setForeground(new Color(96, 96, 96));
					IDField.setText("ID Number");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (IDField.getText().equals("ID Number")) {
					IDField.setForeground(Color.BLACK);
					IDField.setText("");
				}
			}

		});

		JLabel iconOfID = new JLabel("");
		iconOfID.setIcon(IDIcon);
		iconOfID.setBounds(7, 0, 34, 40);
		IDNumberPanelReg.add(iconOfID);

		JPanel fullNamePanelReg = new JPanel();
		fullNamePanelReg.setLayout(null);
		fullNamePanelReg.setBackground(Color.WHITE);
		fullNamePanelReg.setBounds(48, 279, 320, 40);
		registerPanel.add(fullNamePanelReg);

		FirstNameLastField = new JTextField();
		FirstNameLastField.setText("First Name Last Name");
		FirstNameLastField.setForeground(new Color(96, 96, 96));
		FirstNameLastField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		FirstNameLastField.setColumns(10);
		FirstNameLastField.setBorder(null);
		FirstNameLastField.setBounds(35, 6, 275, 29);
		fullNamePanelReg.add(FirstNameLastField);
		FirstNameLastField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (FirstNameLastField.getText().equals("")) {
					FirstNameLastField.setForeground(new Color(96, 96, 96));
					FirstNameLastField.setText("First Name Last Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (FirstNameLastField.getText().equals("First Name Last Name")) {
					FirstNameLastField.setForeground(Color.BLACK);
					FirstNameLastField.setText("");
				}
			}

		});

		JLabel iconOfUser_1 = new JLabel("");
		iconOfUser_1.setIcon(userIcon);
		iconOfUser_1.setBounds(7, 0, 34, 40);
		fullNamePanelReg.add(iconOfUser_1);

		JPanel emailAddPanelReg = new JPanel();
		emailAddPanelReg.setLayout(null);
		emailAddPanelReg.setBackground(Color.WHITE);
		emailAddPanelReg.setBounds(48, 330, 320, 40);
		registerPanel.add(emailAddPanelReg);

		EmailAddField = new JTextField();
		EmailAddField.setText("Email Address");
		EmailAddField.setForeground(new Color(96, 96, 96));
		EmailAddField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EmailAddField.setColumns(10);
		EmailAddField.setBorder(null);
		EmailAddField.setBounds(35, 6, 275, 29);
		emailAddPanelReg.add(EmailAddField);
		EmailAddField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (EmailAddField.getText().equals("")) {
					EmailAddField.setForeground(new Color(96, 96, 96));
					EmailAddField.setText("Email Address");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (EmailAddField.getText().equals("Email Address")) {
					EmailAddField.setForeground(Color.BLACK);
					EmailAddField.setText("");
				}
			}

		});

		JLabel iconOfEmail = new JLabel("");
		iconOfEmail.setIcon(emailAddIcon);
		iconOfEmail.setBounds(7, 0, 34, 40);
		emailAddPanelReg.add(iconOfEmail);

		JButton loginFormButton_1 = new JButton("LOGIN");
		loginFormButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		loginFormButton_1.setOpaque(false);
		loginFormButton_1.setContentAreaFilled(false);
		loginFormButton_1.setBorderPainted(false);
		loginFormButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == loginFormButton_1) {
					cl.show(LoginRegister, "loginPanel");
					IDField.setText("ID Number");
					FirstNameLastField.setText("First Name Last Name");
					EmailAddField.setText("Email Address");
					passwordField_2.setEchoChar((char) 0);
					passwordField_2.setText("Password");
				}
			}
		});
		loginFormButton_1.setForeground(Color.BLACK);
		loginFormButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginFormButton_1.setBounds(30, 144, 86, 22);
		registerPanel.add(loginFormButton_1);

		JButton registerFormbutton_1 = new JButton("REGISTER");
		registerFormbutton_1.setOpaque(false);
		registerFormbutton_1.setContentAreaFilled(false);
		registerFormbutton_1.setBorderPainted(false);
		registerFormbutton_1.setForeground(Color.ORANGE);
		registerFormbutton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		registerFormbutton_1.setBounds(96, 144, 110, 22);
		registerPanel.add(registerFormbutton_1);

		JPanel passwordPanelReg = new JPanel();
		passwordPanelReg.setLayout(null);
		passwordPanelReg.setBackground(Color.WHITE);
		passwordPanelReg.setBounds(48, 381, 320, 40);
		registerPanel.add(passwordPanelReg);

		passwordField_2 = new JPasswordField();
		passwordField_2.setText("Password");
		passwordField_2.setForeground(new Color(96, 96, 96));
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField_2.setEchoChar(' ');
		passwordField_2.setBorder(null);
		passwordField_2.setBounds(35, 6, 275, 29);
		passwordPanelReg.add(passwordField_2);
		passwordField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (passwordField_2.getText().equals("")) {
					passwordField_2.setForeground(new Color(96, 96, 96));
					passwordField_2.setText("Password");
					passwordField_2.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (passwordField_2.getText().equals("Password")) {
					passwordField_2.setEchoChar('●');
					passwordField_2.setForeground(Color.BLACK);
					passwordField_2.setText("");
				}
			}

		});

		JLabel iconOfLock_1 = new JLabel("");
		iconOfLock_1.setIcon(lockIcon);
		iconOfLock_1.setBounds(7, 0, 34, 40);
		passwordPanelReg.add(iconOfLock_1);

		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				char[] password = passwordField_2.getPassword();
				String passwordString = new String(password);

				if (EmailAddField.getText().equals("Email Address")|| FirstNameLastField.getText().equals("First Name Last Name")
						|| IDField.getText().equals("ID Number") || passwordString.equals("Password")) {
					JOptionPane.showMessageDialog(null, "Fill-up the required fields!", "Administrator",
							JOptionPane.WARNING_MESSAGE);
				} else {

					try {

						FileWriter fw = new FileWriter("C:\\accounts.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);

						bw.append("ID: " + IDField.getText() + "\nFull Name: " + FirstNameLastField.getText()
								+ "\nEmail Address: " + EmailAddField.getText() + "\nPassword: " + passwordString
								+ "\n");
						bw.newLine();
						bw.close();
						JOptionPane.showMessageDialog(null, "Registration Completed! Login to continue.",
								"Administrator", JOptionPane.PLAIN_MESSAGE);

					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		registerButton.setForeground(Color.WHITE);
		registerButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		registerButton.setBorderPainted(false);
		registerButton.setBorder(null);
		registerButton.setBackground(new Color(92, 184, 92));
		registerButton.setBounds(48, 432, 63, 23);
		registerPanel.add(registerButton);

		JLabel lblNote = new JLabel("NOTE");
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setOpaque(true);
		lblNote.setForeground(Color.WHITE);
		lblNote.setBackground(Color.ORANGE);
		lblNote.setBounds(48, 178, 46, 19);
		registerPanel.add(lblNote);

		JLabel Caption1_1 = new JLabel("Login with your");
		Caption1_1.setForeground(new Color(255, 250, 250));
		Caption1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Caption1_1.setBounds(48, 66, 108, 24);
		registerPanel.add(Caption1_1);

		JLabel Headline_1 = new JLabel("Education that works.");
		Headline_1.setForeground(new Color(255, 250, 250));
		Headline_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		Headline_1.setBounds(48, 22, 223, 57);
		registerPanel.add(Headline_1);

		JLabel lblAccountToUse_1 = new JLabel("account to use and");
		lblAccountToUse_1.setForeground(new Color(255, 250, 250));
		lblAccountToUse_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountToUse_1.setBounds(233, 65, 137, 24);
		registerPanel.add(lblAccountToUse_1);

		JLabel officeIcon_1 = new JLabel("");
		officeIcon_1.setIcon(microsoftIcon);
		officeIcon_1.setBounds(150, 54, 158, 46);
		registerPanel.add(officeIcon_1);

		JLabel Caption3_1 = new JLabel("benefit from the services we offer.");
		Caption3_1.setForeground(new Color(255, 250, 250));
		Caption3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Caption3_1.setBounds(48, 90, 223, 24);
		registerPanel.add(Caption3_1);

		JLabel Caption3_1_1 = new JLabel("To register, use your Office 365 email account and ID");
		Caption3_1_1.setForeground(new Color(255, 250, 250));
		Caption3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Caption3_1_1.setBounds(100, 175, 272, 24);
		registerPanel.add(Caption3_1_1);

		JLabel Caption3_1_1_1 = new JLabel("Number.");
		Caption3_1_1_1.setForeground(new Color(255, 250, 250));
		Caption3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Caption3_1_1_1.setBounds(48, 197, 272, 24);
		registerPanel.add(Caption3_1_1_1);

		JLabel lblNewLabel = new JLabel("__________");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBounds(116, 158, 86, 14);
		registerPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("_______");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(49, 158, 86, 14);
		registerPanel.add(lblNewLabel_1);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(0, 147, 255));
		sidePanel.setBounds(0, 0, 469, 681);
		BackgroundPanel.add(sidePanel);
		sidePanel.setLayout(null);

		JLabel NUHeaderIcon = new JLabel("");
		NUHeaderIcon.setIcon(NUHeadIcon);
		NUHeaderIcon.setBounds(46, 11, 317, 137);
		sidePanel.add(NUHeaderIcon);

		JLabel EasyToUse = new JLabel("Easy to use.");
		EasyToUse.setForeground(Color.YELLOW);
		EasyToUse.setFont(new Font("Arial Black", Font.PLAIN, 15));
		EasyToUse.setBounds(84, 214, 117, 35);
		sidePanel.add(EasyToUse);

		JLabel ec1 = new JLabel("You don't need to be a techie or should");
		ec1.setForeground(new Color(255, 250, 250));
		ec1.setFont(new Font("Arial", Font.PLAIN, 11));
		ec1.setBounds(189, 220, 255, 26);
		sidePanel.add(ec1);

		JLabel ec2 = new JLabel("have an advanced knowledge in order to do or get what you");
		ec2.setForeground(new Color(255, 250, 250));
		ec2.setFont(new Font("Arial", Font.PLAIN, 11));
		ec2.setBounds(84, 237, 312, 26);
		sidePanel.add(ec2);

		JLabel ec3 = new JLabel("need. You can manage as you go along!");
		ec3.setForeground(new Color(255, 250, 250));
		ec3.setFont(new Font("Arial", Font.PLAIN, 11));
		ec3.setBounds(84, 257, 312, 26);
		sidePanel.add(ec3);

		JLabel fc1 = new JLabel("Flexible.");
		fc1.setForeground(Color.YELLOW);
		fc1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		fc1.setBounds(84, 294, 117, 35);
		sidePanel.add(fc1);

		JLabel fc2 = new JLabel("Allowing users to collect and evaluate data to");
		fc2.setForeground(new Color(255, 250, 250));
		fc2.setFont(new Font("Arial", Font.PLAIN, 11));
		fc2.setBounds(159, 300, 255, 26);
		sidePanel.add(fc2);

		JLabel fc3 = new JLabel("generate appropriate information and reports as needed,");
		fc3.setForeground(new Color(255, 250, 250));
		fc3.setFont(new Font("Arial", Font.PLAIN, 11));
		fc3.setBounds(84, 317, 312, 26);
		sidePanel.add(fc3);

		JLabel fc4 = new JLabel("presenting information in the right amount of detail according to");
		fc4.setForeground(new Color(255, 250, 250));
		fc4.setFont(new Font("Arial", Font.PLAIN, 11));
		fc4.setBounds(84, 337, 312, 26);
		sidePanel.add(fc4);

		JLabel fc5 = new JLabel("the level of management.");
		fc5.setForeground(new Color(255, 250, 250));
		fc5.setFont(new Font("Arial", Font.PLAIN, 11));
		fc5.setBounds(84, 355, 312, 26);
		sidePanel.add(fc5);

		JLabel cc1 = new JLabel("Collaborative.");
		cc1.setForeground(Color.YELLOW);
		cc1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		cc1.setBounds(84, 392, 117, 35);
		sidePanel.add(cc1);

		JLabel cc3 = new JLabel("Facilitates communication between");
		cc3.setForeground(new Color(255, 250, 250));
		cc3.setFont(new Font("Arial", Font.PLAIN, 11));
		cc3.setBounds(204, 398, 255, 26);
		sidePanel.add(cc3);

		JLabel fc6 = new JLabel("students, faculty and employees throughout the university.");
		fc6.setForeground(new Color(255, 250, 250));
		fc6.setFont(new Font("Arial", Font.PLAIN, 11));
		fc6.setBounds(84, 415, 312, 26);
		sidePanel.add(fc6);

		JLabel easyLabel = new JLabel("");
		easyLabel.setIcon(easyToUseIcon);
		easyLabel.setBounds(28, 226, 46, 57);
		sidePanel.add(easyLabel);

		JLabel flexibleLabel = new JLabel("");
		flexibleLabel.setBounds(28, 306, 46, 57);
		flexibleLabel.setIcon(flexibleIcon);
		sidePanel.add(flexibleLabel);

		JLabel collaborativeLabel = new JLabel("");
		collaborativeLabel.setIcon(collabIcon);
		collaborativeLabel.setBounds(28, 392, 46, 57);
		sidePanel.add(collaborativeLabel);

		NUBackground = new JLabel("");
		NUBackground.setIcon(BGManila);
		NUBackground.setBounds(0, 0, 1264, 681);
		BackgroundPanel.add(NUBackground);
	}
}

