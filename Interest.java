import java.util.Scanner;
public class Interest{
	public float simpleInte(float principal,float rate,float time){
		float interest=(principal*rate*time)/100;
        return interest;		
	}
	private float power(float temp,float time){
	    float result=1;
		while(time!=0){
			result=result*temp;
			time--;
		}
		return result;
	}
	public float compoundInte(float principal,float rate,float time){
		float interest=principal*(power((1+rate/100),time));
		return interest;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal :");
		float principal=sc.nextFloat();
		System.out.print("Enter the rate of interest :");
		float rate=sc.nextFloat();
		System.out.print("Enter the time year :");
		float time=sc.nextFloat();
		Interest in=new Interest();
		System.out.println("Simple interest is :"+in.simpleInte(principal,rate,time));
		System.out.print("Compound interest is :"+in.compoundInte(principal,rate,time));
		
	}
}