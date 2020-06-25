
public class GetCodeThroughString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String input1 = "Wipro Technologies";
		String input1 = "The Good The Bad and The Ugly";
		
		int sum=0;
		String[] splited = input1.split("\\s+");

		for(int i=0; i<splited.length;i++)
		{
			sum += splited[i].length();
		}
		
		int num = 0;
		while(sum > 9)
		{
			num = 0;
			while(sum > 0)
			{
				int rem = sum % 10;
				num = num + rem;
				sum = sum / 10;
			}
		     sum = num;
		}
		System.out.println(sum);
	}
}
