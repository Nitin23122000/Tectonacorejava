package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {

		
		ServerSocket ss=new ServerSocket(4562);
		while(true) {
			Socket s=ss.accept();
			System.out.println("connection established...");
			PrintStream pi=new PrintStream(s.getOutputStream());
			pi.print("welcome back..");
			s.close();
	}
	}
}
