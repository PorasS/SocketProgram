import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serverj {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1342);
			Socket s1=ss.accept();
			Scanner sc=new Scanner(s1.getInputStream());
			int num=sc.nextInt();
			num=num*num;
			PrintStream ps=new PrintStream(s1.getOutputStream());
			ps.println(num);
		}catch(Exception e){
			
		}
		

	}

}
