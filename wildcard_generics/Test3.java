import java.util.ArrayList;
import java.util.List;
public class Test3{
	public static void main(String[] args){
		ArrayList<Employee1> emp1=new ArrayList<Employee1>();
		emp1.add(new Employee1());
		ArrayList<Accountant1> acc1=new ArrayList<>();
		acc1.add(new Accountant1());
		
		display(acc1);
	}
	public static void display(List<Employee1> emp1){
		for(Employee1 e:emp1){
			e.work();
		}
	}
}
// case 2-> incompatible type :ArrayList<Accountant1> cannot be converted to ArrayList<Employee1>.