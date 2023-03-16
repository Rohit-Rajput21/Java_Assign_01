public class Test1{                           // throw Keyword
    public static void main(String[] arg){
		int age=Integer.parseInt(arg[0]);
		if(age<18){
			ArithmeticException ae=new ArithmeticException("Invalid age is="+age);
			throw ae;
		}
		else{
			System.out.println("Welcome");
		}
			System.out.println("Rohit Rajput");
	}
}