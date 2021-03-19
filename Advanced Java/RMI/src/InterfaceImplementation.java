
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.lang.String;
public class InterfaceImplementation extends UnicastRemoteObject implements RemoteInterface{
	
	public InterfaceImplementation() throws RemoteException{
		super();
	}

	@Override
	public int add(int x, int y)  {
	
		return (x+y);
	}
       
	
}
