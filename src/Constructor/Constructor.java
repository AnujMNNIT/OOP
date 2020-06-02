/*
 Constructors are used to initialize the object’s state. Like methods, a constructor also contains collection of statements(i.e. instructions)
that are executed at time of Object creation.
Each time an object is created using new() keyword at least one constructor (it could be default constructor) 
is invoked to assign initial values to the data members of the same class.
A constructor in Java can not be abstract, final, static and Synchronized.
There are no “return value” statements in constructor, but constructor returns current class instance. We can write ‘return’ inside a constructor.
 */
package Constructor;
import java.io.*; 

class Geek
{ 
	Geek(String name) 
	{ 
		System.out.println("Constructor with one " + 
					"argument - String : " + name); 
	} 
	Geek(String name, int age) 
	{ 

		System.out.println("Constructor with two arguments : " + 
				" String and Integer : " + name + " "+ age); 

	} 
	Geek(long id) 
	{ 
		System.out.println("Constructor with one argument : " + 
											"Long : " + id); 
	} 
} 

class Constructor 
{ 
	public static void main(String[] args) 
	{ 

		Geek geek2 = new Geek("Shikhar"); 
		Geek geek3 = new Geek("Dharmesh", 26); 
		Geek geek4 = new Geek(325614567); 
	} 
} 

