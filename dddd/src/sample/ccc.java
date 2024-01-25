package sample;

public class ccc {
	
    // A method in the class
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an object of the class
    	ccc calculator = new ccc();

        // Calling the method on the object
        int result = calculator.addNumbers(3, 5);
        System.out.println("Result: " + result);
    }

}

