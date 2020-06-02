/*
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under 
creational pattern as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client
and refer to newly created object using a common interface.
 */
package DesignPattern;
//Step 1 create an interface ................................................................
interface shape                   //Interface
{
    void draw();
}
// Step 2 Create concrete classes implementing the same interface ...........................
class Rectangle implements shape  //These are the classes of which we have to create object and user will not anything about creational logic
{
    @Override
    public void draw()
    {
        System.out.println("Rectangle:");
    }
}
class Circle implements shape     //These are the classes of which we have to create object and user will not anything about creational logic
{
    @Override
    public void draw()
    {
        System.out.println("Circle:");
    }
}

class Triangle implements shape    //These are the classes of which we have to create object and user will not anything about creational logic
{
    public void draw()
    {
       System.out.println("Triangle:");
    }
}

// Step 3 Create a Factory to generate object of concrete class based on given information...................................................
class Factory
{
    shape getShape(String Type)
    {
        if(Type==null)
            return null;
       if(Type.equalsIgnoreCase("CIRCLE"))
       {
         return new Circle();  
       } 
       else if(Type.equalsIgnoreCase("RECTANGLE"))
       {
         return new Rectangle();  
       }
       else if(Type.equalsIgnoreCase("Triangle"))
       {
         return new Triangle();
       } 
       return null;
   }
}
public class Factory_Pattern
{
    public static void main(String args[])
    {
        //Create an object of factory...................................................
        Factory factory =new Factory();
        shape shape1=factory.getShape("CIRCLE");  
        /* Here user only know about shape interface and factory .........methods of shape interface is overridden by different classes
           Object reference is of shape interface */ 
        shape1.draw();
        shape shape2=factory.getShape("RECTANGLE");
        shape2.draw();   
    }
    
}
