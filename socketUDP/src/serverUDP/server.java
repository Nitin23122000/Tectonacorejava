package serverUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class server {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds=new DatagramSocket(3456);
		System.out.println("server started...");
		
		byte b[]=new byte[1000];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		ds.receive(dp);
		String str=new String(dp.getData());
		System.out.println("received message : "+str);
	}

}
