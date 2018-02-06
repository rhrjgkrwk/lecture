package chat.kirau;

import java.awt.EventQueue;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class ChatKirauClient extends JFrame {

	JPanel contentPane;
	JTextField textField = new JTextField();
	static JTextArea textArea = new JTextArea();
	JButton btnNewButton = new JButton("보내기");
	static String name = "창자"; // Member 클래스를 받아서 사용.
	static boolean flag = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatKirauClient frame = new ChatKirauClient();
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
	public ChatKirauClient() { // 생성시 Member를 받도록 수정.
		String serverIP = "70.12.109.101"; // 서버 아이피는 일단 내걸로 하잡.
		int port = 7897; // 임시 포트 설정.
		

		try { // 서버에 접속하고 채팅프로그램을 실행시켜보자.
			Socket socket = new Socket(serverIP, port); // 소켓을 생성하자.
			System.out.println("서버에 연결되었습니다.");
			textArea.setText("서버에 연결되었습니다.");

			ClientSender sender = new ClientSender(socket, name);
			Thread receiver = new Thread(new ClientReceiver(socket));

			receiver.start();

			setTitle("\uCC57\uD0A4\uB77C\uC6B0");
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 351, 573);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			textArea.setEditable(false);
			textArea.setBounds(12, 10, 311, 453);
			contentPane.add(textArea);

			textField.setBounds(12, 473, 220, 52);
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
							sender.sendMessage(textField.getText());
						}
						textField.setText("");
					}
				}
			});

			btnNewButton.setBounds(245, 473, 78, 52);
			contentPane.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (textField.getText() != ""&& textField.getText() != null) {
						sender.sendMessage(textField.getText());
					}
					textField.setText("");
				}
			});
			
			addWindowListener(new WindowAdapter() {
				public void windowClosing (WindowEvent e1){
					flag = true;
					dispose(); //객체를 개발자가 직접 지우는 것!
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

	public void sendMessage(String msg) {
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
			System.out.println("인풋스트림 생성@!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ChatKirauClient.flag ==false) {
			String tmp;
			try {
				while ((tmp = in.readLine()) != null) {
					// System.out.println(in.readLine());
					System.out.println("지금 리시버는 대기중");
					ChatKirauClient.textArea.append("\n"+ tmp);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}