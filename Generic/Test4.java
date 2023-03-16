class D<T>{
   T x;
   D(T a){
	   x=a;
   }
   T get(){                    // will return object
	   return x;
   }
}
public class Test4{
	public static void main(String[] args){
		D d=new D("rohit");
		int x=(int)d.get();       // type-casting object into integer 
		System.out.println(x);
	}
}
  
  
  // without generic this program will throw an exception
  // classCastException : String can not be cast to Integer