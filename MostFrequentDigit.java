import java.util.HashMap;
import java.util.Set;

public class MostFrequentDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] input1 = {1237,202,666,140};
		int[] input1 = {1237,262,666,140};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		String str1 ="", str2="";
		char[] arr1 = new char[10];
		char[] arr2 = new char[10];

		for(int i=0; i<input1.length;i++)
		{
			while(input1[i] != 0)
			{
				int digit = (int) (input1[i] % 10);
	
				if(map.containsKey(digit))
				{  
					map.put(digit, map.get(digit)+1);
				} 
				else
				{
					map.put(digit, 1);
				}

				input1[i] = input1[i] / 10;
			}
		}
		
		Set<Integer> set = map.keySet();
		for(Integer key : set)
		{
			str1 = str1 + key +" ";
			str2 = str2 + map.get(key) + " "; 
		}
		
		arr1 = str1.toCharArray();
		arr2 = str2.toCharArray();

		int max = arr2[0]; 
        int index=0;
		for (int i = 1; i < arr2.length; i++)
		{ 
			if (arr2[i] > max) 
			{
			index = i;
			}
		}	 
		System.out.println(arr1[index]);
	}
}
