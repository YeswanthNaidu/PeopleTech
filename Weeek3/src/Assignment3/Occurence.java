package Assignment3;

public class Occurence {
	
	public int display(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==20)
			{
				count++;
			}		
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {33,30,20,54,67,20,98,56,20};
		Occurence o=new Occurence();
		System.out.println("the occurence of 20 is :"+o.display(a));
		

	}

}
