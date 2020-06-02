package Object;
import java.lang.reflect.*; 
/* This is similar to the newInstance() method of a class. There is one newInstance() method 
in the java.lang.reflect.Constructor class which we can use to create objects. It can also call 
parameterized constructor, and private constructor by using this newInstance() method.
Both newInstance() methods are known as reflective ways to create objects. In fact newInstance()
method of Class internally uses newInstance() method of Constructor class.*/

public class ReflectionExample 
{ 

	public static void main(String[] args) 
	{ 
		try
		{ 
			Constructor<Anuj> constructor = Anuj.class.getDeclaredConstructor(); 
			Anuj anuj = constructor.newInstance();
                        anuj.setName("Anuj");
			System.out.println(anuj.getName()); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
