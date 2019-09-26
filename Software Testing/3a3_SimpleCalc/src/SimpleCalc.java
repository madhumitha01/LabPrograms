
public class SimpleCalc {
	int compute(int ch, int a, int b) {
		switch(ch) {
		case 1: return (a+b);
		case 2: return (a-b);
		case 3: return (a*b);
		case 4: return (a/b);
		default: return -1;		
	}
  }
}
