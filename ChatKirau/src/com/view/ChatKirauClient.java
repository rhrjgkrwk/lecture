package com.view;

import java.awt.EventQueue;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Member;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ChatKirauClient extends JFrame {

	JPanel contentPane;
	JTextField textField = new JTextField();
	static JTextArea textArea = new JTextArea();
	JButton btnNewButton = new JButton("보내기");
	static String name; // Member 클래스를 받아서 사용.
	static boolean flag = false;
	private final JLabel label_1 = new JLabel("\uB300\uD654\uCC3D");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ChatKirauClient(Member member) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\student\\\uC2A4\uD130\uB514\\icon.png"));
		setResizable(false);
		String serverIP = "70.12.109.101"; // 서버 아이피는 일단 내걸로 하잡.
		int port = 4569; // 임시 포트 설정.
		name = member.getnName();

		try { // 서버에 접속하고 채팅프로그램을 실행시켜보자.
			Socket socket = new Socket(serverIP, port); // 소켓을 생성하자.
			System.out.println("서버에 연결되었습니다.");

			ClientSender sender = new ClientSender(socket, name);
			Thread receiver = new Thread(new ClientReceiver(socket));

			receiver.start();

			setTitle("\uCC57\uD0A4\uB77C\uC6B0");
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 503, 643);
			// setUndecorated(true);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(51, 51, 51));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			textField.setForeground(new Color(31, 44, 61));
			textField.setFont(new Font("맑은 고딕", Font.PLAIN, 12));

			textField.setBounds(12, 542, 389, 52);
			contentPane.add(textField);
			textField.setColumns(10);
			textField.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						if (textField.getText() != "" && textField.getText() != null) {
							sender.sendMessage(textField.getText()); //접속자
							// 리스트 중 선택된 사람에게.
						}
						textField.setText("");
					}
				}
			});
			btnNewButton.setBackground(new Color(227, 172, 27));
			btnNewButton.setForeground(new Color(31, 44, 61));
			btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));

			btnNewButton.setBounds(413, 541, 72, 52);
			contentPane.add(btnNewButton);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(12, 43, 473, 489);
			contentPane.add(scrollPane);
			scrollPane.setViewportView(textArea);
			textArea.setForeground(new Color(31, 44, 61));
			textArea.setBackground(new Color(255, 253, 255));
			textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			textArea.setText("서버에 연결되었습니다.");
			
						textArea.setEditable(false);
			label_1.setForeground(Color.WHITE);
			label_1.setBounds(12, 18, 57, 15);

			contentPane.add(label_1);

			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField.getText() != "" && textField.getText() != null) {
						sender.sendMessage(textField.getText()); //접속자 리스트
						// 중 선택된 사람에게.
					}
					textField.setText("");
				}
			});

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e1) {
					flag = true;
					dispose(); // 객체를 개발자가 직접 지우는 것!
					System.exit(0);
				}
			});

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class ClientSender {
	Socket socket;
	PrintWriter out;
	String name;
	
	public ClientSender(Socket socket, String name) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
		try {
			this.name = name;
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println(this.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg){//,String toWhom) {
		out.println(msg);
		out.flush();
	}
}

class ClientReceiver extends Thread {
	Socket socket;
	BufferedReader in;
	
	public ClientReceiver(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ChatKirauClient.flag == false) {
			String tmp;
			try {
				while ((tmp = in.readLine()) != null) {

					ChatKirauClient.textArea.append("\n" + tmp);
					ChatKirauClient.textArea.setCaretPosition(ChatKirauClient.textArea.getDocument().getLength());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}