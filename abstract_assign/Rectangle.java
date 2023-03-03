public class Rectangle extends Shape{
	float length;
	float width;
    public double perimeter(){
		double peri=2*(length+width);
		return peri;
	}
    public double area(){
		double area=length*width;
		return area;
	}
	public Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}
	public Rectangle(){
	}
}