package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0;
		int arrLength = arr.length;
		int temp;
		for (int i=0; i <arrLength-2;i++)
		{
			count=1;
			for (int j=i+1;j<arrLength-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count = count+1;
					temp = arr[i];
				}
									
					}
			if(count>1) {
				System.out.println("Duplicate element in the array:"+arr[i]+ "occurance:"+count);
		
			}
		}
	}
	
}