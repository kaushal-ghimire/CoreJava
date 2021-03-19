import java.rmi.Naming;
import java.rmi.RemoteException;

public class client {

	public static void main(String[] args) {
		try {
			String ip = "rmi://127.0.0.1/SERVICE";
			RemoteInterface s = (RemoteInterface) Naming.lookup(ip);
			System.out.println("Sum: " +s.add(5,4));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
