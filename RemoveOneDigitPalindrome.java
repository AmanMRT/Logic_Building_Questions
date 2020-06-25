import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class RemoveOneDigitPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1 = 25152; 
		String str = Integer.toString(input1);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		String str1 = null, str2;
		int index = 0, count = 0, result = 0;
		
		StringBuffer sb = new StringBuffer(str);
		String s = sb.reverse().toString();

		if((str.length() <= 2) || (str.equals(s)))
		{
			result = -1;
		}
		
		while(input1 != 0)
		{
			int digit = input1 % 10;
			if(map.containsKey(digit))
			{
				map.put(digit, map.get(digit)+1);
			} 
			else
			{
				map.put(digit, 1);
			}

			input1 = input1 / 10;
		}

		Set<Integer> set = map.keySet();
		for(Integer key : set)
		{
			al1.add(key);
			al2.add(map.get(key));
		}
		str1 = al1.toString();
		str2 = al2.toString();

		for(int i=0; i<str2.length();i++)
		{
			if(str2.charAt(i) == '1')
			{
				count++;
				index = i;
			}
		}

		if((str.length() % 2 == 0) && count == 2)
		{
			result = (str1.charAt(index) - 48);
		}
		else
		{
			result = (str1.charAt(index) - 48);
		}
	System.out.println(result);
	} 
}
