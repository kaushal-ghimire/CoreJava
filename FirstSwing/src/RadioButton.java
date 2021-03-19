import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButton extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(97, 29, 300, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnRegular = new JRadioButton("REGULAR");
		rdbtnRegular.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				textField.setFont(new Font("Times New Roman" , Font.PLAIN , 18));
			}
		});
		rdbtnRegular.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnRegular.setBounds(114, 109, 127, 25);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnItalic = new JRadioButton("ITALIC");
		rdbtnItalic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman" , Font.ITALIC , 18));
			}
		});
		rdbtnItalic.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnItalic.setBounds(114, 164, 127, 25);
		contentPane.add(rdbtnItalic);
		
		JRadioButton rdbtnBold = new JRadioButton("BOLD");
		rdbtnBold.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman" , Font.BOLD , 18));
			}
		});
		rdbtnBold.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnBold.setBounds(114, 219, 127, 25);
		contentPane.add(rdbtnBold);
		
		JRadioButton rdbtnBoldItalic = new JRadioButton("BOLD & ITALIC");
		rdbtnBoldItalic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times New Roman" ,Font.BOLD + Font.ITALIC , 18));
			}
		});
		rdbtnBoldItalic.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnBoldItalic.setBounds(114, 276, 168, 25);
		contentPane.add(rdbtnBoldItalic);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String msg ="Change Font";
				JOptionPane.showMessageDialog(null, "Font Selected : "+msg);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(213, 343, 136, 25);
		contentPane.add(btnNewButton);
		
		ButtonGroup BtnGrp= new ButtonGroup();
		BtnGrp.add(rdbtnRegular);
		BtnGrp.add(rdbtnItalic);
		BtnGrp.add(rdbtnBold);
		BtnGrp.add(rdbtnBoldItalic);
		
	}
}
