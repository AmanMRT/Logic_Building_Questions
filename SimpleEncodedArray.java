
public class SimpleEncodedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {7,6,8,16,12,3};
		int input2 = input1.length;
		
		int sum = 0;
		int[] arr = new int[input2];
		arr[input2-1] = input1[input2-1];

		for(int i=input2-1; i>0; i--)
		{
			arr[i-1] = (input1[i-1] - arr[i] );
			sum +=  arr[i-1];
		}
		
		sum += arr[input2-1];
		System.out.println(arr[0] + " " + sum);
		
		//Result r = new Result (arr[0],sum);
	}

}
