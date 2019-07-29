package practice_section;
import java.util.*;

public class Menu_Driven {
	
public static void main(String[] args) {
	
System.out.println("1). Find the factorial of program ");
System.out.println("2). find the prime number after the digit ");
System.out.println("3). Display fabonacci ");
 System.out.println("enter the value:");
Scanner input =  new Scanner(System.in);
int s=input.nextInt(); 
switch (s) {
case 1:
 int fact=1;
 System.out.println("enter the value the factorial you want");
Scanner u = new Scanner(System.in);
 int n=u.nextInt();
 for(int i=1;i<=n;i++)
 {
	 fact = fact*i;
 }
 System.out.println(fact);
 break;	
case 2:
	
Scanner pr = new Scanner(System.in);
System.out.println("enter the prime number");
int r= pr.nextInt();
int p=  r+1;
for(int i=2; i<=(p+1)/2;i++)
{
	if(p%i==0)
	{
	i=2;  
	p++;
	}
	
}
System.out.println(" "+p);
 
break;
case 3:
	 int fab,temp1=0,temp2=1;
	 Scanner y= new Scanner(System.in);
	
	System.out.println("enter the value the fabonacci  you want");
	
	 fab =y.nextInt();
	for(int index=1;index<=fab;index++)
	{
		System.out.print(temp1+ " ");
		int sum= temp1+temp2;
		temp1=temp2;
		temp2=sum;
		
		
	}
	
break;
}
System.out.println();
}}

		
		
		
	
	
	
	

	





 
	
	


