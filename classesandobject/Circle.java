package classesandobject;

//by creating a circle class, we are creating blueprint of a Circle.

public class Circle{

	//data member (to define the properties of an object
	private double radius, area, circumference;
	
	//member function (methods) (to perform the operations on the object)
	public void setRadius(double r) {
		radius=r;
	}
	public void computeArea(){
		area=3.14*radius*radius;
		System.out.println("Area of Circle:"+area);
	}
	public void computeCircumference() {
		circumference=2*3.14*radius;
		System.out.println("Circumference of Circle:"+circumference);
	}
	/*public static void main(String args[])
	{
		
	}*/
}