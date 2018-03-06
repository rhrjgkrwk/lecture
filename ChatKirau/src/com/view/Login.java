package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.dao.MemberDao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_ID;
	private JPasswordField textField_PW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		MemberDao t = new MemberDao();
		t.conn() ;
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 150);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton button_1 = new JButton("회원가입");
		button_1.setBackground(new Color(204, 153, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					com.view.Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				dispose() ;
			}
		});
		button_1.setBounds(121, 79, 97, 23);
		contentPane.add(button_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(12, 13, 57, 15);
		contentPane.add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setForeground(new Color(255, 255, 255));
		lblPw.setBounds(12, 41, 57, 15);
		contentPane.add(lblPw);
		
		textField_ID = new JTextField();
		textField_ID.setBounds(81, 10, 137, 21);
		contentPane.add(textField_ID);
		textField_ID.setColumns(10);
		
		/*Scanner sc1 = new Scanner(System.in);
		String ID = sc1.nextLine();
		*/
		
		textField_PW = new JPasswordField();
		textField_PW.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						if (t.loginCheck(textField_ID.getText(), textField_PW.getText())) {
							JOptionPane.showMessageDialog(null, "로그인성공");
							ChatKirauClient frame = new ChatKirauClient(t.getMemberById(textField_ID.getText()));
							dispose();
							frame.setVisible(true);
						}  
						else 
							JOptionPane.showMessageDialog(null, "로그인실패");
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
				}
			}
		});
		textField_PW.setBounds(81, 38, 137, 21);
		contentPane.add(textField_PW);
		textField_PW.setColumns(10);
		
		
		JButton button = new JButton("로그인");
		button.setBackground(new Color(204, 153, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (t.loginCheck(textField_ID.getText(), textField_PW.getText())) {
						JOptionPane.showMessageDialog(null, "로그인성공");
						ChatKirauClient frame = new ChatKirauClient(t.getMemberById(textField_ID.getText()));
						dispose();
						frame.setVisible(true);
					}  
					else 
						JOptionPane.showMessageDialog(null, "로그인실패");
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
		});
		button.setBounds(12, 79, 97, 23);
		contentPane.add(button);
		
			}
}
