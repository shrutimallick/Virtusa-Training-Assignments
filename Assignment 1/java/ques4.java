package Assignment1;

import java.util.*;
public class ques4
{
	public static void main(String[] args)
	{
		int sam[] = {2,5,8,9,0,1,7,10};
		for(int i=0;i<sam.length;i++)
		{
			for(int j=i+1;j<sam.length;j++)
			{
				for(int k =0;k<sam.length;k++)
				{
					if(sam[i]+sam[j]==sam[k])
					{
						System.out.println(sam[i]+" "+sam[j]);
					}
				}
			}
		}
	}
}
