/*
 Object class is present in java.lang package. Every class in Java is directly or indirectly derived from
the Object class. If a Class does not extend any other class then it is direct child class of Object and 
if extends other class then it is an indirectly derived. Therefore the Object class methods are available 
to all Java classes. Hence Object class acts as a root of inheritance hierarchy in any Java Program.
 */
package Object;

public class Object
{
    public static void main(String srgs[])
    {
        Anuj a=new Anuj("Anuj Singh",20);
        //Object class is parent class of every class directly or indirectly so we can override method of parent class
        /* Methods of object class are --------------->
           toString()
           hashcode()
           clone()
           equals()
           getclass()
           finalize()
           wait()
           notify()
           notifyall()
        */
        Anuj an=new Anuj("Anuj",19);
        Anuj anuj=an;
        System.out.println(a.toString());
        System.out.println(a);  //This method by default calls toString() method
        
        System.out.println(a.hashCode()); //JVM creates unique hashcode for every object.........It converts internal address of object to an integer using an algorithm
        //JVM uses hashcode to search objects from hash related datastructure which it is use to store objects...Searching becomes easy
        
        
        System.out.println(a.equals(an));
        System.out.println(an.equals(anuj));
        
        // getClass() returns the class object of this object and is used to get actual runtime class of the object It can also be used to get metadata of class
        System.out.println(a.getClass().getName());
        /*:After loading a .class file, JVM will create an object of the type java.lang.Class in the Heap area.
        We can use this class object to get Class level information.*/
        
        /*This method is called just before an object is garbage collected. It is called by the Garbage Collector on an object when garbage 
        collector determines that there are no more references to the object. We should override finalize() method to dispose system resources, 
        perform clean-up activities and minimize memory leaks. For example before destroying Servlet objects web container, always called finalize
        method to perform clean-up activities of the session. Finalise method can be overrided */
        System.gc();
        an=new Anuj("Anuj Nicky",21);
        anuj=new Anuj("Anuj Singhania",20);
        //Second Object created from beginning is no more refernced hence garbage collector removes from heap area and hence finalize() method is called by garbage collector
        System.gc();
        
    }
}
/*
Object.Anuj@15db9742
Object.Anuj@15db9742
366712642
false
true
Object.Anuj
Finalize is called
*/