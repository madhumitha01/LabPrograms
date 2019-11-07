public class Triangle {
	String compute(int a, int b, int c) {
		if((a<(b+c)) && (b<(a+c)) && (c<(a+b))) {
			if(a==b && b==c) {
				return "Equilateral Triangle";
			}
			else if(a==b || b==c || a==c) {
				return "Isosceles Triangle";
			}
			else {
				return "Scalene Triangle";
			}
		}
		else
		return "Not a Triangle";
	}
}

