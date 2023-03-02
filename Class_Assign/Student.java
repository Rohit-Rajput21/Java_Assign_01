package Class_Assign;
import java.util.Arrays;
public class Student{
    private int rollNumber;
    private String name;
    private String course;
    private int[] marks;
    public int calculateTotal(){
		int total=0;
		for(int i:marks)
			total+=i;
		return total;
	}
	public int calculateAverage(){
		int avg=calculateTotal()/marks.length;
		return avg;
	}	
	public String calculateGrade(){
		int avg=calculateAverage();
		String grade=avg>90?"A+":avg>80?"A":avg>60?"B":avg>50?"C":avg>35?"D":"F";
	    return grade;
	}
	public void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}	
	public int getRollNumber(){
		return rollNumber;
	}
    public void setName(String name){
		this.name=name;
	}	
    public String getName(){
		return name;
	}	
    public void setCourse(String course){
		this.course=course;
	}
	public String getCourse(){
		return course;
	}	
    public void setMarks(int[] marks){
		this.marks=marks;
	}
	public int[] getMarks1(){
		return marks;
	}
	public String toString(){
		return "Student [rollNumber="+rollNumber+" name="+name+ " course="+course+" marks="+Arrays.toString(marks)+
	    " Total="+calculateTotal()+" Average="+calculateAverage()+" Grade="+calculateGrade()+"]";
	}
    	
}