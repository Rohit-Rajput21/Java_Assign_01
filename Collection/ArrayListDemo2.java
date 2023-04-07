import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.Arrays;
public class ArrayListDemo2{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Integer> al=new ArrayList<>();
		int choice=1;
		int value=0;
		M:
		while(choice!=4){
			System.out.println("*************************************************");
		    System.out.println("1. Add :");
		    System.out.println("2. Remove :");
		    System.out.println("3. Display :");
		    System.out.println("4. Exit :");
		    System.out.print("Enter operation key :");
			choice=sc.nextInt();
			switch(choice){
				case 1:
        			System.out.println("*************************************************");
				    System.out.print("Enter element :");
					value=sc.nextInt();
					al.add(value);
				    System.out.println("Element inserted succesfully :");
				break;
				case 2:
        			System.out.println("*************************************************");
				    if(al.size()==0){
						System.out.println("List is empty....");
						continue M;
					}
				    System.out.print("Enter index :");
					value=sc.nextInt();
					if(value<0 || value>=al.size()){
						System.out.println("Invalid index ....");
						continue M;
					}
					al.remove(value);
				    System.out.println("Element removed succesfully :");
				break;
				case 3:
        			System.out.println("*************************************************");
				    if(al.size()==0){
						System.out.println("List is empty....");
						continue M;
					}
					System.out.print("Element in List :");
				    ListIterator<Integer> itr=al.listIterator();
					while(itr.hasNext()){
						System.out.print(" "+itr.next());
					}
					System.out.println();
				break;
				case 4:
			        break M;					
				default :
        			System.out.println("*************************************************");
				    System.out.println("Invalid key...");
				break;
				}
		    }
		}
}