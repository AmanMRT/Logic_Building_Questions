
public class SumofPowerofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 582109;
		String str = Integer.toString(input1);
		int sum = 0;

		for(int i=0; i<str.length()-1; i++)
		{
			double a = str.charAt(i) - 48;
			double b = str.charAt(i+1) - 48;
			sum += Math.pow(a, b);
		}
		sum += 1;
		System.out.print(sum);
	}

}
