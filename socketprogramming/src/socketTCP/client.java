package socketTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s=new Socket("localhost",2525);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg = br.readLine();
		System.out.println("message  : "+msg );
		
		
		
	}

}
