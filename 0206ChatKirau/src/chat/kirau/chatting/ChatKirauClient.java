package chat.kirau.chatting;

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
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ChatKirauClient extends JFrame {

	JPanel contentPane;
	JTextField textField = new JTextField();
	static JTextArea textArea = new JTextArea();
	JButton btnNewButton = new JButton("������");
	static String name = "â��"; // Member Ŭ������ �޾Ƽ� ���.
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
	public ChatKirauClient(){
		setResizable(false); //(Member member) { // ������ Member�� �޵��� ����.
		String serverIP = "70.12.109.101"; // ���� �����Ǵ� �ϴ� ���ɷ� ����.
		int port = 7897; // �ӽ� ��Ʈ ����.
		

		try { // ������ �����ϰ� ä�����α׷��� ������Ѻ���.
			Socket socket = new Socket(serverIP, port); // ������ ��������.
			System.out.println("������ ����Ǿ����ϴ�.");
			textArea.setForeground(new Color(31, 44, 61));
			textArea.setBackground(new Color(255,253,255));
			textArea.setFont(new Font("���� ���", Font.PLAIN, 13));
			textArea.setText("������ ����Ǿ����ϴ�.");

			ClientSender sender = new ClientSender(socket, name);
			Thread receiver = new Thread(new ClientReceiver(socket));

			receiver.start();

			setTitle("\uCC57\uD0A4\uB77C\uC6B0");
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 340, 573);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(51, 51, 51));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			textArea.setEditable(false);
			textArea.setBounds(12, 10, 311, 463);
			contentPane.add(textArea);
			textField.setForeground(new Color(31, 44, 61));
			textField.setFont(new Font("���� ���", Font.PLAIN, 12));

			textField.setBounds(12, 483, 220, 52);
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
			btnNewButton.setBackground(new Color(227,172,27));
			btnNewButton.setForeground(new Color(31, 44, 61));
			btnNewButton.setFont(new Font("���� ���", Font.BOLD, 12));

			btnNewButton.setBounds(244, 482, 78, 52);
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
					dispose(); //��ü�� �����ڰ� ���� ����� ��!
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
			System.out.println("��ǲ��Ʈ�� ����@!");
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
					System.out.println("���� ���ù��� �����");
					ChatKirauClient.textArea.append("\n"+ tmp);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}