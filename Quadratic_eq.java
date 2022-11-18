import java.util.Scanner;

class Quadratic_eq
{
	 public static void main(String args[])
{
	  	double a,b,c,d,r1,r2;
		System.out.println("Enter the value of coefficient");
		Scanner s = new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		
		d=(b*b)-4*a*c;
		if(a==0)
		System.out.println("invalid input");
		
		else if(d>0)
		{
		r1=(-b + Math.sqrt(d))/(2*a);
		r2=(-b - Math.sqrt(d))/(2*a);
		System.out.println("roots are real and distint , values are:" + r1 + "and" + r2);
		}
		else if (d==0)
		{
		r1 = -b/(2*a);
		System.out.println("roots are equal and value is " + r1);
		}
		else
		System.out.println("roots are not real");
}
}


