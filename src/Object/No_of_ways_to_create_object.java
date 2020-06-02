
package Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class No_of_ways_to_create_object
{
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException
    {
        String Path = "C:\\Users\\anuj\\Documents\\NetBeansProjects\\TestProject\\OOP\\src\\Object\\Anuj.java";
        // creating object of class Test
        Anuj anuj0=new Anuj("Anuj Singh",22);
        Anuj anuj1 = new Anuj("Anuj",20); //using new keyword
        //forName is a static method of class Class which return the class object associated with that class name
        Anuj anuj2 = (Anuj)Class.forName("Anuj").newInstance();  //constructr should be default 
        // clone() method is present in Object class. It creates and returns a copy of the object.
        /*Necessary Steps----->
        Make the class cloneable which you are going to clone via cloneable interface and override clone method of class Object
         */
         Anuj anuj3=(Anuj)((Anuj)anuj0).clone(); //JVM creates A new object and copies all the instances so constructor is not invoked here 
        //De-serialization is technique of reading an object from the saved state in a file
        //In serialization and deserialization object state is stored in file and recovered from file
        FileInputStream file = new FileInputStream(Path);
        ObjectInputStream in = new ObjectInputStream(file);
        Anuj anuj4  = (Anuj)in.readObject();
        /*create file of that filename create object inputstream and the create object of class  object and then typecast it*/ 
        System.out.println(anuj0.getName());
        System.out.println(anuj1.getName());
        System.out.println(anuj2.getName());
        System.out.println(anuj3.getName());
        System.out.println(anuj0);  
        System.out.println(anuj3);
        //Here creating multiple object with same reference(anuj5) if some object is no more referenced garbage collector destroys it
        Anuj anuj5 = new Anuj("Anuj Nicky",18);
        anuj5 = new Anuj("AnujSingh",21);
        System.out.println(anuj5);  
        System.out.println(anuj5);
        /*In case of inheritance we can use reference variable of parent class to store a subclass objectand thus can be switched 
          between multiple sub class objects which helps in reducing memory westage*/
        
    } 
}
