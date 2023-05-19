package Portfolio;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JSeparator;
		
// implement interfeace
 public class MyPortfolioFrame extends JFrame implements Scrollpane, Home, Aboutme, Project, WorkExperience, Contact {
	//========================= All IMAGE=================================
	/////========================= All IMAGE
	/////========================= All IMAGE
		private ImageIcon logo = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\logo.jpg")
						.getImage().getScaledInstance(112, 91, Image.SCALE_DEFAULT));
		private ImageIcon megel = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\megel.PNG")
						.getImage().getScaledInstance(545, 182, Image.SCALE_DEFAULT));
		private ImageIcon astro = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\icon8.gif")
						.getImage().getScaledInstance(232, 220, Image.SCALE_DEFAULT));
		private ImageIcon xIcon = new ImageIcon(
				new ImageIcon("C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\mainOOPproject\\\\src\\\\asset\\\\remove.png")
						.getImage().getScaledInstance(27, 28, Image.SCALE_DEFAULT));
		private ImageIcon back = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\previous.png")
						.getImage().getScaledInstance(27, 28, Image.SCALE_DEFAULT));
		private ImageIcon astrount2 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\Astronaut2.gif")
						.getImage().getScaledInstance(266, 333, Image.SCALE_DEFAULT));
		private ImageIcon work1 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\workex1.png")
						.getImage().getScaledInstance(252, 297, Image.SCALE_DEFAULT));
		private ImageIcon work2 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\workex2.png")
						.getImage().getScaledInstance(252, 297, Image.SCALE_DEFAULT));
		private ImageIcon work3 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\work3.png")
						.getImage().getScaledInstance(252, 297, Image.SCALE_DEFAULT));
		private ImageIcon facebook = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\facebook.png")
						.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
		private ImageIcon gmail = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\gmail (1).png")
						.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
		private ImageIcon telegram = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\telegram.png")
						.getImage().getScaledInstance(46, 40, Image.SCALE_DEFAULT));
		private ImageIcon astronaut = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\astronaut.gif")
						.getImage().getScaledInstance(325, 378, Image.SCALE_DEFAULT));
		private ImageIcon project1 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\project1.jpeg")
						.getImage().getScaledInstance(423, 327, Image.SCALE_DEFAULT));
		private ImageIcon project4 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\project4.jpeg")
						.getImage().getScaledInstance(353, 327, Image.SCALE_DEFAULT));
		private ImageIcon project5 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\project 5.PNG")
						.getImage().getScaledInstance(310, 327, Image.SCALE_DEFAULT));
	
	//========================= Jpanel object================================= 
	private JPanel contentPane;
	private JPanel  scrollContent;
	private JPanel homescrollpanel;
	private JPanel aboutmePanel;
	private JPanel WorkExperiencePanel;
	private JPanel ContactPanel;
	private JPanel WorkPhotoGalleryPanel;
	private JPanel projecthistoryPanel;
	private JScrollPane scrollPane;
	private JLabel lbllogo;
	private JLabel astronuts;
	
    // Constructor
	public MyPortfolioFrame() {
		super("My Portfolio");
			    
	 // Call the interface methods to add the components
	 addScrollPane();
	 addHomePanel();
	 addAboutMePanel();
	 addProject();
	 addWorkExperiencePanel();
	 addContactPanel();
			    
	// set the size and visibility of the frame
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1280, 720);
	setLocationRelativeTo(null);
	setIconImage(logo.getImage());
	setUndecorated(true);
	setVisible(true);
			    
	// add the header panel to the content pane
     JPanel headerPanel = new JPanel();
     headerPanel.setBackground(new Color(0, 0, 0));
	 headerPanel.setBounds(0, 0, 1280, 91);
	 contentPane.add(headerPanel);
			    headerPanel.setLayout(null);

	// add the exit panel to the header panel
	JPanel exitPanel = new JPanel();
	exitPanel.setBackground(new Color(0, 0, 0));
	exitPanel.setBounds(1243, 11, 27, 28);
	headerPanel.add(exitPanel);
	exitPanel.setLayout(null);

	// add the X label to the exit panel
	 JLabel xLbl = new JLabel("");
	 xLbl.setIcon(xIcon);
	xLbl.addMouseListener(new MouseAdapter() {
	 @Override
	 public void mouseClicked(MouseEvent arg0) {
	if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
		 System.exit(0);
		 }
	}		  
	});
	
	xLbl.setBounds(0, 0, 27, 28);
	exitPanel.add(xLbl);
	
	JPanel backpanel = new JPanel();
	backpanel.setLayout(null);
	backpanel.setBackground(Color.BLACK);
	backpanel.setBounds(1206, 11, 27, 28);
	headerPanel.add(backpanel);
	
	JLabel backlbl = new JLabel("");
	backlbl.setIcon(back);
	backlbl.setBounds(0, 0, 27, 28);
	backpanel.add(backlbl);
	backlbl.addMouseListener(new MouseAdapter() {
		 @Override
		 public void mouseClicked(MouseEvent arg0) {
		if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
			 System.exit(0);
			 }
		}		  
		});
	
	
			    
	JPanel HomePanel2 = new JPanel();
	HomePanel2.addMouseListener(new PanelButtonMouseAdapter(HomePanel2) {
	    public void mouseClicked(MouseEvent e) {
	        addHomePanel();
	        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
	        verticalScrollBar.setValue(verticalScrollBar.getMinimum());

	        // Ensure that the added panel is visible within the viewport
	        Rectangle bounds = homescrollpanel.getBounds();
	        scrollPane.getViewport().scrollRectToVisible(bounds);
	    }
	});
	HomePanel2.setLayout(null);
	HomePanel2.setBackground(new Color(0, 0, 0));
	HomePanel2.setBounds(132, 22, 197, 58);
	headerPanel.add(HomePanel2);

	JLabel homelbl2 = new JLabel("     HOME");
	homelbl2.setForeground(new Color(255, 255, 255));
	homelbl2.setBackground(new Color(255, 255, 255));
	homelbl2.setFont(new Font("Anton", Font.PLAIN, 20));
	homelbl2.setBounds(52, 0, 98, 58);
	HomePanel2.add(homelbl2);

	// About Me panel =======================================================
	JPanel AboutMePanel = new JPanel();
	AboutMePanel.setBounds(339, 22, 197, 58);
	headerPanel.add(AboutMePanel);
	AboutMePanel.addMouseListener(new PanelButtonMouseAdapter(AboutMePanel) {
	    public void mouseClicked(MouseEvent e) {
	        addAboutMePanel();
	        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
	        int scrollValue = (int) ((verticalScrollBar.getMaximum() - verticalScrollBar.getMinimum() - scrollPane.getViewport().getHeight()) / 160.0);
	        verticalScrollBar.setValue(scrollValue);

	        // Ensure that the added panel is visible within the viewport
	        Rectangle bounds = aboutmePanel.getBounds();
	        bounds.y = bounds.y + aboutmePanel.getParent().getY() - scrollPane.getViewport().getViewPosition().y;
	        scrollPane.getViewport().scrollRectToVisible(bounds);
	    }
	});
	AboutMePanel.setBackground(new Color(0, 0, 0));
	AboutMePanel.setLayout(null);


	JLabel aboutMeLbl = new JLabel("About Me");
	aboutMeLbl.setBackground(new Color(0, 0, 0));
	aboutMeLbl.setForeground(new Color(255, 255, 255));
	aboutMeLbl.setFont(new Font("Anton", Font.PLAIN, 20));
	aboutMeLbl.setBounds(56, 0, 78, 58);
	AboutMePanel.add(aboutMeLbl);

	// ================== project panel =======================
	JPanel Projectpanel = new JPanel();
	Projectpanel.setLayout(null);
	Projectpanel.setBackground(Color.BLACK);
	Projectpanel.setBounds(569, 22, 197, 58);
	headerPanel.add(Projectpanel);
	Projectpanel.addMouseListener(new PanelButtonMouseAdapter(Projectpanel) {
	    public void mouseClicked(MouseEvent e) {
	        addProject();
	        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
	        int scrollValue = (int) ((verticalScrollBar.getMaximum() - verticalScrollBar.getMinimum() - scrollPane.getViewport().getHeight()) / 210.0);
	        verticalScrollBar.setValue(scrollValue);

	        // Ensure that the added panel is visible within the viewport
	        Rectangle bounds = projecthistoryPanel.getBounds();
	        bounds.y = bounds.y + projecthistoryPanel.getParent().getY() - scrollPane.getViewport().getViewPosition().y;
	        scrollPane.getViewport().scrollRectToVisible(bounds);
	    }
	});
	
	JLabel Project = new JLabel("Project");
	Project.setBackground(new Color(0, 0, 0));
	Project.setForeground(new Color(255, 255, 255));
	Project.setFont(new Font("Anton", Font.PLAIN, 20));
	Project.setBounds(63, 0, 98, 58);
	Projectpanel.add(Project);

	
	

	// Work Experience panel =======================================================
	JPanel workExperiencePanel = new JPanel();
	workExperiencePanel.setBounds(792, 22, 197, 58);
	headerPanel.add(workExperiencePanel);
	workExperiencePanel.addMouseListener(new PanelButtonMouseAdapter(workExperiencePanel) {
	    public void mouseClicked(MouseEvent e) {
	        addWorkExperiencePanel();
	        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
	        verticalScrollBar.setValue(verticalScrollBar.getMaximum());

	        // Ensure that the added panel is visible within the viewport
	        Rectangle bounds = WorkExperiencePanel.getBounds();
	        bounds.y += verticalScrollBar.getValue();
	        scrollPane.getViewport().scrollRectToVisible(bounds);
	    }
	});
	workExperiencePanel.setBackground(new Color(0, 0, 0));
	workExperiencePanel.setLayout(null);

	JLabel workExperienceLbl = new JLabel("Work Experience");
	workExperienceLbl.setForeground(new Color(255, 255, 255));
	workExperienceLbl.setFont(new Font("Anton", Font.PLAIN, 20));
	workExperienceLbl.setBounds(23, 0, 138, 58);
	workExperiencePanel.add(workExperienceLbl);

	// Contact panel =======================================================
	JPanel contactPanel = new JPanel();
	contactPanel.setBounds(999, 22, 197, 58);
	headerPanel.add(contactPanel);
	contactPanel.addMouseListener(new PanelButtonMouseAdapter(contactPanel) {
	    public void mouseClicked(MouseEvent e) {
	        addContactPanel();
	        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
		verticalScrollBar.setValue(verticalScrollBar.getMaximum());

	  	  // Ensure that the added panel is visible within the viewport
		Rectangle bounds = ContactPanel.getBounds();
	   	 bounds.y += verticalScrollBar.getValue();
	   	 scrollPane.getViewport().scrollRectToVisible(bounds);
	}
	});
	contactPanel.setBackground(new Color(0, 0, 0));
	contactPanel.setLayout(null);

	JLabel contactLbl = new JLabel(" CONTACT");
	contactLbl.setForeground(new Color(255, 255, 255));
	contactLbl.setBackground(new Color(255, 255, 255));
	contactLbl.setFont(new Font("Anton", Font.PLAIN, 20));
	contactLbl.setBounds(30, 0, 138, 58);
	contactPanel.add(contactLbl);
						
    lbllogo = new JLabel("");
	lbllogo.setIcon(logo);
	lbllogo.setBounds(0, 0, 112, 91);
	headerPanel.add(lbllogo);
	}
	
	// implementation of the AddScrollPane interface
	@Override
	public void addScrollPane() {
	// ================scroll pane panel ===============================
	JPanel scrollpanepanel = new JPanel();
	scrollpanepanel.setBounds(0, 90, 1280, 630);

	 // Initialize contentPane if it is null
	if (contentPane == null) {
	  contentPane = new JPanel();
	  contentPane.setLayout(null);
	  setContentPane(contentPane);
	}

	contentPane.add(scrollpanepanel);
	scrollpanepanel.setLayout(null);

	scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 0, 1280, 630);
	scrollPane.setBackground(new Color(225, 254, 253));
	scrollpanepanel.add(scrollPane);

	scrollContent = new JPanel();
	scrollContent.setBackground(new Color(255, 255, 255));
	scrollContent.setLayout(null);
	scrollContent.setPreferredSize(new Dimension(1001, 2600)); // increase the size of the panel to fit all 9 labels
	scrollPane.setViewportView(scrollContent);
	}
	
	
	// implementation of the HomePanel interface
    public void addHomePanel() {   
        // ===================== homepanelscroll Panel
	    homescrollpanel = new JPanel();
		homescrollpanel.setBounds(0, 0, 1261, 628);
		scrollContent.add(homescrollpanel);
		homescrollpanel.setLayout(null);
		
		JLabel computersciencelbl = new JLabel("Computer Science ");
		computersciencelbl.setFont(new Font("Anton", Font.PLAIN, 76));
		computersciencelbl.setBounds(10, 26, 658, 133);
		homescrollpanel.add(computersciencelbl);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setFont(new Font("Anton", Font.PLAIN, 80));
		lblStudent.setBounds(312, 102, 255, 133);
		homescrollpanel.add(lblStudent);
		
		JLabel megellbl = new JLabel("");
		megellbl.setIcon(megel);
		megellbl.setBounds(10, 230, 545, 182);
		homescrollpanel.add(megellbl);
		
		JLabel lblMiguelCn = new JLabel("Miguel C.N");
		lblMiguelCn.setFont(new Font("Anton", Font.PLAIN, 80));
		lblMiguelCn.setBounds(891, 484, 360, 133);
		homescrollpanel.add(lblMiguelCn);
		
		JLabel lblPolison = new JLabel("Polison");
		lblPolison.setFont(new Font("Anton", Font.PLAIN, 80));
		lblPolison.setBounds(996, 387, 255, 133);
		homescrollpanel.add(lblPolison);
		
		astronuts = new JLabel();
		astronuts.setIcon(astronaut);
		astronuts.setBounds(793, 217, 325, 378);// 325 378
		homescrollpanel.add(astronuts);
    }
 
    
    // implementation of the AboutMe interface
    public void addAboutMePanel() {
        // code to add the about me panel
    	// ============ Aboutme panel=================================
	    aboutmePanel = new JPanel();
	    aboutmePanel.setBounds(0, 628, 1261, 720);
	    scrollContent.add(aboutmePanel);
	    aboutmePanel.setLayout(null);
	    
	    JPanel nameHobbiesPanel = new JPanel();
	    nameHobbiesPanel.setBounds(29, 364, 589, 253);
	    aboutmePanel.add(nameHobbiesPanel);
	    nameHobbiesPanel.setLayout(new CardLayout(0, 0));

	    JPanel aboutMe2 = new JPanel();
	    aboutMe2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	    aboutMe2.setBackground(new Color(240, 240, 240));
	    nameHobbiesPanel.add(aboutMe2, "aboutMePanel");
	    aboutMe2.setLayout(null);
	    //=====================  Mouse Listener About me Cardlayout
	    JLabel aboutMeLabel = new JLabel("About me");
	    aboutMeLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    aboutMeLabel.setBounds(10, 11, 78, 26);
	    aboutMeLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
	            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
	        }
	    });
	    aboutMe2.add(aboutMeLabel);
	    // ================= Mouse Listener Hobbies Cardlayout
	    JLabel hobbiesLabel = new JLabel("Hobbies");
	    hobbiesLabel.setForeground(new Color(0, 0, 0));
	    hobbiesLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    hobbiesLabel.setBounds(102, 14, 78, 20);
	    hobbiesLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
	            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
	        }
	    });
	    aboutMe2.add(hobbiesLabel);
	    
	    JLabel lblNewLabel = new JLabel("______________");
	    lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 11));
	    lblNewLabel.setBounds(10, 23, 64, 14);
	    aboutMe2.add(lblNewLabel);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(10, 61, 569, 185);
	    aboutMe2.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_2 = new JLabel("Fullname : ");
	    lblNewLabel_2.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2.setForeground(new Color(0, 0, 0));
	    lblNewLabel_2.setBounds(10, 11, 64, 30);
	    panel_1.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_3 = new JLabel("Polison, Miguel Christian Narag.");
	    lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3.setBounds(74, 12, 188, 30);
	    panel_1.add(lblNewLabel_3);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Age : ");
	    lblNewLabel_2_1.setForeground(Color.BLACK);
	    lblNewLabel_2_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_1.setBounds(10, 52, 64, 30);
	    panel_1.add(lblNewLabel_2_1);
	    
	    JLabel lblNewLabel_3_1 = new JLabel("20 years old");
	    lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_1.setBounds(74, 53, 188, 30);
	    panel_1.add(lblNewLabel_3_1);
	    
	    JLabel lblNewLabel_2_2 = new JLabel("Gender : ");
	    lblNewLabel_2_2.setForeground(Color.BLACK);
	    lblNewLabel_2_2.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_2.setBounds(10, 93, 64, 30);
	    panel_1.add(lblNewLabel_2_2);
	    
	    JLabel lblNewLabel_3_2 = new JLabel("Male");
	    lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_2.setBounds(74, 94, 188, 30);
	    panel_1.add(lblNewLabel_3_2);
	    
	    JLabel lblNewLabel_2_3 = new JLabel("Address");
	    lblNewLabel_2_3.setForeground(Color.BLACK);
	    lblNewLabel_2_3.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_3.setBounds(10, 134, 64, 30);
	    panel_1.add(lblNewLabel_2_3);
	    
	    JLabel lblNewLabel_3_3 = new JLabel("1342 Tondo, Manila");
	    lblNewLabel_3_3.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_3.setBounds(74, 135, 188, 30);
	    panel_1.add(lblNewLabel_3_3);
	    
	    JLabel lblNewLabel_2_4 = new JLabel("School :");
	    lblNewLabel_2_4.setForeground(Color.BLACK);
	    lblNewLabel_2_4.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_4.setBounds(292, 11, 64, 30);
	    panel_1.add(lblNewLabel_2_4);
	    
	    JLabel lblNewLabel_3_4 = new JLabel("National University Manila");
	    lblNewLabel_3_4.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_4.setBounds(356, 12, 188, 30);
	    panel_1.add(lblNewLabel_3_4);
	    
	    JLabel lblNewLabel_2_1_1 = new JLabel("Year : ");
	    lblNewLabel_2_1_1.setForeground(Color.BLACK);
	    lblNewLabel_2_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_1_1.setBounds(292, 52, 64, 30);
	    panel_1.add(lblNewLabel_2_1_1);
	    
	    JLabel lblNewLabel_3_1_1 = new JLabel("3rd term,1st Year");
	    lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_1_1.setBounds(356, 53, 188, 30);
	    panel_1.add(lblNewLabel_3_1_1);
	    
	    JLabel lblNewLabel_2_2_1 = new JLabel("Program : ");
	    lblNewLabel_2_2_1.setForeground(Color.BLACK);
	    lblNewLabel_2_2_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_2_1.setBounds(292, 93, 64, 30);
	    panel_1.add(lblNewLabel_2_2_1);
	    
	    JLabel lblNewLabel_3_2_1 = new JLabel("BS Computer Science ML\r\n");
	    lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_2_1.setBounds(356, 94, 203, 30);
	    panel_1.add(lblNewLabel_3_2_1);
	    
	    JLabel lblNewLabel_2_3_1 = new JLabel("Gmail : ");
	    lblNewLabel_2_3_1.setForeground(Color.BLACK);
	    lblNewLabel_2_3_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_3_1.setBounds(292, 134, 64, 30);
	    panel_1.add(lblNewLabel_2_3_1);
	    
	    JLabel lblNewLabel_3_3_1 = new JLabel("megelnu@gmail.com");
	    lblNewLabel_3_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_3_1.setBounds(356, 135, 188, 30);
	    panel_1.add(lblNewLabel_3_3_1);

	    JPanel hobbies = new JPanel();
	    hobbies.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	    hobbies.setBackground(new Color(240, 240, 240));
	    nameHobbiesPanel.add(hobbies, "hobbiesPanel");
	    hobbies.setLayout(null);

	    JLabel hobbiesTextLabel = new JLabel("Hobbies");
	    hobbiesTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    hobbiesTextLabel.setBounds(102, 14, 78, 20);
	 // ============= Mouse listener Hobbies  cardlayout
	    hobbiesTextLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
	            cardLayout.show(nameHobbiesPanel, "hobbiesPanel");
	        }
	    });
	    hobbies.add(hobbiesTextLabel);
	    
	    // ============= Mouse listener About me cardlayout
	    JLabel aboutMeTextLabel = new JLabel("About me");
	    aboutMeTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    aboutMeTextLabel.setBounds(11, 11, 78, 26);
	    aboutMeTextLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) nameHobbiesPanel.getLayout();
	            cardLayout.show(nameHobbiesPanel, "aboutMePanel");
	        }
	    });
	    hobbies.add(aboutMeTextLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("______________");
	    lblNewLabel_1.setFont(new Font("Anton", Font.PLAIN, 11));
	    lblNewLabel_1.setBounds(99, 23, 64, 14);
	    hobbies.add(lblNewLabel_1);
	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setLayout(null);
	    panel_1_1.setBounds(11, 61, 569, 181);
	    hobbies.add(panel_1_1);
	    
	    JLabel lblNewLabel_2_5 = new JLabel("Hobbies : ");
	    lblNewLabel_2_5.setForeground(Color.BLACK);
	    lblNewLabel_2_5.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_5.setBounds(10, 11, 64, 30);
	    panel_1_1.add(lblNewLabel_2_5);
	    
	    JLabel lblNewLabel_3_5 = new JLabel("Watching Sport Movie");
	    lblNewLabel_3_5.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_5.setBounds(74, 12, 188, 30);
	    panel_1_1.add(lblNewLabel_3_5);
	    
	    JLabel lblNewLabel_2_1_2 = new JLabel("Hobbies 2 : ");
	    lblNewLabel_2_1_2.setForeground(Color.BLACK);
	    lblNewLabel_2_1_2.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_1_2.setBounds(10, 52, 64, 30);
	    panel_1_1.add(lblNewLabel_2_1_2);
	    
	    JLabel lblNewLabel_3_1_2 = new JLabel("Watching Series Movie");
	    lblNewLabel_3_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_1_2.setBounds(74, 53, 188, 30);
	    panel_1_1.add(lblNewLabel_3_1_2);
	    
	    JLabel lblNewLabel_2_2_2 = new JLabel("Hobbies 3 ");
	    lblNewLabel_2_2_2.setForeground(Color.BLACK);
	    lblNewLabel_2_2_2.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_2_2.setBounds(10, 93, 64, 30);
	    panel_1_1.add(lblNewLabel_2_2_2);
	    
	    JLabel lblNewLabel_3_2_2 = new JLabel("Improving myself");
	    lblNewLabel_3_2_2.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_2_2.setBounds(74, 94, 188, 30);
	    panel_1_1.add(lblNewLabel_3_2_2);
	    
	    JLabel lblNewLabel_2_3_2 = new JLabel("Hobbies 4");
	    lblNewLabel_2_3_2.setForeground(Color.BLACK);
	    lblNewLabel_2_3_2.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_3_2.setBounds(10, 134, 64, 30);
	    panel_1_1.add(lblNewLabel_2_3_2);
	    
	    JLabel lblNewLabel_3_3_2 = new JLabel("More Coding and self Learning");
	    lblNewLabel_3_3_2.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_3_2.setBounds(74, 135, 188, 30);
	    panel_1_1.add(lblNewLabel_3_3_2);
	    
	    JLabel lblNewLabel_2_4_1 = new JLabel("Favorite Food : ");
	    lblNewLabel_2_4_1.setForeground(Color.BLACK);
	    lblNewLabel_2_4_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_4_1.setBounds(292, 11, 92, 30);
	    panel_1_1.add(lblNewLabel_2_4_1);
	    
	    JLabel lblNewLabel_3_4_1 = new JLabel("My Mother Cook");
	    lblNewLabel_3_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_4_1.setBounds(381, 12, 188, 30);
	    panel_1_1.add(lblNewLabel_3_4_1);
	    
	    JLabel lblNewLabel_2_1_1_1 = new JLabel("Idol : ");
	    lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
	    lblNewLabel_2_1_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_1_1_1.setBounds(292, 52, 64, 30);
	    panel_1_1.add(lblNewLabel_2_1_1_1);
	    
	    JLabel lblNewLabel_3_1_1_1 = new JLabel("Justin Bieber, Zayn Malik, Klay Thompson");
	    lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_1_1_1.setBounds(356, 53, 188, 30);
	    panel_1_1.add(lblNewLabel_3_1_1_1);
	    
	    JLabel lblNewLabel_2_2_1_1 = new JLabel("Favorite Band");
	    lblNewLabel_2_2_1_1.setForeground(Color.BLACK);
	    lblNewLabel_2_2_1_1.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_2_2_1_1.setBounds(292, 93, 92, 30);
	    panel_1_1.add(lblNewLabel_2_2_1_1);
	    
	    JLabel lblNewLabel_3_2_1_1 = new JLabel("UUD, Maroon 5 , Oasis");
	    lblNewLabel_3_2_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_3_2_1_1.setBounds(381, 94, 178, 30);
	    panel_1_1.add(lblNewLabel_3_2_1_1);
	    
	    JLabel textaboutmelbl = new JLabel("About me");
	    textaboutmelbl.setFont(new Font("Anton", Font.PLAIN, 40));
	    textaboutmelbl.setBounds(520, 22, 177, 86);
	    aboutmePanel.add(textaboutmelbl);
	    
	    JPanel secondpanel = new JPanel();
	    secondpanel.setBounds(645, 364, 589, 253);
	    aboutmePanel.add(secondpanel);
	    secondpanel.setLayout(new CardLayout(0, 0));

	    JPanel education = new JPanel();
	    education.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	    education.setBackground(new Color(240, 240, 240));
	    secondpanel.add(education, "aboutMePanel");
	    education.setLayout(null);

	    JLabel educationlbl = new JLabel("Education");
	    educationlbl.setFont(new Font("Anton", Font.PLAIN, 15));
	    educationlbl.setBounds(10, 11, 78, 26);
	    educationlbl.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
	            cardLayout.show(secondpanel, "aboutMePanel");
	        }
	    });
	    education.add(educationlbl);

	    JLabel skilss = new JLabel("Skill");
	    skilss.setForeground(new Color(0, 0, 0));
	    skilss.setFont(new Font("Anton", Font.PLAIN, 15));
	    skilss.setBounds(102, 14, 78, 20);
	   // ======================= action listener for Skills card layout
	    skilss.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
	            cardLayout.show(secondpanel, "hobbiesPanel");
	        }
	    });
	    education.add(skilss);
	    
	    JLabel lblNewLabel2 = new JLabel("______________");
	    lblNewLabel2.setFont(new Font("Anton", Font.PLAIN, 11));
	    lblNewLabel2.setBounds(10, 23, 64, 14);
	    education.add(lblNewLabel2);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBounds(10, 61, 569, 187);
	    education.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JLabel lblNewLabe3 = new JLabel("Elementary  (2008 - 2016)");
	    lblNewLabe3.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabe3.setForeground(new Color(0, 0, 0));
	    lblNewLabe3.setBounds(10, 11, 180, 30);
	    panel_2.add(lblNewLabe3);
	    
	    JLabel lblNewLabel_4 = new JLabel("Francisco Balagtas Elementary school");
	    lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_4.setBounds(10, 38, 318, 30);
	    panel_2.add(lblNewLabel_4);
	    
	    JLabel lblNewLabel_4_1 = new JLabel("Padre Mariano Gomez Elementary School\r\n");
	    lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_4_1.setBounds(10, 67, 318, 30);
	    panel_2.add(lblNewLabel_4_1);
	    
	    JLabel lblEducation = new JLabel("High School 2016 - 2020");
	    lblEducation.setForeground(Color.BLACK);
	    lblEducation.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblEducation.setBounds(10, 108, 180, 30);
	    panel_2.add(lblEducation);
	    
	    JLabel lblNewLabel_4_2 = new JLabel("Cayetano Arellano High School\r\n");
	    lblNewLabel_4_2.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_4_2.setBounds(10, 135, 294, 30);
	    panel_2.add(lblNewLabel_4_2);
	    
	    JLabel lblSeniorHigh = new JLabel("Senior High 2020 - 2022");
	    lblSeniorHigh.setForeground(Color.BLACK);
	    lblSeniorHigh.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblSeniorHigh.setBounds(314, 11, 222, 30);
	    panel_2.add(lblSeniorHigh);
	    
	    JLabel lblNewLabel_4_3 = new JLabel("Ama Learning Computer Center");
	    lblNewLabel_4_3.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_4_3.setBounds(314, 38, 222, 30);
	    panel_2.add(lblNewLabel_4_3);
	    
	    JLabel lblCollege = new JLabel("College 2022 - current");
	    lblCollege.setForeground(Color.BLACK);
	    lblCollege.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblCollege.setBounds(314, 108, 172, 30);
	    panel_2.add(lblCollege);
	    
	    JLabel lblNewLabel_4_3_1 = new JLabel("National University Manila");
	    lblNewLabel_4_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
	    lblNewLabel_4_3_1.setBounds(314, 135, 234, 30);
	    panel_2.add(lblNewLabel_4_3_1);

	    JPanel skillspanel = new JPanel();
	    skillspanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	    skillspanel.setBackground(new Color(240, 240, 240));
	    secondpanel.add(skillspanel, "hobbiesPanel");
	    skillspanel.setLayout(null);

	    JLabel skillsTextLabel = new JLabel("Skills");
	    skillsTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    skillsTextLabel.setBounds(102, 14, 78, 20);
	    // ======================= action listener for Skills card layout
	    skillsTextLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
	            cardLayout.show(secondpanel, "hobbiesPanel");
	        }
	    });
	    skillspanel.add(skillsTextLabel);
	    // ======================= action listener for educational card layout
	    JLabel educTextLabel = new JLabel("Education");
	    educTextLabel.setFont(new Font("Anton", Font.PLAIN, 15));
	    educTextLabel.setBounds(11, 11, 78, 26);
	    educTextLabel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            CardLayout cardLayout = (CardLayout) secondpanel.getLayout();
	            cardLayout.show(secondpanel, "aboutMePanel");
	        }
	    });
	    skillspanel.add(educTextLabel);
	    
	    JLabel lblNewLabel_20 = new JLabel("______________");
	    lblNewLabel_20.setFont(new Font("Anton", Font.PLAIN, 11));
	    lblNewLabel_20.setBounds(99, 23, 64, 14);
	    skillspanel.add(lblNewLabel_20);
	    
	    JPanel panel2 = new JPanel();
	    panel2.setLayout(null);
	    panel2.setBounds(11, 61, 569, 171);
	    skillspanel.add(panel2);
	    
	    JLabel lblNewLabel_21 = new JLabel("Java");
	    lblNewLabel_21.setForeground(Color.BLACK);
	    lblNewLabel_21.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_21.setBounds(10, 11, 64, 30);
	    panel2.add(lblNewLabel_21);
	    
	    JLabel lblNewLabel235 = new JLabel("HTML");
	    lblNewLabel235.setForeground(Color.BLACK);
	    lblNewLabel235.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel235.setBounds(10, 52, 64, 30);
	    panel2.add(lblNewLabel235);
	    
	    JLabel lblNewLabel_25 = new JLabel("CSS");
	    lblNewLabel_25.setForeground(Color.BLACK);
	    lblNewLabel_25.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_25.setBounds(10, 93, 64, 30);
	    panel2.add(lblNewLabel_25);
	    
	    JLabel lblNewLabel_27 = new JLabel("PHP");
	    lblNewLabel_27.setForeground(Color.BLACK);
	    lblNewLabel_27.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_27.setBounds(10, 134, 64, 30);
	    panel2.add(lblNewLabel_27);
	    
	    JLabel lblNewLabel_29 = new JLabel("Python");
	    lblNewLabel_29.setForeground(Color.BLACK);
	    lblNewLabel_29.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_29.setBounds(88, 11, 181, 30);
	    panel2.add(lblNewLabel_29);
	    
	    JLabel lblNewLabel_31 = new JLabel("Photoshop Adobe");
	    lblNewLabel_31.setForeground(Color.BLACK);
	    lblNewLabel_31.setFont(new Font("Anton", Font.PLAIN, 14));
	    lblNewLabel_31.setBounds(88, 52, 181, 30);
	    panel2.add(lblNewLabel_31);
	    
	    JLabel etext1lbl = new JLabel("Hello, my name is Miguel Polison, and I'm 20-years-old programmer from Tondo, Manila");
	    etext1lbl.setForeground(new Color(0, 0, 0));
	    etext1lbl.setFont(new Font("Anton", Font.PLAIN, 16));
	    etext1lbl.setBounds(520, 116, 642, 20);
	    aboutmePanel.add(etext1lbl);
	    
	    JLabel lbl2 = new JLabel("I'm Currectly a freshman at National University of Manila, where I'm pursuing a degree in");
	    lbl2.setForeground(new Color(0, 0, 0));
	    lbl2.setFont(new Font("Anton", Font.PLAIN, 16));
	    lbl2.setBounds(520, 138, 589, 20);
	    aboutmePanel.add(lbl2);
	    
	    JLabel lbl3 = new JLabel("computer science with a machine learning concentration.");
	    lbl3.setForeground(new Color(0, 0, 0));
	    lbl3.setFont(new Font("Anton", Font.PLAIN, 16));
	    lbl3.setBounds(520, 162, 589, 20);
	    aboutmePanel.add(lbl3);
	    
	    JLabel lbl4 = new JLabel("");
	    lbl4.setIcon(astrount2);
	    lbl4.setBounds(150, 11, 362, 333);
	    aboutmePanel.add(lbl4);
	    
	    JLabel lbl5 = new JLabel("In addition, I also run a Photobooth business, where I provide fun and interactive photo ");
	    lbl5.setFont(new Font("Anton", Font.PLAIN, 16));
	    lbl5.setBounds(520, 209, 589, 20);
	    aboutmePanel.add(lbl5);
	    
	    JLabel lbl6 = new JLabel("experiences for various events. It's an exciting combination of my programming skills and");
	    lbl6.setFont(new Font("Anton", Font.PLAIN, 16));
	    lbl6.setBounds(520, 231, 589, 20);
	    aboutmePanel.add(lbl6);
	    
	    JLabel lbl7 = new JLabel("my passion for creating memorable moments for people.");
	    lbl7.setFont(new Font("Anton", Font.PLAIN, 16));
	    lbl7.setBounds(520, 255, 589, 20);
	    aboutmePanel.add(lbl7);
    }
    
    
    @Override
	public void addProject() {
    //  project
   projecthistoryPanel = new JPanel();
   projecthistoryPanel.setLayout(null);
   projecthistoryPanel.setBounds(0, 1348, 1261, 606);
   scrollContent.add(projecthistoryPanel);
    			
   JLabel textproject1 = new JLabel("Project History");
   textproject1.setFont(new Font("Anton", Font.PLAIN, 60));
   textproject1.setBounds(455, 11, 362, 91);
   projecthistoryPanel.add(textproject1);
    			
   JLabel textproject1_2 = new JLabel("This was my project when I was in senior high school, and this is my latest");
   textproject1_2.setBounds(364, 517, 686, 72);
   projecthistoryPanel.add(textproject1_2);
   textproject1_2.setFont(new Font("Anton", Font.PLAIN, 20));
    			
   JLabel textproject1_3 = new JLabel("project since I started studying as a Computer Science student.");
   textproject1_3.setBounds(409, 550, 710, 72);
   projecthistoryPanel.add(textproject1_3);
   textproject1_3.setFont(new Font("Anton", Font.PLAIN, 20));
    			
   JPanel projecthistorypanel2 = new JPanel();
   projecthistorypanel2.setBounds(10, 97, 1241, 421);
   projecthistoryPanel.add(projecthistorypanel2);
   projecthistorypanel2.setLayout(null);
    			
   JPanel project1panel = new JPanel();
   project1panel.setBounds(24, 11, 423, 327);
   projecthistorypanel2.add(project1panel);
   project1panel.setLayout(null);

    JLabel projectimage1 = new JLabel();
    projectimage1.setIcon(project1);
    projectimage1.setBounds(0, 0, 423, 327);
    projectimage1.addMouseListener(new MouseAdapter() {
     @Override
        public void mouseEntered(MouseEvent e) {
    			 projectimage1.setBounds(projectimage1.getX() + 350, projectimage1.getY(), 400, 327);
    		 }

    @Override
    		public void mouseExited(MouseEvent e) {
    			 projectimage1.setBounds(projectimage1.getX() - 350, projectimage1.getY(), 423, 327);
    			}
    	});
    	project1panel.add(projectimage1);
    			
    	JLabel firstprojectlbl = new JLabel("First Project");
    	firstprojectlbl.setBounds(0, 0, 160, 48);
    	project1panel.add(firstprojectlbl);
    	firstprojectlbl.setFont(new Font("Anton", Font.PLAIN, 20));
    						
    	JLabel textproject1_4 = new JLabel("This was my first project, an HTML CSS login form,");
    	textproject1_4.setBounds(0, 59, 403, 34);
    	project1panel.add(textproject1_4);
    	textproject1_4.setFont(new Font("Anton", Font.PLAIN, 15));
    									
    	JLabel textproject1_2_5 = new JLabel("which I created during my 11th-grade year.");
    	textproject1_2_5.setBounds(0, 86, 403, 34);
    	project1panel.add(textproject1_2_5);
    	textproject1_2_5.setFont(new Font("Anton", Font.PLAIN, 15));


    	JPanel project2panel = new JPanel();
    	project2panel.setBounds(486, 11, 353, 327);
    	projecthistorypanel2.add(project2panel);
    	project2panel.setLayout(null);
    			
    	JLabel imageproject2 = new JLabel("");
    	imageproject2.setBounds(0, 0, 353, 327);
    	project2panel.add(imageproject2);
    	imageproject2.setIcon(project4);
    	imageproject2.addMouseListener(new MouseAdapter() {
    	@Override
    		public void mouseEntered(MouseEvent e) {
    		  imageproject2.setBounds(imageproject2.getX(), imageproject2.getY() + 200, 353, 327);
    	 }

    	@Override
    	 public void mouseExited(MouseEvent e) {
    			 imageproject2.setBounds(imageproject2.getX(), imageproject2.getY() - 200, 353, 327);
    		 }
    	});
    			
    	JLabel textproject2 = new JLabel("Second Project");
    	textproject2.setFont(new Font("Anton", Font.PLAIN, 20));
    	textproject2.setBounds(10, 11, 167, 40);
    	project2panel.add(textproject2);
    			
    	JLabel textproject2_2 = new JLabel("This is my second project, the Bohol ");
    	textproject2_2.setFont(new Font("Anton", Font.PLAIN, 15));
    	textproject2_2.setBounds(10, 62, 241, 40);
    	project2panel.add(textproject2_2);
    			
    	JLabel textproject2_3 = new JLabel("Booking System, which was the reason");
    	textproject2_3.setFont(new Font("Anton", Font.PLAIN, 15));
    	textproject2_3.setBounds(10, 85, 241, 40);
    	project2panel.add(textproject2_3);
    			
    	JLabel textporject2_4 = new JLabel("I graduated from Grade 12.");
    	textporject2_4.setFont(new Font("Anton", Font.PLAIN, 15));
    	textporject2_4.setBounds(10, 104, 241, 40);
    	project2panel.add(textporject2_4);
    			
    	JPanel project3panel = new JPanel();
    	project3panel.setBounds(921, 11, 310, 327);
    	projecthistorypanel2.add(project3panel);
    	project3panel.setLayout(null);
    			
    JLabel imageproject5 = new JLabel("");
    imageproject5.setIcon(project5);
    imageproject5.setBounds(0, 0, 310, 327);
    project3panel.add(imageproject5);
    imageproject5.addMouseListener(new MouseAdapter() {
    	  @Override
    		public void mouseEntered(MouseEvent e) {
    			imageproject5.setBounds(imageproject5.getX(), imageproject5.getY() + 200, 353, 327);
    			    }
    	 @Override
    		public void mouseExited(MouseEvent e) {
    			imageproject5.setBounds(imageproject5.getX(), imageproject5.getY() - 200, 353, 327);
    	    }
    	});		
    			
    JLabel textproject3 = new JLabel("Third Project");
    textproject3.setFont(new Font("Anton", Font.PLAIN, 20));
    textproject3.setBounds(10, 11, 185, 40);
    project3panel.add(textproject3);
    			
    JLabel textproject3_2 = new JLabel("This is my third project, an Instagram login");
    textproject3_2.setFont(new Font("Anton", Font.PLAIN, 15));
    textproject3_2.setBounds(10, 62, 290, 40);
    project3panel.add(textproject3_2);
    			
    JLabel textproject3_3 = new JLabel("form. I created this during my first year,");
    textproject3_3.setFont(new Font("Anton", Font.PLAIN, 15));
    textproject3_3.setBounds(10, 86, 290, 40);
    project3panel.add(textproject3_3);
    			
    JLabel textproject3_4 = new JLabel("second semester, and I was recognized as one");
    textproject3_4.setFont(new Font("Anton", Font.PLAIN, 15));
    textproject3_4.setBounds(10, 113, 290, 40);
    project3panel.add(textproject3_4);
    			
    JLabel textproject3_5 = new JLabel("of the top 5 for designing this interface.");
    textproject3_5.setFont(new Font("Anton", Font.PLAIN, 15));
    textproject3_5.setBounds(10, 145, 290, 40);
    project3panel.add(textproject3_5);
		
	}
		
    
    // implementation of the WorkExperience interface
    public void addWorkExperiencePanel() {
        // code to add the work experience panel
    	
    	 //=============PANEL WORK EXPERIENCE PANEK =======
	     WorkExperiencePanel = new JPanel();
	    WorkExperiencePanel.setBounds(0, 1950, 1261, 606);
	    scrollContent.add(WorkExperiencePanel);
	    WorkExperiencePanel.setLayout(null);
	    
	    WorkPhotoGalleryPanel = new JPanel();
	    WorkPhotoGalleryPanel.setBounds(241, 138, 819, 297);
	    WorkExperiencePanel.add(WorkPhotoGalleryPanel);
	    WorkPhotoGalleryPanel.setLayout(null);
	    JLabel textworkexperiencelbl = new JLabel("WORK EXPERIENCE");
	    textworkexperiencelbl.setFont(new Font("Anton", Font.PLAIN, 99));
	    textworkexperiencelbl.setBounds(328, 42, 675, 87);
	    WorkExperiencePanel.add(textworkexperiencelbl);
	    
	    JPanel Gallery1 = new JPanel();
	    Gallery1.setBounds(282, 0, 252, 297);
	    WorkPhotoGalleryPanel.add(Gallery1);
	    Gallery1.setLayout(null);

	    JLabel work1lbl = new JLabel("");
	    work1lbl.setIcon(work1);
	    work1lbl.setBounds(0, 0, 252, 297);
	    Gallery1.add(work1lbl);
	    work1lbl.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseEntered(MouseEvent e) {
	        	work1lbl.setLocation(work1lbl.getX(), work1lbl.getY() - 60);
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	        	work1lbl.setLocation(work1lbl.getX(), work1lbl.getY() + 60);
	        }
	    });
	    
	    JLabel lblNewLabel_9 = new JLabel("Jan 13 2021");
	    lblNewLabel_9.setBounds(65, 234, 127, 52);
	    lblNewLabel_9.setFont(new Font("Anton", Font.PLAIN, 15));
	    Gallery1.add(lblNewLabel_9);

	    JPanel Gallery2 = new JPanel();
	    Gallery2.setBounds(567, 0, 252, 297);
	    WorkPhotoGalleryPanel.add(Gallery2);
	    Gallery2.setLayout(null);
	    // ===== picture 2 float e
	    
	    JLabel work2lbl = new JLabel("");
	    work2lbl.setIcon(work2);
	    work2lbl.setBounds(0, 0, 252, 297);
	    Gallery2.add(work2lbl);
	    work2lbl.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseEntered(MouseEvent e) {
	        	work2lbl.setLocation(work2lbl.getX(), work2lbl.getY() - 60);
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	        	work2lbl.setLocation(work2lbl.getX(), work2lbl.getY() + 60);
	        }
	    });
	    
	    JLabel lblNewLabel_8 = new JLabel("May 2018 - Current");
	    lblNewLabel_8.setBounds(58, 235, 143, 51);
	    lblNewLabel_8.setFont(new Font("Anton", Font.PLAIN, 15));
	    Gallery2.add(lblNewLabel_8);

	    
	    JPanel Gallery3 = new JPanel();
	    Gallery3.setBounds(0, 0, 252, 297);
	    WorkPhotoGalleryPanel.add(Gallery3);
	    Gallery3.setLayout(null);
	    // picture 1 effect float
	    Gallery3.addMouseListener(new MouseAdapter() {
	    	 @Override
	    	public void mouseEntered(MouseEvent e) {
	    		Gallery3.setLocation(Gallery3.getX(), Gallery3.getY() - 60);
	    		  }

	    		@Override
	    		 public void mouseExited(MouseEvent e) {
	    		  Gallery3.setLocation(Gallery3.getX(), Gallery3.getY() + 60);
	    		  }
	    	});
	    		    
	    JLabel work3lbl = new JLabel("");
	    work3lbl.setIcon(work3);
	     work3lbl.setBounds(0, 0, 252, 297);
	    Gallery3.add(work3lbl);
	    
	    JLabel lblNewLabel_5 = new JLabel("July 2022 - Jan 2023");
	    lblNewLabel_5.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblNewLabel_5.setBounds(65, 234, 143, 52);
	    WorkPhotoGalleryPanel.add(lblNewLabel_5);
	    
	    JLabel motivationlbl = new JLabel("\"Start where you are. Use what you have. Do What you can.\"");
	    motivationlbl.setFont(new Font("Anton", Font.PLAIN, 33));
	    motivationlbl.setBounds(241, 460, 819, 72);
	    WorkExperiencePanel.add(motivationlbl);
    }

    
    // implementation of the Contact interface
    public void addContactPanel() {
        // code to add the contact panel
    	
    	 ContactPanel = new JPanel();
	    ContactPanel.setBounds(0, 2487, 1261, 124);
	    scrollContent.add(ContactPanel);
	    ContactPanel.setLayout(null);
	    
	    JLabel lblNewLabel_7 = new JLabel("Contact");
	    lblNewLabel_7.setFont(new Font("Anton", Font.PLAIN, 20));
	    lblNewLabel_7.setBounds(600, 78, 69, 35);
	    ContactPanel.add(lblNewLabel_7);
	    
	    JLabel facebooklbl = new JLabel("");
	    facebooklbl.setIcon(facebook);
	    facebooklbl.setBounds(10, 73, 46, 40);
	    ContactPanel.add(facebooklbl);
	    
	    JLabel facebooktextlbl = new JLabel("Polison13");
	    facebooktextlbl.setFont(new Font("Anton", Font.PLAIN, 11));
	    facebooktextlbl.setBounds(59, 87, 136, 14);
	    ContactPanel.add(facebooktextlbl);
	    
	    JLabel gmailiconlbl = new JLabel("");
	    gmailiconlbl.setIcon(gmail);
	    gmailiconlbl.setBounds(205, 73, 46, 40);
	    ContactPanel.add(gmailiconlbl);
	    
	    JLabel gmailbl = new JLabel("megelnu@gmail.com");
	    gmailbl.setFont(new Font("Anton", Font.PLAIN, 11));
	    gmailbl.setBounds(261, 87, 136, 14);
	    ContactPanel.add(gmailbl);
	    
	    JLabel telegram1 = new JLabel("");
	    telegram1.setIcon(telegram);
	    telegram1.setBounds(862, 73, 389, 40);
	    ContactPanel.add(telegram1);
	    
	    JLabel contact1lbl = new JLabel("09694540477");
	    contact1lbl.setFont(new Font("Anton", Font.PLAIN, 11));
	    contact1lbl.setBounds(918, 87, 333, 14);
	    ContactPanel.add(contact1lbl);
	    
	    JLabel telegram2 = new JLabel("");
	    telegram2.setIcon(telegram);
	    telegram2.setBounds(1114, 73, 137, 40);
	    ContactPanel.add(telegram2);
	    
	    JLabel gmailbl_2 = new JLabel("09668992983");
	    gmailbl_2.setFont(new Font("Anton", Font.PLAIN, 11));
	    gmailbl_2.setBounds(1170, 87, 81, 14);
	    ContactPanel.add(gmailbl_2);
	    
	    JSeparator separator = new JSeparator();
	    separator.setBounds(10, 38, 1241, -7);
	    ContactPanel.add(separator);

	    
	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
    }
    

    // JPANEL NAMING ACTION LISTENER
 	private class PanelButtonMouseAdapter extends MouseAdapter{
 			
 			JPanel panel;
 			public PanelButtonMouseAdapter(JPanel panel) {
 				this.panel = panel;
 			}
 			public void mouseEntered(MouseEvent e){
 				
 				panel.setBackground(new Color(240,  240, 240));
 			}
 			
 			@Override
 			public void mouseExited(MouseEvent e) {
 				panel.setBackground(new Color(0, 0, 0));
 			}
 			
 			@Override
 			public void mousePressed(MouseEvent e){
 				panel.setBackground(new Color(240,  240, 240));
 			} 
 			
 			@Override
 			public void mouseReleased(MouseEvent e){
 				panel.setBackground(new Color(240,  240, 240));
 			}
 		}


    
}
