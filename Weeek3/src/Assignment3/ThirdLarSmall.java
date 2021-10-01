package Assignment3;

public class ThirdLarSmall {
	
	
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {68,56,74,23,45,90,32,44};
		ThirdLarSmall.display(a);
		
		int i=a.length-3;
		
		System.out.println("Third Smallest element is :"+ a[2]);
		System.out.println("Third lardest element is :"+ a[i]);

	}

}
