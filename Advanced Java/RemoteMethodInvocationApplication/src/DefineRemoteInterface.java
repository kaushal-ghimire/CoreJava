import java.rmi.*;

public interface DefineRemoteInterface extends Remote {
     
	public int subtract (int x, int y, int z) throws RemoteException;
	
}
