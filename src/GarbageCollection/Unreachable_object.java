/*
 An object is eligible to be garbage collected if its reference variable is lost from the program 
during execution.Sometimes they are also called unreachable objects.
 */
package GarbageCollection;

/**
 The new operator dynamically allocates memory for an object and returns a reference to it.
 * This reference is the address in memory of the object allocated by new. A reference is an
   address that indicates where an object’s variables, methods etc. are stored.
   The objects are not actually used when assigned to a variable or passed as an argument to a method .
   The references to objects are used everywhere. 
 */

/*In java, the memory allocated at runtime i.e. heap area can be made free by the process of garbage collection.
It is nothing but just a method of making the memory free which is not being used by the programmer.
Only the objects who have no longer reference to them are eligible for garbage collection in java.
object can not become a candidate for garbage collection until all references to it are discarded.
*/
class Sample
{
    private int cnt;
    Sample(int cnt)
    {
        this.cnt=cnt;
    }
    void print()
    {
        System.out.println("Cnt is : "+cnt);
    }
    Sample getNew()
    {
        return new Sample(20178020);
    }
    @Override
    public void finalize()
    {
        System.out.println(this+" will be destroyed ");
    }
    @Override
    public int hashCode()   // I am overriding this hash function to identify the object which will be distroyed
    {
        return cnt;
    }
 
}
public class Unreachable_object 
{
    public static void main(String args[])
    {
        /*Object created inside a method : When a method is called it goes inside the stack frame. 
        When the method is popped from the stack, all its members dies and if some objects were created
        inside it then these objects becomes unreachable or anonymous after method execution and thus 
        becomes eligible for garbage collection*/
        System.out.println(new Sample(20174030));
        System.gc();
        Sample sample=new Sample(20179002);
        sample.getNew();   //Here returned object is not referenced
        /*If a method returns the object created inside it and we store this object reference by using a 
        reference-type variable than it is no longer eligible for garbage collection.*/
        System.gc();
        sample=new Sample(20170123); //Reassigning the reference variable
      //  System.out.println(markedBit(sample));
        System.gc();
        sample=new Sample(20172020);
        sample=null; //nullifying the reference variable
        System.gc();
        new Sample(20184030);  //reference id of anonymous object is not stored anywhere so it will be unreachable
        System.gc();
        
        
    }
}
