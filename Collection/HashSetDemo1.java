import java.util.Set;
import java.util.HashSet;
public class HashSetDemo1{
    public static void main(String[] args){
		int[] arr={1,2,3,1,2,4,3,2};
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			if(!hs.contains(arr[i]))
				hs.add(arr[i]);
		}
		System.out.println(hs);
	}
}