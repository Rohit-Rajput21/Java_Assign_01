import java.util.ArrayList;
class Employee1{
    public void work(){
	    System.out.println("Employee is working");
	}
}
class Accountant1 extends Employee1{
	public void work(){
		System.out.println("Accountant is working");
	}
}
public class Test2{
	public static void main(String[] args){
		ArrayList<Employee1> emp1=new ArrayList<Employee1>();
		emp1.add(new Employee1());
		ArrayList<Accountant1> acc1=new ArrayList<>();
		acc1.add(new Accountant1());
		
		display(emp1);
	}
	public static void display(List<Employee1> emp1){
		for(Employee1 e:emp1){
			e.work();
		}
	}
}