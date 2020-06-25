import java.util.ArrayList;

public class StringCodeWWW 
{
	public static void main(String[] args)
	{
		String input1 = "WORLD WIDE WEB";
		//String input1 = "HELLO WORLD";
		
		 input1 = input1.toUpperCase();
		String[] splited = input1.split("\\s+");
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<splited.length; i++)
		{
			int sum = 0;  
			if(splited[i].length() % 2 != 0)
			{
				for(int j=0; j<=splited[i].length()/2; j++)
				{
					int diff = Math.abs( splited[i].charAt(j) - splited[i].charAt(splited[i].length() - 1 - j ));
					sum = sum + diff;
				}
				
			int mid = splited[i].charAt(splited[i].length()/2) - 64;
			
			sum = sum + mid;
			sb.append(sum);
			}
			else
			{
				for(int j=0; j<splited[i].length()/2; j++)
				{
					int diff = Math.abs(splited[i].charAt(j) - splited[i].charAt(splited[i].length() - 1 - j ));
					sum = sum + diff;
				}		
			sb.append(sum);
			}
		}
		System.out.println(sb);
	}
}
