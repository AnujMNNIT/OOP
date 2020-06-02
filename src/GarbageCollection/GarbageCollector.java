/*
 In C/C++, programmer is responsible for both creation and destruction of objects. Usually programmer neglects
destruction of useless objects. Due to this negligence, at certain point, for creation of new objects, sufficient 
memory may not be available and entire program will terminate abnormally causing OutOfMemoryErrors.
But in Java, the programmer need not to care for all those objects which are no longer in use. Garbage collector destroys these objects.
Garbage collector is best example of Daemon thread as it is always running in background.
Main objective of Garbage Collector is to free heap memory by destroying unreachable objects.
 */
package GarbageCollection;

/**
 Unreachable objects : An object is said to be unreachable if it doesn’t contain any reference to it. Also note that objects which are part of island of isolation are also unreachable.
 Eligibility for garbage collection : An object is said to be eligible for GC(garbage collection) if it is unreachable.
 */

//Users are recommended to make object unreachable which are no longer in use
/*
   Nullifying the reference variable
   Re-assigning the reference variable
   Object created inside method
   Island of Isolation
*/

/*Once we made object eligible for garbage collection, it may not destroy immediately by the garbage collector.
Whenever JVM runs the Garbage Collector program, then only the object will be destroyed. But when JVM runs Garbage 
Collector, we can not expect.*/

/*Using System.gc() method : System class contain static method gc() for requesting JVM to run Garbage Collector.
Using Runtime.getRuntime().gc() method : Runtime class allows the application to interface with the JVM in which the
application is running. Hence by using its gc() method, we can request JVM to run Garbage Collector.*/

public class GarbageCollector
{
     public static void main(String[] args) throws InterruptedException 
    { 
        GarbageCollector t1 = new GarbageCollector(); 
        GarbageCollector t2 = new GarbageCollector(); 
          
        // Nullifying the reference variable 
        t1 = null; 
          
        // requesting JVM for running Garbage Collector 
        System.gc(); 
          
        // Nullifying the reference variable 
        t2 = null; 
          
        // requesting JVM for running Garbage Collector 
        Runtime.getRuntime().gc(); 
      
    } 
      
    @Override
    // finalize method is called on object once  
    // before garbage collecting it 
    protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 
    
}
