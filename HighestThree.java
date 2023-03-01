public class HighestThree{
	public int highestThree(int arr[]){
		int result=arr[0]>arr[1]?(arr[0]>arr[2]?arr[0]:arr[2]):(arr[1]>arr[2]?arr[1]:arr[2]);
		return result;
	}
    public static void main(String arg[]){
		int arr[]={3,2,2};
		HighestThree hg=new HighestThree();
		System.out.println(hg.highestThree(arr));
	}
}