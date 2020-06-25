
public class NamaianNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "986085712";
		StringBuffer sb = new StringBuffer();
		int index =0, sum =0,j;
		for(int i=0; i<input1.length(); i=j+1)
		{
			sum = 0;
			if(input1.charAt(i) % 2 != 0)
			{
				for( j=index; j<input1.length();j++)
				{
					sum += (input1.charAt(j) - 48);
					
					if(sum % 2 == 0)
					{
						index = j+1;
						break;
					}
				}
				sb.append(sum);
				System.out.println(sum);
			}
			else
			{
				for(j=index; j<input1.length();j++)
				{
					sum += (input1.charAt(j) - 48);
					
					if(sum % 2 != 0)
					{
						index = j+1;
						break;
					}
				}
				sb.append(sum);
				System.out.println(sum);
			}
		}
		
		System.out.println(sb);
	}

}
