
package Exception;

/*handling the exception without maintaining the order of exceptions 
(i.e. from most specific to most general). leads to compile-time-error.
*/
class MultipleCatchBlock5{    
  
}
public class OrderOfCatchBlocks {
    public static void main(String args[]){    
   try{    
    int a[]=new int[5];    
    a[5]=30/0;    
   }    
   catch(Exception e){System.out.println("common task completed");}    
   catch(ArithmeticException e){System.out.println("task1 is completed");}    
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}    
   System.out.println("rest of the code...");    
 }    
}
