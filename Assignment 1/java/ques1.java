package Assignment1;

import java.util.HashMap;

public class ques1
{
	public static void main(String[] args)
	{
		String arr[]= {"abc","def","ABZ", "ASD", "Abc"};
		HashMap<String, Integer>hm=new HashMap<>();
		for (String item:arr)
		{
			String q=item.toLowerCase();
			hm.put(q, hm.getOrDefault(q, 0)+1);
		}
		for(String item:arr)
		{
			String r=item.toLowerCase();
			if(hm.get(r)==1)
			{
				System.out.println(item);
			}
		}
	}
}