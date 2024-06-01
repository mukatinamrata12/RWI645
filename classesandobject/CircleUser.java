package classesandobject;
public class CircleUser{
	public static void main (String args[])
	{
		//we computing area of circle whose radius is 10
		Circle c1=new Circle();
		c1.setRadius(10);
		c1.computeArea();
		c1.computeCircumference();
		
		//we computing area of circle whose radius is 100
		Circle c2=new Circle();
		c2.setRadius(100);
		c2.computeArea();
		c2.computeCircumference();
	}
}