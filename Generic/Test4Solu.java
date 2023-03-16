class E<T>{
   T x;
   E(T a){
	   x=a;
   }
   T get(){                    // will return object
	   return x;
   }
}
public class Test4Solu{
	public static void main(String[] args){
		E<Integer> e=new E<Integer>("rohit");
		int x=(int)e.get();       
		System.out.println(x);
	}
}

//    generic will solve the ClassCastException 
//     At compile time this program will throw an error.
//    incompatible type : String cannot be converted to Integer.