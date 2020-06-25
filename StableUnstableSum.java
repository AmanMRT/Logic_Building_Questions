import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StableUnstableSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1 = 12, input2 = 1313, input3 = 122 , input4 = 678 ,input5 = 898 ;
		int stablesum = 0, unstablesum = 0;
		int[] arr = new int[5];
		arr[0] = input1;
		arr[1] = input2;
		arr[2] = input3;
		arr[3] = input4;
		arr[4] = input5;

		for(int i=0; i<arr.length; i++)
		{
			HashMap<Integer, Integer> map = new HashMap<>();
			int num = arr[i];

			while(num != 0)
			{
				int digit = num % 10;
				if(map.containsKey(digit))
				{
					map.put(digit, map.get(digit)+1);
				}
				else
				{
					map.put(digit, 1);
				}
				num = num / 10;
			}

			ArrayList<Integer> al = new ArrayList<>();
			Set<Integer> set = map.keySet();
			for(Integer key : set)
			{
				al.add(map.get(key));
			}

			Set<Integer> s = new HashSet<>(al);
			if(s.size() == 1)
			{
				stablesum +=  arr[i];
			}
			else
			{
				unstablesum += arr[i];
			}
		}
		int sum = stablesum - unstablesum;
	}

}
