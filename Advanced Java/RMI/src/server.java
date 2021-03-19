import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server {

	public static void main(String[] args) {
	try {
		InterfaceImplementation s = new InterfaceImplementation();
		LocateRegistry.createRegistry(1990);
		Naming.rebind("SERVICE", s);
		System.out.println("Server Started");

	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}

}
