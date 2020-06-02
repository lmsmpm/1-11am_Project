import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		int num,sum=0;
		int temp;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		temp=num;
		while(num>0){
		   n=num%10;
		   sum=sum+(n*n*n);
		   num=num/10;
		}
		if(sum==temp)
		      System.out.println(temp+"is armstrong number");
		else
			    System.out.println(temp+"is not an armstrong number");
	}
}
