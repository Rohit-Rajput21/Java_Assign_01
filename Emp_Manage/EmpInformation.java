import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
public class EmpInformation{
	Scanner sc;
	FileInputStream in=null;
	FileOutputStream out=null;
	private int id;
	private String name;
	private String mobileNo;
	private String dob;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}
	public void setDob(String dob){
		this.dob=dob;
	}
	public int getId(){
		return id;
	} 
	public String getName(){
		return name;
	} 
	public String getMobileNo(){
		return mobileNo;
	} 
	public String getDob(){
		return dob;
	} 
	public EmpInformation(){
		
	}
	public void insert(){
		EmpInformation emp=new EmpInformation();
		sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee_Id :");
		int id=sc.nextInt();
		emp.setId(id);
		
		System.out.print("Enter the name of Employee :");
		String name=sc.next();
		emp.setName(name);
		
        System.out.print("Enter the MobileNo. of Employee :");
		String mobileNo=sc.next();
		emp.setMobileNo(mobileNo);
		
        System.out.print("Enter the dob of Employee :");
		String dob=sc.next();
		emp.setDob(dob);
		
	    try{ 
	        FileWriter fw=new FileWriter("EmpInformation.txt",true);// true for append the data
            String line=emp.toString();
	        fw.write(line);
			fw.write("\n");
			fw.close();
	    }
        catch(IOException e){
			System.out.println(e);
		}
      		
	}
	public void read(){
		try{
	//	FileInputStream fstream = new FileInputStream("EmpInformation.txt");
        BufferedReader br = new BufferedReader(new FileReader("EmpInformation.txt"));
		String strLine;
        while ((strLine = br.readLine()) != null){
            System.out.println (strLine);
        }
        br.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	public void copyContent(String a,String b){
		try{
			File x=new File(a);
			File y=new File(b);
			in=new FileInputStream(x);
		    out=new FileOutputStream(y);
			int ch;
			while((ch=in.read())!=-1){
				out.write(ch);
			}
			in.close();
			out.close();
			System.out.println("Content copied ....");
			
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	
	}
	public String toString(){
		return "Id= "+getId()+" Name="+getName()+" MobileNo="+getMobileNo()+" dob="+getDob();
	}
}