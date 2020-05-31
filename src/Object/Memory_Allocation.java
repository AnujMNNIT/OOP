
package Object;
/*In Java, when we only declare a variable of a class type, only a reference is created 
(memory is not allocated for the object). To allocate memory to an object, we must use new(). 
So the object is always allocated memory on heap (See this for more details).*/

class Test { 
      
// class contents 
void show()  
{ 
    System.out.println("Test::show() called"); 
} 
} 
  
public class Memory_Allocation { 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
          
        // all objects are dynamically  
        // allocated 
        Test t = new Test();  
        t.show(); // No error  
    } 
} 
