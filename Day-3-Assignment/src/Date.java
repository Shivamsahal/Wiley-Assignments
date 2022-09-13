
public class Date {
	int dd,mm,yy;
	
	public  Date(int dd, int mm,int yy ) {
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	boolean checkDate()
	{
		if(dd<32 && mm<13)
		return true;
		else 
			return false;
	}
	public void displayDate()
	{
		if(checkDate())
		System.out.println(dd+"/"+mm+"/"+yy);
		else 
		System.out.println("NOT Valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date ob = new Date(7,14,22);
		ob.displayDate();
		
;	}

}
