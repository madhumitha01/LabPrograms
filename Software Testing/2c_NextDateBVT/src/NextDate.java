public class NextDate {
	int d,m,y;
	NextDate(String str){
		String s[]=str.split("-");
		d=Integer.parseInt(s[0]);
		m=Integer.parseInt(s[1]);
		y=Integer.parseInt(s[2]);
 
	}
 
	String checkRange(){
		if((d<1 || d>31) && (m<1 || m>12) && (y<1812 || y>2012))
			return("Date, Month and Year are out of range");
		else if((d<1 || d>31) && (m<1 || m>12))
			return("Date and Month is out of range");
		else if((d<1 || d>31) && (y<1812 || y>2012))
			return("Date and Year is out of range");
		else if((m<1 || m>12) && (y<1812 || y>2012))
			return("Month and Year is out of range");
		else if(d<1 || d>31)
			return("Date is out of range");
		else if(m<1 || m>12)
			return("Month is out of range");
		else if(y<1812 || y>2012)
			return("Year is out of range");
		return "correct";
	}
 
	boolean isLeap(int year)
	{
		if(year%100==0 && year%400!=0)
			return false;
		else if(year%4!=0)
			return false;
		return true;
	}
 
	String nextDate(){
		if(!checkRange().equals("correct"))
			return checkRange();
		else if(m==2)
		{
			if(isLeap(y))
			{
				if((m==2) && (d>29))
					return "Invalid Date";
				else if((m==2) && (d==29))
				{
					m++;
					d=1;
				}
				else
					d++;
				return d + "-" + m + "-" + y;
			}
			else
			{
				if((m==2) && (d>28))
					return "Invalid Date";
				else if((m==2) && (d==28))
				{
					m++;
					d=1;
				}
				else
					d++;
				return d + "-" + m + "-" + y;
			}
		}
		else
		{
			if(((m==4) || (m==6) || (m==9) || (m==11)) && d==31)
				return "Invalid Date";
			else if(((m==4) || (m==6) || (m==9) || (m==11)) && d==30)
			{
				m++;
				d=1;
			}
			else if(((m==1) || (m==3) || (m==5) || (m==7) || (m==8) || (m==10)) && d==31)
			{
				m++;
				d=1;
			}
			else if((m==12) && d==31)
			{
				m=1;
				d=1;
				y++;
			}
			else
				d++;
			return d + "-" + m + "-" + y;
		}
	}
}