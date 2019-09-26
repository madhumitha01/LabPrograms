public class Triangle {
	String compute(int a, int b, int c) {
		if((a>0 && a<201) || (b>0 && b<201) || (c>0 && c<201))
			if((a>0 && a<201) || (b>0 && b<201))
				if((b>0 && b<201) || (c>0 && c<201))
					if((a>0 && a<201) || (c>0 && c<201))
			if(a>0 && a<201)
				if(b>0 && b<201)
					if(c>0 && c<201)
						if(a<b+c && b<c+a && c<a+b) {
							if(a==b && b==c)
								return "Equilateral Triangle";
							else if(a==b || b==c || c==a)
								return "Isosceles Triangle";
							else
								return "Scalene Triangle";
						}
						else
							return "Not a Triangle";
					else
						return "c not in range";
				else
					return "b not in range";
			else
				return "a not in range";
					else
						return "a and c not in range";
				else
					return "b and c not in range";
			else
				return "a and b not in range";
		else
			return "a,b,c not in range";
	}
}