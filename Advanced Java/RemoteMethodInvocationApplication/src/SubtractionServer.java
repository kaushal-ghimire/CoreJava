import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SubtractionServer {

	public static void main(String[] args) {
		try {
			RemoteMethodInterfaceImplementation s = new RemoteMethodInterfaceImplementation();			
			LocateRegistry.createRegistry(9999);
			Naming.rebind("SERVICE", s);
			System.out.println("Server Started");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
