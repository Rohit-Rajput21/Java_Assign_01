public class Circle extends Shape{
    private float r;
	public double perimeter(){
		double res=2*Math.PI*r;
		return res;
	}
	public double area(){
		double area=Math.PI*r*r;
		return area;
	}
	public Circle(){
	}
	public Circle(float r){
		this.r=r;
	}
}