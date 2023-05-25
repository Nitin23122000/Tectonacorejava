package socketTCP;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) throws IOException {

		ServerSocket ss=new ServerSocket(2525);
		
		while(true) {
			Socket s=ss.accept();
			PrintStream pi=new PrintStream(s.getOutputStream());
			pi.print("welcome back");
			s.close();
			
		}
		
		
	}

}
