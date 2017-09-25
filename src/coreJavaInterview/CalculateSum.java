package coreJavaInterview;

public class CalculateSum {
	
	public int calculateSum()
	{
		int sum=0;
		int a[]= {10,30,20, 40};
		for(int arr:a) {
			sum=sum+arr;
		}
		return sum;
	}

	public static void main(String[] args) {
		CalculateSum obj = new CalculateSum();
		int result = obj.calculateSum();
		System.out.println(result);

	}

}
