package arrayque;
class BinarySearch{
	public static void binary(int arr[],int first,int last,int N)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<N)
			{
				first=mid+1;
			}
			else if(arr[mid]==N)
			{
				System.out.println("Element found at index:"+mid);
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element is not found");
		}
	}
	public static void main(String args[])
	{
		int arr[]= {10,78,34,64,22};
		int N=34;
		int last=arr.length-1;
		binary(arr,0,last,N);
	}
	
}