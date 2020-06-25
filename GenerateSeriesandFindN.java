
public class GenerateSeriesandFindN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1 =1, input2 = 3, input3 =6, input4 = 17;
		
		int[] arr = new int[input4];
		arr[0] = (input1);
		arr[1] = (input2);
		arr[2] = (input3);

		for(int i=0; i<input4-3; i++)
		{
			arr[i+3] = arr[i+2] +(arr[i+1] - arr[i]);
		}

		//System.out.print("-"+arr[input4-1]);

		if(input1<0)
		{
			System.out.print(Integer.parseInt("-"+arr[input4-1]));
		}
		else
		{
			System.out.print(arr[input4-1]);
		}
	}

}
