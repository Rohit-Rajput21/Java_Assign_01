class C<T,U>{
    T x;
	U y;
	void get(T a ,U b){
		x=a;
		y=b;
	}
	void show(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
public class Test3{
	public static void main(String[] args){
		C<Integer,String> c1=new C<Integer,String>();
		c1.get(10,"rohit");
		c1.show();
	}
}