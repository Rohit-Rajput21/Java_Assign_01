public class SecondHighest{
	public static void main(String[] arg){
		int arr[]={1,2,3,5,5};
		int max1=arr[0];
		int max2=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max1){
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]==max1 && max2<max1){
				max2=arr[i];
			}
		}
		System.out.println("Second highest number is :"+max2);
	}
}