package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class clientUDp {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds=new DatagramSocket();
		String s="Hello My name is Nitin";
		byte b[]=s.getBytes();
		InetAddress ia=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b, b.length,ia,9999);
		ds.send(dp);
		System.out.println("Done");
		
				
	}

}
