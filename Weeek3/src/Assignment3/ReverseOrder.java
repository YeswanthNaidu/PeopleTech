package Assignment3;

public class ReverseOrder {
	
	public void display(int[] a)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,45,63,23,14,98};
		ReverseOrder ro=new ReverseOrder();
		ro.display(a);
		
		

	}

}
