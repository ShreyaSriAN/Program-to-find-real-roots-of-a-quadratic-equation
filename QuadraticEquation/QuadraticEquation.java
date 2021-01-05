package prog2;
import java.util.*;

public class QuadraticEquation {
	int a,b,c;
	double root1,root2,d;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Quadratic equation is in the form : ax^2+bx+c");
		System.out.println("Enter a: ");
		a=sc.nextInt();
		System.out.println("Enter b: ");
		b=sc.nextInt();
		System.out.println("Enter c: ");
		c=sc.nextInt();
		
	}
	
	void discriminant()
	{
		d=(b*b)-(4*a*c);
	}
	
	void calculate()
	{
		if(d>0)
		{
			System.out.println("Roots are real and unequal");
			root1=(-b+Math.sqrt(d))/(2*a);
			root2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("First Root is: "+root1);
			System.out.println("Second Root is: "+root2);
			
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal");
			root1=(-b+Math.sqrt(d))/(2*a);
			System.out.println("Root is: "+root1);
		}
		else
		{
			System.out.println("No real solutions. Roots are imaginary");
		}
	}
}
