package hellopkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTextField;

public class WinApp extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinApp frame = new WinApp();
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
	public WinApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 171);
		getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(82, 72, 1, 1);
		getContentPane().add(list);
		
		JButton button = new JButton("\uB85C\uADF8\uC778");
		button.setBounds(26, 83, 97, 23);
		getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(92, 24, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 52, 116, 21);
		getContentPane().add(textField_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(26, 27, 57, 15);
		getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(26, 55, 57, 15);
		getContentPane().add(lblPw);
		
		JButton button_1 = new JButton("회원가입");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//여기서 회원가입창을 띄우자
				
			}
		});
		button_1.setBounds(134, 83, 97, 23);
		getContentPane().add(button_1);
		
		JLabel lblIdpw = new JLabel("ID/PW\uB97C \uC783\uC5B4\uBC84\uB9AC\uC168\uB098\uC694??\r\n");
		lblIdpw.setBounds(36, 116, 172, 15);
		getContentPane().add(lblIdpw);
		
		
	}
}
