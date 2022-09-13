

public class Day3 {
	public void forloop(int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(i);
		}
	}
	public void whileloop(int num)
	{
		while(num>0)
		{
			System.out.println(num);
			num--;
		}
	}
	public void ifelse(int num)
	{
		if(num%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
	public void switchCase(int num)
	{
		switch(num)
		{
		 case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
		
		}
	}
 public static void main(String[] args) {
	 Day3 ob =new Day3();
	ob.forloop(3);
	ob.whileloop(3);
	ob.ifelse(4);
	ob.switchCase(2);
}
}
