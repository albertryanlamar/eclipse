package day1;

public class classExample {
	

   private int a = 5;
    public int b = 6;
	static String fname1 = "Albert";
    String lname1 = "Lamar";
    
    final int x = 10;
    final double PI = 3.14;
    
    
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 =29;
		int num3 = 30;
		String fname = "Albert";
	    String lname = "Lamar";
		
        classExample akin = new classExample();//constructor create an instance of an object: class
        anotherclass other = new anotherclass();
        
       Person nsa = new Person();
       
       other.setNum(num3);
       System.out.println("Your number: " + other.getNum() );
       
       
       nsa.setName("Albert");
       String gname = nsa.getName();
       
       System.out.println("You entered: " + gname );
       
       
        
        //System.out.println("You entered: " + other.num1);
        System.out.println("You entered: " + akin.a);
        
        compute(num1, num2);
        method1();
        
        akin.printName(fname, lname);
        akin.aa();
       
  
        //print the value of the public variable
        System.out.println(akin.a + other.email);
        
        //final modifier in variable
	}
	
    static void method1() {
		
	System.out.println("My name first name is albert");	 
	
	}
	
	public void method2() {

    System.out.println("My name last name is Lamar"+ a);
	}
	
	
	static void compute(int a, int b) {//method with parameters a and b
		int result = a+b;
		System.out.println("the sum of the number is:" + result);
	}
	
	public void printName(String firstname, String lastname) {
		
		System.out.println(firstname + lastname);
	}
	
	private void aa()
	{
		
	}
	
	public static class Person {
		  private String name; // private = restricted access
		  private String namew;

		  // Getter
		  public String getName() {
		    return name;
		  }

		  // Setter
		  public void setName(String newName) {
		    this.name = newName;
		  }
		}

}






