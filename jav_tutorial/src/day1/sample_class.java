package day1;


public class sample_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 = 2;
		int result1 = num1 + num2;
		
		//Create instance of a class to access the method compute
		sample_class cl1 = new sample_class();
		
		//method call without param
		cl1.method2();//call the public void compute	
		method1();//call of static	
		
		//method call with parameters
		cl1.compute(result1,num2, num1);	
		cl1.printName("Albert");

	}
	//method without param
	public static void method1() 
	{
		System.out.println("hello word");
	}
	public void method2() 
	{
		System.out.println("hello universe");
	}
	public void jude() 
	{
		System.out.println("Si Jude ay budol ng taon");
	}
	
	//method with parameters
	public int compute(int a, int b, int c) 
	{
		int result = a+b;	
		return result;
	}
	
	public void printName(String fname) 
	{
		System.out.println("My firstname is " + fname);    
	}



}




