import java.util.Scanner;

class palindromme{
	public static void main(String args[])	{
		int s=0,r=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int q=sc.nextInt();
		int k=q;
		while(q!=0){
			r=q%10;
			s=s*10+r;
			q=q/10;
		}
		if(s==k){
			System.out.print("palindromme number");
		}
		else{
			System.out.print("not a palindromme number");
		}
	}
}

