
public class Robot_Movement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input1 =3 ,input2=3 ;
		String input3 ="2-2-E", input4="R M L M L M";
		
		String[] path = input3.split("\\-+");
		int x = Integer.parseInt(path[0]);
		int y = Integer.parseInt(path[1]);

		String pos = path[2];
		String[] arr = input4.split("\\s+");
		int f = 0;

		for(String s : arr)
		{
			if(s.equals("R"))
			{
				if(pos.equals("N"))
				{
					pos = "E";
				}
				else if(pos.equals("E"))
				{
					pos = "S";
				}
				else if(pos.equals("S"))
				{
					pos = "W";
				}
				else
				{
					pos = "N";
				}
			}
			else if(s.equals("L"))
			{
				if(pos.equals("N"))
				{
					pos = "W";
				}
				else if(pos.equals("E"))
				{
					pos = "N";
				}
				else if(pos.equals("S"))
				{
					pos = "E";
				}
				else
				{
					pos = "S";
				}
			}
			else if(f!=1)
			{
				if(pos.equals("N"))
				{
					if(input2 > y)
					{
						y++;
					}
					else
					{
						f =1;
					}
				}
				else if(pos.equals("S"))
				{
					if(y > 0)
					{
						y--;
					}
					else
					{
						f = 1;
					}
				}
				else if(pos.equals("E"))
				{
					if(input1 > x)
					{
						x++;
					}
					else
					{
						f = 1;
					}
				}
				else
				{
					if(x > 0)
					{
						x--;
					}
					else
					{
						f = 1;
					}
				}
			}
		} 

		if(f != 1)
		{
			System.out.println(String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(pos));
		}
		else
		{
			System.out.println(String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(pos)+"-"+"ER");
		}
	}

}
