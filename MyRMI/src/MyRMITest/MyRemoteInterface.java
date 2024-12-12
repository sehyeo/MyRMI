package MyRMITest;
import java.rmi.*;
public interface MyRemoteInterface extends Remote {
	MyVector add(MyVector a, MyVector b) throws RemoteException;
	MyVector subtract(MyVector a, MyVector b) throws RemoteException;
}
