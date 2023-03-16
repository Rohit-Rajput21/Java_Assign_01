class B<T>{
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
public class Test2{
	public static void main(String[] args){
		B<Integer> b1=new B<Integer>();
		b1.get(10,20);
		b1.show();
		B<String> b2=new B<String>();
		b2.get("ram","sita");
		b2.show();
	}
}