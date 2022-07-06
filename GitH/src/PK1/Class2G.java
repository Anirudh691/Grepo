package PK1;

import PK1.Class2G;

public class Class2G {


	public int sum(int a,int b) //Class work
	{
	int c=a+b;
	System.out.println("Sum of number"+c);
	return c;
	}
	
	public int sub(int x, int y) 
	{
	int z=x+y;
	System.out.println("Diffrence of number"+z);
	return z;
	}
	
	public void multi(int x1,int x2)
	{
		int x3=x1*x2;
		System.out.println("Final Result of number"+x3);
				
	}
	
	public static void main(String[] args) 
	{
		Class2G ob=new Class2G();
		int sumresult=ob.sum(10, 2); //Flow without int sumresult here????
		int subresult=ob.sub(10, 2);
		ob.multi(sumresult,subresult);
		
	}

}
