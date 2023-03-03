public class ShapeMain{
	public static void main(String[] arg){
		Shape c=new Circle(5);
		Shape r=new Rectangle(3.2f,4.8f);
		System.out.printf("Perimeter of circle : %.3f",c.perimeter());
		System.out.printf("\nArea of circle :%.2f",c.area());
		System.out.printf("\nPerimeter of rectangle :%.2f",r.perimeter());
		System.out.printf("\nArea of rectangle :%.2f",r.area());
	}
}