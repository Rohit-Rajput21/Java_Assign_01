class A<T>{
    T x,y;
	void get(T a ,T b){
		x=a;
		y=b;
	}
	void show(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
public class Test1{
	public static void main(String[] args){
		A<Integer> a=new A<Integer>();
		a.get(10,20);
		a.show();
	}
}