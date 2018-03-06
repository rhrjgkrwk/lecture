package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.chat.ChatKirauClient;
import com.chat.RoomManager;
import com.model.Member;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

public class ServerChoice extends JFrame {
	Member member;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerChoice frame = new ServerChoice(member);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ServerChoice(Member member) {
		this.member = member;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 29, 116, 60);
		contentPane.add(scrollPane);
		
		DefaultListModel<String> li = new DefaultListModel<String>();
		JList<String> list = new JList<>(li);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(list);
		
		JButton createBang = new JButton("방 만들기");
		createBang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int randomPort = r.nextInt(2000)+7001;
				String roomName = textField.getText();
				li.addElement(roomName);
				RoomManager.createRoom(roomName, randomPort);
				
				ChatKirauClient client = new ChatKirauClient(member, roomName, randomPort);
				client.setVisible(true);
				//dispose();
			}
		});
		createBang.setBounds(133, 121, 97, 26);
		contentPane.add(createBang);
		
		JButton joinBang = new JButton("방 참가");
		joinBang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int port = RoomManager.rooms.get(list.getSelectedValue()).getPort();
				String rname = RoomManager.rooms.get(list.getSelectedValue()).getRoomName();
				ChatKirauClient client = new ChatKirauClient(member, rname, port);
				client.setVisible(true);
				//dispose();
			}
		});
		joinBang.setBounds(133, 29, 97, 26);
		contentPane.add(joinBang);
		
		JLabel label_1 = new JLabel("채팅방 목록");
		label_1.setBounds(12, 10, 97, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(12, 122, 116, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("방 이름");
		label.setBounds(12, 106, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\uC0C8\uB85C\uACE0\uCE68");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator<String> it = RoomManager.rooms.keySet().iterator();
				while (it.hasNext()) {
					li.addElement(it.next());	
				}
			}
		});
		btnNewButton.setBounds(133, 63, 97, 26);
		contentPane.add(btnNewButton);
	}
}
