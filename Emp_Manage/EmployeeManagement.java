import java.util.Scanner;
public class EmployeeManagement{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		EmpInformation emp=new EmpInformation();
		int choice = 1;
		while(choice !=0){
		    System.out.println("Please Enter your choice :");
		    System.out.println("Enter 1 for Insert :");
		    System.out.println("Enter 2 for Read :");
		    System.out.println("-------------------------------------------");
		    System.out.print("I want to perform operation No. :");
		    choice=sc.nextInt();
		    if(choice >0 && choice <5)
		    {
		        switch(choice){
		    	case 1 :
				        emp.insert();
				break;
		    	case 2 :
				       emp.read() ;
				break;
				}
			}
			else{
				System.out.println("Invalid choice .");
			}
		    System.out.print("Press 1 for continue or 0 for exist :");
			choice=sc.nextInt();
		   
		}
	}
}