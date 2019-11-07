import java.util.Scanner;
 
public class Atm {
 
	int pin,amount;
 
	Atm(int p, int a)
	{
		pin=p;
		amount=a;
	}
 
	boolean validatePin()
	{
		Scanner sc= new Scanner(System.in);
		int t=2;
		while(true){
			System.out.print("Enter pin : ");
			int pwd=sc.nextInt();
			if(pwd==1234){
				break;
			}
			if(t==0){
				System.out.println("Wrong password! Too many attempts");
				return false;
			}
			System.out.println("Wrong Password");
			t--;
		}
		return true;
	}
 
	boolean accountType()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("\nSelect account type \n1:Saving \n2:Current\n");
		int type=sc.nextInt();
		if(type!=1 && type!=2){
			System.out.println("Invalid account type");
			return false;
		}
		return true;
	}
 
	void mainMenu()
	{
		Scanner sc= new Scanner(System.in);
		int ch=1,x;
		while(ch!=4)
		{
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Display");
			System.out.println("4: Exit");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter amount to deposit : ");
				x=sc.nextInt();
				this.amount+=x;
				System.out.println("Done");
				System.out.println("Account balance : " + this.amount + "\n");
			}
			else if(ch==2)
			{
				System.out.println("Enter amount to withdraw : ");
				x=sc.nextInt();
				if(this.amount>=x)
				{
					if(x%100==0)
					{
						this.amount-=x;
						System.out.println("Done");
						System.out.println("Account balance : " + this.amount + "\n");
					}
					else
					{
						System.out.println("Enter amount in multiple of 100\n");
					}
				}
				else
				{
					System.out.println("Low Balance");
				}
			}
			else if(ch==3)
			{
				System.out.println("Account balance : " + this.amount);
			}
			else if(ch==4)
			{
				System.out.println("Thank You for banking with us");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
	}
 
	public static void main(String[] args) {
 
		Atm a=new Atm(1234,10000);
 
		if(a.validatePin())
		{
			if(a.accountType())
			{
				a.mainMenu();
			}
 
			else
				System.exit(0);
		}
		else
			System.exit(0);
	}
}