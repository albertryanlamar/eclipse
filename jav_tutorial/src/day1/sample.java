package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class sample {
	
    public String fname = "John";
    public String lname = "Doe";
    public String email = "john@doe.com";
    public int age = 24;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*		
    ArrayList<String> cars = new ArrayList<String>();  
    cars.add("toyota");
    cars.add("Jeep");
    cars.add("ford");
    cars.add("Cars");
    cars.add("Jude Cars");
    
   String as = cars.get(4);
   System.out.println("Array list Value: " + as);
    
   cars.set(0, "akin");
   System.out.println("Array list Value: " + cars.get(0));
    
   cars.remove(0);
   System.out.println("Array list Value: " + cars.get(0));
    
   // System.out.println("Array list Value: " + cars.size());
    
    for(int i=0; i<cars.size(); i++) 
    {
    	System.out.println("Index: " + i +" Value: "+ cars.get(i));
    }
    
    for(String ab: cars ) {
    	
    	System.out.println("Value:"+ ab);
    	
    }
    */
		
		HashMap<String, String> hash = new HashMap<String, String>();
		        
		//add in hashmap
		hash.put("k","Albert" ); // Name: Albert
		hash.put("Age", "25");   //Age: 25
		hash.put("Gender", "Male"); //Gender: Male
		
		//System.out.println(hash);//print all the value of the hashmap
		
		//get individual value
		System.out.println(hash.get("Age"));
		
		//remove
		//hash.remove("Age");
		//System.out.println(hash);
		
		//System.out.println(hash.size());
		//int ss = hash.size();
		
		
		//for each loop
		//for(String aa: hash.values()) {	//values() para makuha mga values	
		//	System.out.println(aa);
		//}
		//display the key of our hashmap
		for(String aa: hash.keySet()) {//keyset() ito para nakuha yung mga keys sa hashmap natin
			System.out.println("Key: "+ aa + " and " + "Value: " + hash.get(aa)); //Gender
		}
		
		//display all keys and values
		for(Entry<String, String> keyvalue: hash.entrySet()) {//kukunin nya yung set ng entry natin	
			System.out.println(keyvalue);
		}
		
		

		
    
    
    
	}

}
