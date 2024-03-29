package basicclass.clone;

public class Circle implements Cloneable{
	Point center;  //Point center = null(점 클래스 참조)
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);  //center 객체 생성
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
