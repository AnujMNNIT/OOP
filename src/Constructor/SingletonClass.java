/*
 We can use private constructors 
private constructors are used for 
1) Internal constructor chaining
2) Singleton class
a class is said to be singleton if it limits the number of objects of that class to one.
Singleton classes are employed extensively in concepts like Networking and Database Connectivity.
 */
package Constructor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 The constructor of singleton class would be private so there must be another way to get the instance of that class. 
 * This problem is resolved using a class member instance and a factory method to return the class member.
 * Difference in normal and singleton class in terms of instantiation is that, For normal class we use constructor, 
 * whereas for singleton class we use getInstance() to avoid confusion we can use the same name for method
 */
class Single
{
    static Single obj=null;
    private ServerSocket soc;
    private Single() throws IOException  //// private constructor can't be accessed outside the class 
    {
        soc=new ServerSocket(23546);
    }
    static public Single getInstance() throws IOException  // // Factory method to provide the users with instances 
    {
        if(obj==null)
            obj=new Single();
        return obj;          //It will return the same instance of serversocket
    }
   /* static public Single Single() throws IOException  // // Factory method to provide the users with instances 
    {
        if(obj==null)
            obj=new Single();
        return obj;          //It will return the same instance of serversocket
    }
    */
    ServerSocket getSocket() 
    {
        return this.soc;
    }
}
public class SingletonClass
{
   public static void main(String args[]) throws IOException
   {
       //Single s=Single.Single();
       Single s1=Single.getInstance();
       Single s2=Single.getInstance();
       ServerSocket server1=s1.getSocket();
       ServerSocket server2=s2.getSocket();
       System.out.println(s1.equals(s2));
       System.out.println(server1.equals(server2));
   }
}
