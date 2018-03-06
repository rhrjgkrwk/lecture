package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.dao.MemberDao;
import com.model.Member;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 * 
	 * @throws SQLException
	 */
	

	/**
	 * Create the frame.
	 * 
	 * @throws SQLException
	 */
	public Register() throws SQLException {
		Connection con1 = null;
		Scanner sc1 = new Scanner(System.in);
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 316);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		MemberDao t = new MemberDao();
		t.conn();

		JLabel lblId = new JLabel("ID");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(12, 13, 57, 15);
		contentPane.add(lblId);

		JLabel lblPw = new JLabel("PW");
		lblPw.setForeground(new Color(255, 255, 255));
		lblPw.setBounds(12, 74, 57, 15);
		contentPane.add(lblPw);

		JLabel lblNewLabel = new JLabel("\uB2C9\uB124\uC784"); // �г�
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(12, 111, 57, 15);
		contentPane.add(lblNewLabel);

		JLabel label_1 = new JLabel("\uB098\uC774"); // ����
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(12, 147, 57, 15);
		contentPane.add(label_1);

		JLabel label = new JLabel("\uC0AC\uB294\uC9C0\uC5ED"); // �������
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(12, 183, 57, 15);
		contentPane.add(label);

		JLabel lblNewLabel_1 = new JLabel("\uC774\uBA54\uC77C"); // �̸���
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(12, 217, 57, 15);
		contentPane.add(lblNewLabel_1);

		///////////////////////////////////////////////////////////////
		textField = new JTextField(); // ID�Է�â
		textField.setBounds(81, 10, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);

		

		passwordField = new JPasswordField(); // PW�Է�â.
		passwordField.setBounds(81, 70, 116, 21);
		contentPane.add(passwordField);
		

		textField_2 = new JTextField(); // �г���
		textField_2.setBounds(81, 106, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		

		textField_3 = new JTextField();// ����
		textField_3.setBounds(81, 142, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		

		textField_4 = new JTextField();// �������
		textField_4.setBounds(81, 178, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		

		textField_5 = new JTextField(); // �̸��� �Է�â
		textField_5.setBounds(81, 214, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("\uAC00\uC785"); //���� ��ư
		btnNewButton.setBackground(new Color(204, 153, 0));
		btnNewButton.setForeground(new Color(51, 51, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Member m = new Member(textField.getText() , passwordField.getText(), textField_2.getText(), Integer.parseInt(textField_3.getText()) , textField_4.getText(), textField_5.getText());
				try {
					if (t.isDuplicate(m.getId())) {
						JOptionPane.showMessageDialog(null, " ID�� �ߺ��Ǿ���. �ٽ� �õ��غ���");
						System.out.println(" �ٽ� �õ����ּ���!");
					}
					else if(t.insertMember(m)) {
						JOptionPane.showMessageDialog(null, "���� �����ߴ�!");
						Login l = new Login();
						l.setVisible(true);
						dispose();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, " �ٽ� �õ����ּ���!");
					System.out.println(" �ٽ� �õ����ּ���!");
					}
				
			}
		});
		btnNewButton.setBounds(81, 245, 116, 19);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\uC911\uBCF5\uCCB4\uD06C"); //�ߺ�üũ
		btnNewButton_1.setBackground(new Color(204, 153, 51));
		btnNewButton_1.setForeground(new Color(51, 51, 51));
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(t.isDuplicate(textField.getText())){
						JOptionPane.showMessageDialog(null, "�ٽ��ؿ�...");
					}else  JOptionPane.showMessageDialog(null, "������! ���!");
				} catch (HeadlessException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(81, 39, 116, 21);
		contentPane.add(btnNewButton_1);
		
	}
}
