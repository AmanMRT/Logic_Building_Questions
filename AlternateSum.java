
public class AlternateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input1 = 10000, input2 =1;
		int sum =0;
		int count = 0;
		if(input2 == 1)
		{
			sum = 0;
		}
		else
		{
			sum += input1;
			input1--;
		}
		
		while(input1 != 0)
		{
			if(count == 0)
			{
				sum += input1;
				count = 1;
				input1--;
			}
			else
			{
				sum -= input1;
				count = 0;
				input1--;
			}
		}
		System.out.println(sum);
	}
}
