/*super() should be the first line of the constructor as super class’s constructor are invoked before the sub class’s constructor.*/
package Constructor;
// Java program to illustrate Constructor Chaining to 
// other class using super() keyword 
class Base 
{ 
	String name; 

	// constructor 1 
	Base() 
	{ 
		this(""); 
		System.out.println("No-argument constructor of" + " base class"); 
	} 

	// constructor 2 
	Base(String name) 
	{ 
		this.name = name; 
		System.out.println("Calling parameterized constructor"+ " of base"); 
	} 
} 

class Derived extends Base 
{ 
	// constructor 3 
	Derived() 
	{ 
                //Here default constructor of parent class is called automatically
		System.out.println("No-argument constructor " + "of derived"); 
	} 

	// parameterized constructor 4 
	Derived(String name) 
	{ 
		// invokes base class constructor 2 
		super(name); 
		System.out.println("Calling parameterized " + "constructor of derived"); 
        }
} 

public class Constructor_chain_using_super
{
        public static void main(String args[]) 
	{ 
		// calls parameterized constructor 4 
		Derived obj1 = new Derived("test"); 

		// Calls No-argument constructor 
		Derived obj2 = new Derived(); 
	} 
    
}
