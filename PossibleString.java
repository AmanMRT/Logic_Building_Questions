import java.util.Arrays;

public class PossibleString {
	public static void main(String[] args)
	{
		String input1 = "Fi_er";
		String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
		
		int index = 0;
		char indexnew;
		String[] splited = input2.split("\\:+");
		StringBuffer sb = new StringBuffer();
		
		for(String s : splited)
		{
			s= s.toLowerCase();
		}
		for(int i =0; i<input1.length(); i++)
		{
			if(input1.charAt(i) == '_')
			{
				index = i;
			}
		}
		
		for(int i = 0; i<splited.length; i++)
		{
			splited[i] = splited[i].toLowerCase();
			if(splited[i].length() >= input1.length())
			{
				indexnew = splited[i].charAt(index);
				input1 = input1.replace(input1.charAt(index), indexnew);
				if(splited[i].equalsIgnoreCase(input1))
				{
					sb.append(splited[i].toUpperCase().concat(":"));
				}
			}
		}
		System.out.println(sb);
	}
}
