
public class UserIdGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 ="Rajiv", input2 = "Roy";
		int input3 = 560037, input4 = 6;
		String small, longer;
		StringBuffer sb = new StringBuffer();
		String str = Integer.toString(input3);
		StringBuffer sb1 = new StringBuffer(str);

		if(input1.length() > input2.length())
		{
			small = input2;
			longer = input1;
		}
		else if(input1.length() < input2.length())
		{
			longer = input2;
			small = input1;
		}
		else
		{
			String[] arr ={input1, input2};
			String temp;
			for(int i=0; i<arr.length; i++)
			{
				for(int j =i+1; j<arr.length; j++)
				{
					if(arr[i].compareTo(arr[j]) > 0)
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			small = arr[0];
			longer = arr[1];
		}
			sb.append(small.charAt(small.length()-1)).append(longer).append(str.charAt(input4-1));
			
			sb.append(sb1.reverse().toString().charAt(input4-1));
			
			char[] result = sb.toString().toCharArray();
			for(int i=0; i<result.length; i++)
			{
				if(result[i] >= 'A' && result[i] <= 'Z')
				{
					result[i] = (char) (result[i] + 'a' - 'A');
				}
				else if(result[i] >= 'a' && result[i] <= 'z')
				{
					result[i] = (char) (result[i] + 'A' - 'a');
				}
			}
	System.out.println( String.valueOf(result));
	}

}
