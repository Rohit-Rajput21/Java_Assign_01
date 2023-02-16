import java.util.Scanner;
public class Solution7{
	double average(double a,double b,double c){
		return (a+b+c)/3;
	}
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		Solution7 sol=new Solution7();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println(sol.average(a,b,c));
	}
}