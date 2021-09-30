package Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="always ba happy";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		
		Iterator <Character> itr=set.iterator();
		while(itr.hasNext())
		{
			int count=0;
			char ch1=itr.next();
			for(int i=0;i<s1.length();i++)
			{
				char ch2=s1.charAt(i);
				if(ch1==ch2)
				{
					count++;
				}
			}
			System.out.println(ch1+"   :"+count);
		}
		

	}

}
