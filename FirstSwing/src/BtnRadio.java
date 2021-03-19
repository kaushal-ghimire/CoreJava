import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BtnRadio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BtnRadio frame = new BtnRadio();
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
	public BtnRadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(29, 41, 416, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton regular = new JRadioButton("REGULAR");
		regular.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times of Roman",Font.PLAIN,18));
			}
		});
		regular.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		regular.setBounds(130, 119, 127, 25);
		contentPane.add(regular);
		
		JRadioButton bold = new JRadioButton("BOLD");
		bold.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			    textField.setFont(new Font("Times of Roman",Font.BOLD,18));
			}
		});
		bold.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bold.setBounds(130, 162, 127, 25);
		contentPane.add(bold);
		
		JRadioButton italic = new JRadioButton("ITALIC");
		italic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				  textField.setFont(new Font("Times of Roman",Font.ITALIC,18));
			}
		});
		italic.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		italic.setBounds(130, 203, 127, 25);
		contentPane.add(italic);
		
		JRadioButton bolditalic = new JRadioButton("BOLD & ITALIC");
		bolditalic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textField.setFont(new Font("Times of Roman",Font.BOLD + Font.ITALIC,18));
			}
		});
		bolditalic.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bolditalic.setBounds(130, 244, 176, 25);
		contentPane.add(bolditalic);
		
		ButtonGroup btnGrp = new ButtonGroup();
		btnGrp.add(regular);
		btnGrp.add(bold);;
		btnGrp.add(italic);;
		btnGrp.add(bolditalic);
	}
}
