import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket so=new Socket("127.0.0.1",1342);
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number :");
			int num=s.nextInt();
			PrintStream ps=new PrintStream(so.getOutputStream());
			ps.println(num);
			Scanner s1=new Scanner(so.getInputStream());
			num=s1.nextInt();
			System.out.println(num);
			so.close();
		}catch(Exception e) {
			System.out.println("error in socket program:");
		}
		
		
	}

}
