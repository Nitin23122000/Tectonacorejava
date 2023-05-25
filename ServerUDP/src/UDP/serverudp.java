package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class serverudp {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds=new DatagramSocket(9999);
		byte b[]=new byte[1000];
		DatagramPacket dp=new DatagramPacket(b, b.length);
		ds.receive(dp);
		String msg=new String(dp.getData());
		System.out.println("message "+ msg);
		
	}

}
