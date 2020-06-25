
public class IdentifyPossibleWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 ="Fi_er";
		String input2 = "Fiber:Fixer:fibre:Filer:Filter:Tailore:offer";
		
		String[] splited = input2.split("\\:+");
		String result="";
		
		for(int i=0; i<splited.length; i++)
		{
			
			if(splited[i].length() != input1.length())
			{	
				continue;
			}
			String input = input1;
			int index = input.indexOf('_');
			char ch = splited[i].charAt(index);
			
			input = input.replace('_', ch).toUpperCase();
			splited[i] = splited[i].toUpperCase();

			if(splited[i].equals(input))
			{
				if(result=="")
				{
				 	result += input;
				}
				else
				{
					result += ":"+input;
				}
			}
		}
			if(result.isEmpty())
				result = "ERROR-009";
			System.out.print(result);
	}
}
