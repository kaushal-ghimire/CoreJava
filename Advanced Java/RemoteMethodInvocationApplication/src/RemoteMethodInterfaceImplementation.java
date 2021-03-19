import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RemoteMethodInterfaceImplementation extends UnicastRemoteObject implements DefineRemoteInterface  {

	public RemoteMethodInterfaceImplementation() throws RemoteException {
		super();
		
	}
	
	public int subtract(int x, int y, int z) throws RemoteException{
		return (x-y-z);
		
	}

	

     

}
