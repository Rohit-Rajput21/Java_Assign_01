import java.util.regex.*;
import java.util.Scanner;
public class RegularExp{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a PIN number :");	
        String ex=sc.next();
         // Pattern pt=Pattern.compile("[1-9]{1}[0-9]{5}");
      Pattern pt=Pattern.compile("[1-9]{1}\\d{5}");      
	  Matcher mtc=pt.matcher(ex);
        boolean flag=mtc.matches();
        if(flag)
			System.out.print("PIN is valid");
        else	
	        System.out.print("PIN is invalid");
    }
}