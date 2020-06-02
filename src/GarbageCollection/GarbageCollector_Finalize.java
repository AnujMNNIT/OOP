
package GarbageCollection;
/*Just before destroying an object, Garbage Collector calls finalize() method on the object to perform 
cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.
finalize() method is present in Object class with following prototype.
protected void finalize() throws Throwable
Based on our requirement, we can override finalize() method for perform our cleanup activities 
like closing connection from database.*/


/*The finalize() method called by Garbage Collector not JVM. Although Garbage Collector is one of the module of JVM.
Object class finalize() method has empty implementation, thus it is recommended to override finalize() method to dispose of system resources or to perform other cleanup.
The finalize() method is never invoked more than once for any given object.
If an uncaught exception is thrown by the finalize() method, the exception is ignored and finalization of that object terminates.*/
class Anuj
{
    String Name;
    int age;
    static private int cnt=0;
    Anuj(String Name,int age)
    {
        this.Name=Name;
        this.age=age;
    }
    void print()
    {
        System.out.println(Name+" : "+age);
    }
    @Override
    protected void finalize()   //Here we are overriding finalize method
    {
        System.out.println(this +"will be destroyed");
    }
}

public class GarbageCollector_Finalize
{
    public static void main(String args[])
    {
        Anuj a1=new Anuj("Anuj Singh",21);  //nulifying the reference variable  
        Anuj a2=new Anuj("Anuj",20);    
        a1=null;  
        System.gc();
        a2=new Anuj("Anuj Singhania ",21);   //reassigning the reference variable
        System.gc();
        System.out.println("Hello");
        System.out.println(new Anuj("SinghAnuj",19));  //Object created inside method
        System.gc();
    }
}
