package serverUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class client {

	public static void main(String[] args) throws IOException {
		 DatagramSocket ds=new DatagramSocket();
		 String s="hello all";
		 byte b[]=s.getBytes();
		 InetAddress ia=InetAddress.getByName("localhost");
		 DatagramPacket dp=new DatagramPacket(b, b.length,ia,4567);
		 ds.send(dp);
		 System.out.println("Done...");
		 
		 
	}
}
