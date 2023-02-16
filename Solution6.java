public class Solution6{
	public int sum(int a,int b){
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	public double divide(double a,double b){
		return a/b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public int remainder(int a,int b){
		return a%b;
	}
	public static void main(String[] args){
		Solution6 solution=new Solution6();
		System.out.println(solution.sum(5,6));
		System.out.println(solution.subtract(5,6));
		System.out.println(solution.divide(5,6));
		System.out.println(solution.multiply(5,6));
		System.out.println(solution.remainder(5,6));
	}
}