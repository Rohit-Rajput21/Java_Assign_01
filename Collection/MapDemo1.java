import java.util.Map;
import java.util.HashMap;
public class MapDemo1{
    public static void main(String[] args){
	    String str="rohitrajput12212001";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			int j=0;
		if(!map.containsKey(str.charAt(i))){
			
			map.put(str.charAt(i),1);
		}
		else{
			j=map.get(str.charAt(i));
			map.put(str.charAt(i),++j);
		}
	}
		System.out.println(map);
	}
}