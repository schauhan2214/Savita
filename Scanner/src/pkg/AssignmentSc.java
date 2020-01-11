package pkg;

import java.util.Scanner;

public class AssignmentSc {
	int c;
	public int sum(int x1,int x2)
	{
		int sum;
		sum=x1+x2;
		System.out.println("Sum is:" +sum);	
		return sum;
		
	}

	public int sub(int x1,int x2)
	{
		int sub;
		sub=x1-x2;
		System.out.println("Sub is:" +sub);
		return sub;
		
	}
	public int mul(int x1,int x2)
	{
		int mul;
		mul=x1*x2;
		System.out.println("Mul is:" +mul);
		return mul;
		
	}
	public int div(int x1,int x2)
	{
		int div;
		div=x1/x2;
		System.out.println("Div is:" +div);
		return div;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result of expression :(((((x1+x2)-x3)+x4)*x5)/x6)");
		AssignmentSc obj= new AssignmentSc();
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1= obj1.nextInt();
		System.out.println("Enter the value of x2");
		int x2=obj1.nextInt();
		System.out.println("Enter the value of x3");
		int x3= obj1.nextInt();
		System.out.println("Enter the value of x4");
		int x4=obj1.nextInt();
		System.out.println("Enter the value of x5");
		int x5= obj1.nextInt();
		System.out.println("Enter the value of x6");
		int x6=obj1.nextInt();
		int c = obj.div(obj.mul(obj.sum(obj.sub(obj.sum(x1, x2), x3), x4), x5),x6);
		System.out.println("Final Result is:" +c);
		
		
		
		
	}

}
