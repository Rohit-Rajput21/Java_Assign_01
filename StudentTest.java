import Class_Assign.Student;
public class StudentTest{
    public static void main(String[] args){
		Student student1=new Student();
		student1.setRollNumber(101);
		student1.setName("Ram");
		student1.setCourse("BCA");
		student1.setMarks(new int[]{20,30,40});
		System.out.println(student1);
		Student student2=new Student();
		student2.setRollNumber(102);
		student2.setName("Shyam");
		student2.setCourse("MCA");
	    student2.setMarks(new int[]{40,50,60});
		System.out.println(student2);
		Student student3=new Student();
		student3.setRollNumber(103);
		student3.setName("Rohit");
		student3.setCourse("BSC");
		student3.setMarks(new int[]{50,60,70});
		System.out.println(student3);
		Student student4=new Student();
		student4.setRollNumber(104);
		student4.setName("Mohit");
		student4.setCourse("MSC");
		student4.setMarks(new int[]{60,70,80});
		System.out.println(student4);
		Student student5=new Student();
		student5.setRollNumber(105);
		student5.setName("Mnaish");
		student5.setCourse("Phd");
		student5.setMarks(new int[]{80,90,100});
		System.out.println(student5);
	}
}