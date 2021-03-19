import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Window.Type;

public class JMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
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
	public JMenu() {
		setForeground(new Color(240, 128, 128));
		setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		setTitle("Login_Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 464);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		javax.swing.JMenu mnNewMenu = new javax.swing.JMenu("File");
		mnNewMenu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu);
		
		javax.swing.JMenu mnNewMenu_3 = new javax.swing.JMenu("New");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Java Project");
		mnNewMenu_3.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Project");
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_3.add(separator);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Package");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Class");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Interface");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Open File");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Close");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Close All");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Save As");
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Save All");
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Exit");
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_16);
		
		javax.swing.JMenu mnNewMenu_1 = new javax.swing.JMenu("Edit");
		mnNewMenu_1.setForeground(Color.DARK_GRAY);
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Undo Typing");
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Redo");
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_1.add(separator_4);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Copy");
		mnNewMenu_1.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Cut");
		mnNewMenu_1.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Paste");
		mnNewMenu_1.add(mntmNewMenuItem_15);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1.add(separator_5);
		
		javax.swing.JMenu mnNewMenu_2 = new javax.swing.JMenu("Design");
		mnNewMenu_2.setForeground(Color.DARK_GRAY);
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Font");
		mnNewMenu_2.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Alignment");
		mnNewMenu_2.add(mntmNewMenuItem_18);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_2.add(separator_7);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Foreground");
		mnNewMenu_2.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Background");
		mnNewMenu_2.add(mntmNewMenuItem_20);
		
		javax.swing.JMenu mnNewMenu_4 = new javax.swing.JMenu("Search");
		mnNewMenu_4.setForeground(Color.DARK_GRAY);
		mnNewMenu_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_4);
		
		javax.swing.JMenu mnNewMenu_5 = new javax.swing.JMenu("Plugins");
		mnNewMenu_4.add(mnNewMenu_5);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Swing Designer");
		mnNewMenu_5.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("JFrame");
		mnNewMenu_5.add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("JMenuBar");
		mnNewMenu_5.add(rdbtnmntmNewRadioItem_2);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_5.add(separator_6);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("JMenu");
		mnNewMenu_5.add(rdbtnmntmNewRadioItem_3);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_4 = new JRadioButtonMenuItem("JMenuItem");
		mnNewMenu_5.add(rdbtnmntmNewRadioItem_4);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Java Swing Application");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(31, 75, 309, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Change Text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Creating JMenu...");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(123, 137, 132, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail or Phone Number :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setBounds(-3, 193, 278, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password Field :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(100, 269, 175, 34);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(281, 208, 242, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(281, 269, 197, 31);
		contentPane.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Password Submitted.");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(217, 332, 132, 25);
		contentPane.add(btnNewButton_1);
	}
}
