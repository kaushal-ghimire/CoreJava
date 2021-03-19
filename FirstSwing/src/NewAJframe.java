import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewAJframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtNext;
	private JTextField txtFinish;
	private JTextField txtDecline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAJframe frame = new NewAJframe();
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
	public NewAJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(UIManager.getBorder("Button.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Do you want complete setup...");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 43, 408, 34);
		contentPane.add(lblNewLabel);
		
		txtNext = new JTextField();
		txtNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblNewLabel.setText("Proceed more to complete....");
				
				JOptionPane.showMessageDialog(null,"Proceed more to complete");
			}
		});
		txtNext.setHorizontalAlignment(SwingConstants.CENTER);
		txtNext.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtNext.setText("NEXT");
		txtNext.setBounds(53, 142, 65, 22);
		contentPane.add(txtNext);
		txtNext.setColumns(10);
		
		txtFinish = new JTextField();
		txtFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Setup Completed...");
			}
		});
		txtFinish.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinish.setText("FINISH");
		txtFinish.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtFinish.setBounds(169, 142, 82, 22);
		contentPane.add(txtFinish);
		txtFinish.setColumns(10);
		
		txtDecline = new JTextField();
		txtDecline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Cancel if you don't want installation....");
			}
		});
		txtDecline.setHorizontalAlignment(SwingConstants.CENTER);
		txtDecline.setText("DECLINE");
		txtDecline.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtDecline.setBounds(296, 142, 89, 22);
		contentPane.add(txtDecline);
		txtDecline.setColumns(10);
	}
}
