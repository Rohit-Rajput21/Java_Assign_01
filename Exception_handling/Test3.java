class InvalidAgeException extends RuntimeException{
	InvalidAgeException(){
		
	}
	InvalidAgeException(String s){
		super(s);
	}
}
public class Test3{
    public static void main(String[] arg){
		int age=Integer.parseInt(arg[0]);
		if(age<18){
			InvalidAgeException ae=new InvalidAgeException("Invalid age is="+age);
			throw ae;
		}
		else{
			System.out.println("welcome");
		}
			System.out.println("Rohit Rajput");
	}
}