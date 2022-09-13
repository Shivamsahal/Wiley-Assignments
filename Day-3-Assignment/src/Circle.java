
public class Circle {
	int r;
	double area;
	public Circle (int r)
	{
		this.r=r;
		this.area=3.14*r*r;
	}
	public void calculateArea()
	{
		System.out.println(area);
	}
public static void main(String[] args) {
	Circle obj = new Circle(7);
	obj.calculateArea();
	
}
}
