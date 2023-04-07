import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListDemo1{
    public static void main(String[] args){
		List<Integer> al=Arrays.asList(new Integer[]{1,2,1,3,4,2,3,4});
		ArrayList<Integer> al1=new ArrayList<>();
		for(int i=0;i<al.size();i++){
			if(!al1.contains(al.get(i))){ 
		        al1.add(al.get(i));
		    }
		}
		System.out.println(al1);
		
	}
}