package MyRMITest;
import java.rmi.registry.*;
public class MyClient {
	public static void main(String[] args) {
		String hostname = (args.length < 1) ? null : args[0];
		try {
			//Registry registry = LocateRegistry.getRegistry(hostname);
			Registry registry = LocateRegistry.getRegistry(hostname, 1099);
			MyRemoteInterface stub = (MyRemoteInterface)
					registry.lookup("MyRemoteInterface");

			MyVector a = new MyVector(1, 1), b = new MyVector(2, 2);
			MyVector plus = stub.add(a, b);
			MyVector minus = stub.subtract(a, b);
			System.out.println("(" + plus.getX() + ", " + plus.getY() + ")");
			System.out.println("(" + minus.getX() + ", " + minus.getY() + ")");
		} catch (Exception e) { e.printStackTrace(); }
	}
}