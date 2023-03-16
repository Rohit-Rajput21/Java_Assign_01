import java.util.ArrayList;
class Employee{
	
}
class Accountant extends Employee{
	
}
public class Test{
	public static void main(String[] args){
		Object object=new Object();
		String str=new String();
		object=str;    // polymorphism concept reference variable of super class can store the object of sub class
		
		//case 1:
		Employee emp=new Employee();
		Accountant ac=new Accountant();
		emp=ac;
		
		// case 2:
		// ArrayList<Employee> employees=new ArrayList<>();// Diamond operator (1.7)
		// ArrayList<Accountant> accountants=new ArrayList<>();
		// employees=accountants;     // error : incompatible type // generic does not flexible
		
		// case 3:
		ArrayList<?> employees=new ArrayList<>();// wildcard 
		ArrayList<Accountant> accountants=new ArrayList<>();
		employees=accountants;     // wildcard solve the problem,provides flexibility
		
		// case 4:
        ArrayList<? extends Employee> employees1=new ArrayList<>();// wildcard -upperbound : Employee or it's sub-class
		ArrayList<Accountant> accountants1=new ArrayList<>();
		employees1=accountants1;

        // case 5:
        // ArrayList<? super Employee> employees2=new ArrayList<>();// wildcard -lowerbound : Employee or it's super-class
		// ArrayList<Accountant> accountants2=new ArrayList<>();
		// employees2=accountants2;  	//incompatible types: ArrayList<Accountant> cannot be converted to ArrayList<? super Employee>	
	
        // case 6:	
	    ArrayList<? super Employee> employees3=new ArrayList<>();// wildcard -lowerbound : Employee or it's super-class
		ArrayList<Object> accountants3=new ArrayList<>();
		employees3=accountants3;    // because Employee class has only one super class that is Object.
	}
}
