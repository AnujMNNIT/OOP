/*
 Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.
Constructor chaining occurs through inheritance. A sub class constructor’s task is to call super class’s constructor first.
This ensures that creation of sub class’s object starts with the initialization of the data members of the super class. 
There could be any numbers of classes in inheritance chain. Every constructor calls up the chain till class at the top is reached.

Constructor chaining is used to make code more readable
 */
package Constructor;

// within same class Using this() keyword 
class Temp 
{ 
    // default constructor 1 
    // default constructor will call another constructor 
    // using this keyword from same class 
    Temp() 
    { 
        // calls constructor 2 
        this(5); 
        System.out.println("The Default constructor"); 
    } 
  
    // parameterized constructor 2 
    Temp(int x) 
    { 
        // calls constructor 3 
        this(5, 15); 
        System.out.println(x); 
    } 
  
    // parameterized constructor 3 
    Temp(int x, int y) 
    { 
        System.out.println(x * y); 
    } 
} 
public class Constructor_chain 
{
    public static void main(String args[]) 
    { 
        // invokes default constructor first 
        new Temp(); 
    } 
}
