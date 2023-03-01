import java.util.*;
public class Currency{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float multi;
		System.out.println("Name of the currency which you want to convert");
		String name1=sc.next();
		System.out.println("Value of currency w.r.t Dollar($) :");
		float value1=sc.nextFloat();
		System.out.println("Name of the currency in which you want to convert");
		String name2=sc.next();
		System.out.println("Value of currency w.r.t Dollar($) :");
		float value2=sc.nextFloat();
		System.out.print("Total amount ,you want to convert :");
		float amount=sc.nextFloat();
		multi=value2/value1;
		
		System.out.println("Total amount is "+(amount*multi)+""+name2);
	}
}