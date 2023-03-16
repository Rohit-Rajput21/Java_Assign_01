import java.util.ArrayList;
import java.util.List;
public class Test5{
	public static void main(String[] args){
		// ArrayList<Employee1> emp1=new ArrayList<Employee1>();
		// emp1.add(new Employee1());
		ArrayList<Accountant1> acc1=new ArrayList<>();
		acc1.add(new Accountant1());
		
		display(acc1);
	}
	public static void display(List<? extends Employee1> emp1){   // Employee1 and it's child class
		for(Employee1 e:emp1){
			e.work();
		}
	}
}
// to resolve the problem of ClassCastException.
// case 4