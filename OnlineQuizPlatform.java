import java.util.*;
public class OnlineQuizPlatform{
	public static void main(String arg[]){
		Scanner ob =new Scanner(System.in);
		double balance=0.0;
		System.out.println("Welcome To Online Quiz Platform");
		boolean running=true;
		while(running){
			System.out.println("\nPlease Choose an option to continue:");
			System.out.println("1:Deposit");
			System.out.println("2:Withdraw");
			System.out.println("3:Check Blance");
			System.out.println("4:Exit");
			System.out.print("5:Enter your choice:");
			int choice=ob.nextInt();
			switch(choice){
				case 1:
				System.out.print("Enter the amount to deposit:");
				double DAmount=ob.nextDouble();
				if(DAmount!=0.0){
					balance+=DAmount;
					System.out.println("Successfully deposited "+DAmount);
					
				}
				else{
					System.out.println("Invaild amount");
				}
				break;
				
				case 2:
				System.out.print("Enter amount you want to withdraw:");
				double WAmount=ob.nextDouble();
				if(WAmount>0 && WAmount <=balance){
					balance-=WAmount;
					System.out.println("Successfully Withdraw amount:"+WAmount);
					
				}
				else if(WAmount>balance){
					System.out.println("Insufficient Balance");
					
				}
				else{
					System.out.println("Invaild amount");
				}
				break;
				
				case 3:
				
				System.out.println("Your Cureent Balance is:"+balance);
				break;
				
				case 4:
				running =false;
				System.out.println("Thank you using Online Quiz Platform");
				break;
				
				
				default:
				System.out.println("invaild choice retry");
				
			}
		}
	}

}