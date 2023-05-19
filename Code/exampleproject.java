package Portfolio;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class exampleproject extends JFrame {
	private ImageIcon logo = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\mainOOPproject\\src\\asset\\logo.jpg")
					.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exampleproject frame = new exampleproject();
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
	public exampleproject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(28, 11, 210, 226);
		contentPane.add(panel);
		panel.setLayout(null);

		
		JLabel lblNewLabel = new JLabel(logo);
		lblNewLabel.setBounds(0, 5, 210, 221);
		panel.add(lblNewLabel);

		panel.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        panel.setBounds(panel.getX(), panel.getY(), 400, 400); // Expand panel to 400x400
		        lblNewLabel.setBounds(0, 5, 400, 400); // Expand label to 400x400
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        panel.setBounds(panel.getX(), panel.getY(), 210, 226); // Restore original size
		        lblNewLabel.setBounds(0, 5, 210, 221); // Restore original size
		    }
		});



		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(297, 11, 210, 226);
		contentPane.add(panel_1);

		panel_1.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        panel_1.setBounds(panel_1.getX(), panel_1.getY(), 400, 400);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        panel_1.setBounds(panel_1.getX(), panel_1.getY(), 210, 226);
		    }
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 255));
		panel_2.setBounds(28, 294, 210, 226);
		contentPane.add(panel_2);

		panel_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        panel_2.setBounds(panel_2.getX(), panel_2.getY(), 400, 400);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        panel_2.setBounds(panel_2.getX(), panel_2.getY(), 210, 226);
		    }
		});

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 0));
		panel_3.setBounds(297, 278, 210, 226);
		contentPane.add(panel_3);

		panel_3.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        int x = panel_3.getX() - 95;  // Subtract half of the width increase
		        int y = panel_3.getY();
		        panel_3.setBounds(x, y, 400, 226);
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        int x = panel_3.getX() + 95;  // Add half of the width decrease
		        int y = panel_3.getY();
		        panel_3.setBounds(x, y, 210, 226);
		    }
		});


	}
}
