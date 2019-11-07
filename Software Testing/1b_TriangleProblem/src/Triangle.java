import java.util.Scanner;
 
public class Triangle {
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
 
		if(x<1 || x>200 ||y<1 || y>200 ||z<1 || z>200)
		{
			System.out.println("Not a Triangle");
			System.exit(0);
		}
 
		if((x+y)>z && (y+z)>x && (x+z)>y)
		{
			if(x==y && y==z)
				System.out.println("Equilateral triangle");
			else if(x!=y && y!=z && z!=x)
				System.out.println("Scalene triangle");
			else
				System.out.println("Isosceles triangle");
		}
		else
			System.out.println("Not a triangle");
	}
}