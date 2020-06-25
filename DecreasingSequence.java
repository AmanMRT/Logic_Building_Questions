
public class DecreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {11,3,1,4,7,8,12,2,3,7};
		
		int count =0, currlen=0, flag=0, maxlen=0;
		for(int i=0; i<input1.length-1;i++)
		{
			if(input1[i] > input1[i+1])
			{
				if(flag == 0)
				{
					flag = 1;
					count++;
				}
			
				currlen++;
			
				if(currlen > maxlen)
				{
					maxlen = currlen;
				}
			}
			else
			{
				if(flag == 1)
				{
					flag = 0;
					currlen = 0;
				}
			}
		}
			if(count > 0)
			{
				 maxlen++;
			}
			
			System.out.println(count + " " + maxlen);
			//Result r = new Result(count, maxlen);
	//return r;
	}

}
