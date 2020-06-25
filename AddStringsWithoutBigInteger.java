
public class AddStringsWithoutBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 = "123456732128989543219" , input2 ="987612673489652";
		int carry = 0;
		String sum ="";
		String input22="", input11="";
		
		if(input1.length() > input2.length())
		{
			StringBuffer sb = new StringBuffer(input2);
			int diff = input1.length() - input2.length();

			for(int i=0; i<diff; i++)
			{
				sb.insert(0, 0);
			}
			 input22 = sb.toString();
			 input11 = input1;
		}
		else
		{
			StringBuffer sb = new StringBuffer(input1);
			int diff = input2.length() - input1.length();

			for(int i=0; i<diff; i++)
			{
				sb.insert(0, 0);
			}
			 input11 = sb.toString();
			 input22 = input2;
		}
			
			
		for(int i=input11.length()-1; i>=0; i--)
		{
			int a = input11.charAt(i) - 48;
			int b = input22.charAt(i) - 48;
	
			int result = a + b + carry;
			
			if(result >= 10)
			{
				sum += (result % 10);
				carry = 1;
			} 
			else
			{
				sum += result;
				carry = 0;
			}
		}
	
		if(carry > 0)
		{
			sum += carry;
		}
		StringBuffer sb = new StringBuffer(sum);
		sb.reverse();
		System.out.println(sb.toString());
	}
}
