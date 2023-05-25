package clientUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class client {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		System.out.println("client started...");
		String msg="hey !! im a client";
		byte b[]=msg.getBytes();
		InetAddress ia=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(b, b.length, ia, 3456);
		ds.send(dp);
		System.out.println("packet sent...");
	}
}
