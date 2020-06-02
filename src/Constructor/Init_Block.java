
package Constructor;
/*Init block in any class runs first and in order in which they are declared 
It is used when we want to execute same code for each constructor while object creation 
*/
//Look into that link ....https://www.geeksforgeeks.org/g-fact-55/ (iportant concept)
class Init 
{ 
	// block to be executed before any constructor. 
	{ 
		System.out.println("init block"); 
	} 

	// no-arg constructor 
	Init() 
	{ 
		System.out.println("default"); 
	} 

	// constructor with one arguemnt. 
	Init(int x) 
	{ 
		System.out.println(x); 
	} 
} 

public class Init_Block
{
    
    public static void main(String[] args) 
	{ 
		// Object creation by calling no-argument 
		// constructor. 
		new Temp(); 

		// Object creation by calling parameterized 
		// constructor with one parameter. 
		new Temp(10); 
	} 
}
