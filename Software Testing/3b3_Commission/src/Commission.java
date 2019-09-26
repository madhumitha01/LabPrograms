
public class Commission {
	double compute (int tlocks, int tstocks, int tbarrels) {
		double comm;
		int sales= 45*tlocks + 30*tstocks + 25*tbarrels;
		if(tlocks>0 && tstocks>0 && tbarrels>0) {
			  if(sales > 1800.0){    
				  comm=0.10*1000.0;    
				  comm=comm+0.15*800;    
				  comm=comm+0.20*(sales-1800.0);   
			  }   
			  else if(sales > 1000){    
				  comm =0.10*1000;    
				  comm=comm+0.15*(sales-1000);   
			  }   
			  else    
				  comm=0.10*sales;        
			  return comm;  
			}
		return -1.0;
		}
		
	}


