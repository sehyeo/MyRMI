package MyRMITest;
import java.io.Serializable;
public class MyVector implements Serializable {
	private static final long serialVersionUID = 1L;
	int x, y;
	public MyVector(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
}
