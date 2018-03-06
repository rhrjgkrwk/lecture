package com.chat;

import java.io.BufferedReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import com.chat.ChatKirauServer.ServerReceiver;

public class RoomManager extends Thread { //한번만 생성한다.
	public static HashMap<String, Room> rooms = new HashMap<>();
	
	public static void main(String[] args) {
		boolean flag = true;
		rooms = new HashMap<>();
		System.out.println("roommanager 입니다.");
		new RoomManager().start();
	}
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("스레드를 생성했다!");
			
			while (true) {
				
			}
		}
	
	public static void createRoom(String roomName, int port) {
		rooms.put(roomName, new Room(roomName, port));
	}
	
	public static void removeRoom(String roomName){
		rooms.remove(roomName);
	}
}

