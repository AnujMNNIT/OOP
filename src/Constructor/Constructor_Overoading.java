/*
 In addition to overloading methods, we can also overload constructors in java.
 Overloaded constructor is called based upon the parameters specified when new is executed.
Thread class has 8 types of constructors. If we do not want to specify anything about a thread 
then we can simply use default constructor of Thread class, however if we need to specify thread name,
then we may call the parameterized constructor of Thread class with a String args like this:
Recursive constructor calling is invalid in java.
Constructor calling must be the first statement of constructor in Java.
There is no destructor in java  Because Java is a garbage collected language you cannot predict
when (or even if) an object will be destroyed. Hence there is no direct equivalent of a destructor.
 */
package Constructor;

/**
 *
 * @author anuj
 */
// Java program to illustrate 
// Constructor Overloading 
class Box 
{ 
	double width, height, depth; 

	// constructor used when all dimensions 
	// specified 
	Box(double w, double h, double d) 
	{ 
		width = w; 
		height = h; 
		depth = d; 
	} 

	// constructor used when no dimensions 
	// specified 
	Box() 
	{ 
		width = height = depth = 0; 
	} 

	// constructor used when cube is created 
	Box(double len) 
	{ 
		width = height = depth = len; 
	} 

	// compute and return volume 
	double volume() 
	{ 
		return width * height * depth; 
	} 
} 

// Driver code 
public class Constructor_Overoading
{ 
	public static void main(String args[]) 
	{ 
		// create boxes using the various 
		// constructors 
		Box mybox1 = new Box(10, 20, 15); 
		Box mybox2 = new Box(); 
		Box mycube = new Box(7); 

		double vol; 

		// get volume of first box 
		vol = mybox1.volume(); 
		System.out.println(" Volume of mybox1 is " + vol); 

		// get volume of second box 
		vol = mybox2.volume(); 
		System.out.println(" Volume of mybox2 is " + vol); 

		// get volume of cube 
		vol = mycube.volume(); 
		System.out.println(" Volume of mycube is " + vol); 
	} 
} 
