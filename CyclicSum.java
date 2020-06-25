
public class CyclicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 582109;
		String str = Integer.toString(input1);
		int sum =0;

		for(int i=0; i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				sum+= (str.charAt(j)- 48);
			}
		}
		System.out.print(sum);
	}

}
