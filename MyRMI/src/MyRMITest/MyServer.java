package MyRMITest;
import java.rmi.registry.*;
import java.rmi.server.*;
public class MyServer implements MyRemoteInterface {
	public MyVector add(MyVector a, MyVector b)
		{ return new MyVector(a.getX() + b.getX(), a.getY() + b.getY());	}
	public MyVector subtract(MyVector a, MyVector b)
		{ return new MyVector(a.getX() - b.getX(), a.getY() - b.getY());	}
	public static void main(String[] args) {
		try {
			MyServer obj = new MyServer();
			MyRemoteInterface stub = (MyRemoteInterface)
					UnicastRemoteObject.exportObject(obj, 0); 
			//Registry registry = LocateRegistry.getRegistry();
			// RMI 레지스트리 생성 (기본 포트 1099)
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("MyRemoteInterface", stub);
			System.out.println("Server ready...");
		} catch (Exception e) { e.printStackTrace(); }
	}
}
