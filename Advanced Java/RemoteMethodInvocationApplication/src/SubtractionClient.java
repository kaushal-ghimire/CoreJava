import java.rmi.Naming;

public class SubtractionClient {

	public static void main(String[] args) {
		try {
			String ip = "rmi://127.0.0.1/SERVICE";
			DefineRemoteInterface s = (DefineRemoteInterface)Naming.lookup(ip);
			System.out.println("Subtraction Result: " +s.subtract(20,8,4));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.getStackTrace();
		}

	}

}
