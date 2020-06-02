/*
 1) Using ‘this’ keyword to refer current class instance variables
 2) Using this() to invoke current class constructor
 3) Using ‘this’ keyword to return the current class instance
 4) Using ‘this’ keyword as method parameter
 5) Using ‘this’ keyword to invoke current class method
 6) Using ‘this’ keyword as an argument in the constructor call
 */
package Keyword;

/**
 *
 * @author anuj
 */
//Java code for using 'this' keyword to 
//refer current class instance variables 
class Test 
{ 
	int a; 
	int b; 
	
	// Parameterized constructor 
	Test(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

	void display() 
	{ 
		//Displaying value of variables a and b 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(10, 20); 
		object.display(); 
	} 
} 
// Java code for using this() to 
// invoke current class constructor 
class Test 
{ 
	int a; 
	int b; 

	//Default constructor 
	Test() 
	{ 
		this(10, 20); 
		System.out.println("Inside default constructor \n"); 
	} 
	
	//Parameterized constructor 
	Test(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
		System.out.println("Inside parameterized constructor"); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(); 
	} 
} 

//Java code for using 'this' keyword 
//to return the current class instance 
class Test 
{ 
	int a; 
	int b; 

	//Default constructor 
	Test() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	//Method that returns current class instance 
	Test get() 
	{ 
		return this; 
	} 
	
	//Displaying value of variables a and b 
	void display() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(); 
		object.get().display(); 
	} 
} 

// Java code for using 'this' 
// keyword as method parameter 
class Test 
{ 
	int a; 
	int b; 
	
	// Default constructor 
	Test() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	// Method that receives 'this' keyword as parameter 
	void display(Test obj) 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

	// Method that returns current class instance 
	void get() 
	{ 
		display(this); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(); 
		object.get(); 
	} 
} 

// Java code for using this to invoke current 
// class method 
class Test { 

	void display() 
	{ 
		// calling function show() 
		this.show(); 
	
	System.out.println("Inside display function"); 
	} 
	
	void show() { 
		System.out.println("Inside show funcion"); 
	} 
	

	public static void main(String args[]) { 
		Test t1 = new Test(); 
		t1.display(); 
	} 
} 

// Java code for using this as an argument in constructor 
// call 
// Class with object of Class B as its data member 
class A 
{ 
	B obj; 
	
	// Parameterized constructor with object of B 
	// as a parameter 
	A(B obj) 
	{ 
		this.obj = obj; 
		
	// calling display method of class B 
		obj.display(); 
	} 
	
} 

class B 
{ 
	int x = 5; 
	
	// Default Contructor that create a object of A 
	// with passing this as an argument in the 
// constructor 
	B() 
	{ 
		A obj = new A(this); 
	} 
	
	// method to show value of x 
	void display() 
	{ 
		System.out.println("Value of x in Class B : " + x); 
	} 
	
	public static void main(String[] args) { 
		B obj = new B(); 
	} 
} 


public class This_Keyword
{
    
}
