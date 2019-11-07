public class NextDate{
	String caldate(int d,int m,int y){
		String str="";
		if(y<1822 || y>2012)
			str = "|year invalid|";
		if((m<1 || m>12))
			str=str+ "|month invalid|";
		if((m==4 || m==6 || m==9 || m==11) && (d<1 || d>30))
			str = str+"|day invalid|";
		else if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) && (d<1 || d>31))
			str= str+"|day invalid|";
		else if(m==2){
			if((y%4 == 0 && y%100!=0) || (y%400==0)){
				if(d<1 || d>29) 
					str=str+"|day invalid|";
			}
			else if(d<1 || d>28)
				str=str+"|day invalid|";
		}
		else if(d<1 || d>31)
			str=str+"|day invalid|";
		if(str!="")
			return str; 
		
			if( m==4 || m==6 || m==9 || m==11){
				if(d==30){
					d=1;
					m=m+1;
				}
				else
					d=d+1;
			}
			else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
				if(d==31){
					if(m==12){
						d=1;
						y=y+1;
						m=1;
					}
					else{
						d=1;
						m=m+1;
					}
				}
				else
					d=d+1;
			}
		else{
			if((y%4 == 0 && y%100!=0) || (y%400==0)){
			 if(d==29){
				d=1;
				m=m+1;
			}
			else
				d=d+1;
		}
		else{
			if(d==28){
				m=m+1;
				d=1;
			}
			else
				d=d+1;
		              }	
		}
		return d+"/"+m+"/"+y;
	}
}
