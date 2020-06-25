
public class SumofPrimeIndex
{
	public static void main(String[] args)
	{
		int[] input1 = {10,20,30,40,50,60,70,80,90,100};
		int input2 = input1.length;
		int sum=0;
		sum += input1[0];
		for(int i=1; i<input2; i++)
		{
			int count = 0;
			for(int j=i; j>=1;j--)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count != 2)
			{
				sum += input1[i];
			}
		}
		System.out.print(sum);
	}
}
