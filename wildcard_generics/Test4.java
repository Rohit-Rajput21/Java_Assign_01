import java.util.ArrayList;
import java.util.List;
public class Test4{
	public static void main(String[] args){
		// ArrayList<Employee1> emp1=new ArrayList<>();
		// emp1.add(new Employee1());
		ArrayList<Accountant1> acc1=new ArrayList<>();
		acc1.add(new Accountant1());
		
		display(acc1);
	}
	public static void display(List<?> emp1){
		// for(int i=0;i<emp1.size();i++){
			// Accountant1 acc=(Accountant1)emp1.get(i);
			// acc.work();
		// }
		for(Accountant1 e:(ArrayList<Accountant1>)emp1){     // it is not a good practise ,there is possibility of classCastException
			e.work();
		}
	}
}
// case 3